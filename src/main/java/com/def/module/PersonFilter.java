package com.def.module;

import com.def.entity.Person;

import java.util.List;

public interface PersonFilter {
    List<Person> filter(Person currentPerson,List<Person> persons);
}
