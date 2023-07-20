package org.example.ZadaniaStreamy.Task9;

import org.example.ZadaniaStreamy.Task7.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Task9 {

    public static void main(String[] args) {

            Employee employee1 = new Employee(1, "Wowalski", 15000);
            Employee employee2 = new Employee(2, "Aowak", 1500);
            Employee employee3 = new Employee(3, "Słowacki", 200);

            List<Employee> list = new ArrayList<>(List.of(employee1, employee2, employee3));


            float pracownicy = list.stream()
                            .map(x->x.getSalary())
                                    .max(Comparator.naturalOrder())
                                            .orElseThrow();  // jak wymaga optionala to wtedy dajemy orElseThrow
        
            System.out.println(pracownicy);


        }
    }


    /*
       Employee pracownik = list.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .findFirst()
                            .orElseThrow(()-> new NoSuchElementException("BRAK"));
     */
