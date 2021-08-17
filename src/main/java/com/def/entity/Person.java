package com.def.entity;

public class Person {
    private String name;
    private String gender;
    private String zodiacSign;

    public Person() {
    }

    public Person(String name, String gender, String zodiacSign) {
        this.name = name;
        this.gender = gender;
        this.zodiacSign = zodiacSign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSymbol() {
        return zodiacSign;
    }

    public void setSymbol(String symbol) {
        this.zodiacSign = symbol;
    }

    @Override
    public String toString() {
        return "name: " + name + " " +
                "gender: " + gender + " " +
                "symbol: " + zodiacSign;
    }
}
