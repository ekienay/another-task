package com.def;


import com.def.entity.Person;
import com.def.module.Filter;
import com.def.module.PersonBuilder;
import com.def.module.PersonFilter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     PersonBuilder builder = new PersonBuilder();
     Person currentPerson = new Person("Igor","male","телец");
     List<Person> persons = builder.builder();
     PersonFilter personFilter = new Filter();
     List<Person> list = personFilter.filter(currentPerson,persons);
     list.forEach(System.out::println);
    }
}
