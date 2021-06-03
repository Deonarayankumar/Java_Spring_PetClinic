package com.example.java_spring_petclinic.services.map;

import com.example.java_spring_petclinic.model.Owner;
import com.example.java_spring_petclinic.services.CrudService;
import org.yaml.snakeyaml.events.Event;


import java.util.Set;

public class OwnerServiceMap extends AbsractMapService<Owner, Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
