package com.luxoft.springioc.lab1.model;

import java.util.List;

public class UsualPerson implements Person {
    private int id;

    private String name;

    private Country country;

    private int age;
    private float height;
    private boolean isProgrammer;

    private List<String> contacts;

    public UsualPerson(int id, String name, Country country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public void sayHello(Person person) {
    }

    public Country getCountry() {
        return country;
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String s = "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n"
                + "Country: " + country + "\n"
                + "Is Programmer?: " + isProgrammer + "\n";
        if ((contacts != null) && (!contacts.isEmpty())) {
            s += "Contacts: ";
            for (String contact : contacts) {
                s += contact + ", ";
            }
            s += "\n";
        }
        return s;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsualPerson person = (UsualPerson) o;

        if (age != person.age) return false;
        if (Float.compare(person.height, height) != 0) return false;
        if (isProgrammer != person.isProgrammer) return false;
        if (country != null ? !country.equals(person.country) : person.country != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (isProgrammer ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}