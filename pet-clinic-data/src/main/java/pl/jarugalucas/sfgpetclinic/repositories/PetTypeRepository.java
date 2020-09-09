package pl.jarugalucas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}