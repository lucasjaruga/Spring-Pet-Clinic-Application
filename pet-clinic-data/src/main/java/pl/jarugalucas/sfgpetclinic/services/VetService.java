package pl.jarugalucas.sfgpetclinic.services;

import pl.jarugalucas.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
