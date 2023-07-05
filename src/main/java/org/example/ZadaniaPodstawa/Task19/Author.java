package org.example.ZadaniaPodstawa.Task19;

public class Author {
    String nationality;
    String name;

    public Author(String nationality, String name) {
        this.nationality = nationality;
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nationality='" + nationality + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
