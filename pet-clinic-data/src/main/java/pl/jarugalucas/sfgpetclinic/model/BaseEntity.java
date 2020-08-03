package pl.jarugalucas.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //id could be long but Hibernate recommends to use Wrappers, because they can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
