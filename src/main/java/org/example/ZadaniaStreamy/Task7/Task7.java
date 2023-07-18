package org.example.ZadaniaStreamy.Task7;
/*
Utwórz klasę Employee z polami id, name oraz salary. Utwórz niezbędne metody i
konstruktor. Utwórz 3 instancje klasy Employee i dodaj je do listy. Korzystając ze
strumieni, znajdź pierwszego pracownika, który nie jest null i ma pensję co najmniej
30000. Jeśli nie zostanie znaleziony, rzuć wyjątek
 */

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Task7 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Kowalski", 1500);
        Employee employee2 = new Employee(2, "Nowak", 1500);
        Employee employee3 = new Employee(3, "Słowacki", 200);

        List<Employee> list = new ArrayList<>(List.of(employee1, employee2, employee3));

        Employee employeeFinal = list.stream()
                .filter(Objects::nonNull)  // to jest podpowiedz z Javy. My mieliscmy wczesniej: x->x!=null i jako podpowiedz zmienilo nam na to co jest
                .filter(x->x.getSalary()>=30000)
//                .findFirst().get();
                .findFirst().orElseThrow(()-> new NoSuchElementException("Nie ma pracownika"));


        System.out.println(employeeFinal);


    }
}
