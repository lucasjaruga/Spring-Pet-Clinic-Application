package pl.jarugalucas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}