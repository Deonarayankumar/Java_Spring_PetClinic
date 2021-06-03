package com.example.java_spring_petclinic.services;

import com.example.java_spring_petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
