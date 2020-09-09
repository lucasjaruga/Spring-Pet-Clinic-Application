package pl.jarugalucas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}