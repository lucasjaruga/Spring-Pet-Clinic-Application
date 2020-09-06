package pl.jarugalucas.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.jarugalucas.sfgpetclinic.model.Specialty;
import pl.jarugalucas.sfgpetclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialitiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}