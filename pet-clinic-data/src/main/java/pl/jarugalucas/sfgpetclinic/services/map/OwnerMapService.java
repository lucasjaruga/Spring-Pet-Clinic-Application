package pl.jarugalucas.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.jarugalucas.sfgpetclinic.model.Owner;
import pl.jarugalucas.sfgpetclinic.model.Pet;
import pl.jarugalucas.sfgpetclinic.services.OwnerService;
import pl.jarugalucas.sfgpetclinic.services.PetService;
import pl.jarugalucas.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        // if object is null return null, in other case proceeds
        if(object != null) {
            // if this Owner has pets
            if (object.getPets() != null){
                // verify pets
                object.getPets().forEach(pet -> {
                    // and if pets have their type
                    if (pet.getPetType() != null) {
                        // verify if they don't have an ID then they should be saved in database
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required!");
                    }

                    // has pet been saved? if pet id is null it means it wasn't saved
                    if(pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}