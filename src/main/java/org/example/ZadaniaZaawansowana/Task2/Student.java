package org.example.ZadaniaZaawansowana.Task2;

public class Student extends Person{

    StudiesType studiesType;
    int yearOfBegining;
    double totalCost;

    public Student(String name, String address, StudiesType studiesType, int yearOfBegining, double totalCost) {
        super(name, address);
        this.studiesType = studiesType;
        this.yearOfBegining = yearOfBegining;
        this.totalCost = totalCost;
    }


    public StudiesType getStudiesType() {
        return studiesType;
    }

    public int getYearOfBegining() {
        return yearOfBegining;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setStudiesType(StudiesType studiesType) {
        this.studiesType = studiesType;
    }

    public void setYearOfBegining(int yearOfBegining) {
        this.yearOfBegining = yearOfBegining;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studiesType=" + studiesType +
                ", yearOfBegining=" + yearOfBegining +
                ", totalCost=" + totalCost +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
