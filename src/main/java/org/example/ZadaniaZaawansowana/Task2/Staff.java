package org.example.ZadaniaZaawansowana.Task2;

public class Staff extends Person{

    Speciality speciality;
    Double salary;

    public Staff(Speciality speciality, Double salary) {
        this.speciality = speciality;
        this.salary = salary;
    }

    public Staff(String name, String address, Speciality speciality, Double salary) {
        super(name, address);
        this.speciality = speciality;
        this.salary = salary;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;

    }

    @Override
    public String toString() {
        return "Staff{" +
                "speciality=" + speciality +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
