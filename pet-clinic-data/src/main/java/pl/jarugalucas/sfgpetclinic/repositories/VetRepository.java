package pl.jarugalucas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}