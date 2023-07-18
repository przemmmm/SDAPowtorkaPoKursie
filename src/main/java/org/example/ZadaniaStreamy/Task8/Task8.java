package org.example.ZadaniaStreamy.Task8;
/*
Na podstawie listy pracowników z poprzedniego ćwiczenia za pomocą strumieni utwórz
nową listę z pracownikami posortowanymi według nazwisk
 */

import org.example.ZadaniaStreamy.Task7.Employee;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Wowalski", 1500);
        Employee employee2 = new Employee(2, "Aowak", 1500);
        Employee employee3 = new Employee(3, "Słowacki", 200);

        List<Employee> list = new ArrayList<>(List.of(employee1, employee2, employee3));

//        Employee employeeFinal = list.stream()
//                .filter(Objects::nonNull)  // to jest podpowiedz z Javy. My mieliscmy wczesniej: x->x!=null i jako podpowiedz zmienilo nam na to co jest
//                .filter(x->x.getSalary()>=30000)
////                .findFirst().get();
//                .findFirst().orElseThrow(()-> new NoSuchElementException("Nie ma pracownika"));


       // System.out.println(employeeFinal);

        List<Employee> listaSortowana = list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        System.out.println(listaSortowana);






    }
}
