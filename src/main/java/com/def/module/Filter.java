package com.def.module;

import com.def.entity.Person;

import java.util.*;

public class Filter implements PersonFilter{

    private  final  Map<String,List<String>> currentZodiacMap = new HashMap<>();



    private Map<String,List<String>> initZodiacMap(){
        currentZodiacMap.put("телец", Arrays.asList("дева","рыбы"));
        return currentZodiacMap;
    }



    @Override
    public List<Person> filter(Person currentPerson,List<Person> persons) {

        List<Person> list = new ArrayList<>();

        Map<String,List<String>> zodiacMap = initZodiacMap();

        for (Person person : persons) {
            for (String key : zodiacMap.keySet()) {
                List<String> zodiacSigns = zodiacMap.get(key);
                for (String zodiacSign : zodiacSigns){
                    if (!currentPerson.getGender().equals(person.getGender())) {
                        if (currentPerson.getSymbol().compareTo(key) == person.getSymbol().compareTo(zodiacSign) || currentPerson.getSymbol().compareTo(zodiacSign) == person.getSymbol().compareTo(key)){
                            list.add(person);
                        }
                    }
                }
            }
        }
        return list;
    }
}
