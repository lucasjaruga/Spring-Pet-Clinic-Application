package pl.jarugalucas.sfgpetclinic.services;

import pl.jarugalucas.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
