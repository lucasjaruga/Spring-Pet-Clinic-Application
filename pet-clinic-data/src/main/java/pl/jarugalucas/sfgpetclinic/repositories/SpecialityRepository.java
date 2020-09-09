package pl.jarugalucas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}