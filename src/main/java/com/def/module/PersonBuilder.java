package com.def.module;

import com.def.entity.Person;

import java.util.Arrays;
import java.util.List;

public class PersonBuilder {
    public List<Person> builder(){
        return Arrays.asList(new Person("Olisa","female","овен"),
                new Person("Oleg","male","козерог"),
                new Person("Roma","male","рак"),
                new Person("Jessica", "female","дева"),
                new Person("Marina","female","рыбы"));
    }
}
