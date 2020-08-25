package pl.jarugalucas.sfgpetclinic.services;

import pl.jarugalucas.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}