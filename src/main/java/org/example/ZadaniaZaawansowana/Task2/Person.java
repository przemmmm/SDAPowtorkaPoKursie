package org.example.ZadaniaZaawansowana.Task2;

public class Person {

    protected String name;
    protected String address;

    Person(){
        this.name = null;
        this.address = null;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("(%s,-> %s)", name, address);
    }


}
