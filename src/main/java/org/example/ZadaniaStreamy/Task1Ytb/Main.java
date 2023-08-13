package org.example.ZadaniaStreamy.Task1Ytb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        //iterowanie pętlą forEach, czyli tzw. IMPERATIVE APPROACH

        List<Person> femalesList = new ArrayList<>();

        for (Person person : people) {
            if(person.getGender().equals(Gender.FEMALE)){
                femalesList.add(person);
            }
        }

        //femalesList.forEach(System.out::println);


        // DECLARATIVE APPROACH
        //1. Filter --> to interfejs Predicate, który zwraca true albo false
        System.out.println("*******FILTORWANIE*******");

        List<Person> filteredList = people.stream()
                .filter(x -> x.getGender().equals(Gender.FEMALE))  //-> filtorwanie samych kobiet
                .filter(x -> x.getName().endsWith("a"))
                .filter(x -> x.getAge() == 17)
                .collect(Collectors.toList());  //filtorwanie możemy zakońćzyć na dwa sposoby. Collect pozwala nam zrzucić wyniki filtorwania do nowej listy, która musi być wcześniej zainicjowana

        filteredList.forEach(System.out::println);


        //2. Sort --> to interfejs comparator, który porownuje ze sobą poszczegolne elemnty żeby je posortować
        System.out.println("*******SORTOWANIE*******");
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())  //reversed pozwala na odwrocenie sortowania
                .collect(Collectors.toList());

        sortedByAge.forEach(System.out::println);

        //3. AllMatch --> interefjs predicate
        System.out.println("*******ALLMATCH*******");

        boolean allMacth = people.stream()  //allMacth zwraca true false, wieć przypisujemy to do zmiennej boolean
                .allMatch(x->x.getAge()>=20);

        System.out.println(allMacth);

        //4. NoneMatch --> interefjs predicate
        System.out.println("*******NoneMATCH*******");

        boolean noneMacth = people.stream()  //noneMacth zwraca true false, wieć przypisujemy to do zmiennej boolean
                .noneMatch(x->x.getAge()>=20);

        System.out.println(noneMacth);

        //5. Max --> interefjs comparator
        System.out.println("*******MAX*******");

        Optional<Person> max = people.stream()  // Optional, ponieważ może nie być wartości max
                .max(Comparator.comparing(Person::getAge));
        

        //i tu druga opcja

        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);


    }

    private static List<Person> getPeople(){
        return List.of(
        new Person("Jan", 25, Gender.MALE),
        new Person("Monika", 34, Gender.FEMALE),
        new Person("Kazimierz", 65, Gender.MALE),
        new Person("Katarzyna", 17, Gender.FEMALE),
        new Person("Nicole", 19, Gender.FEMALE),
        new Person("Michał", 7, Gender.MALE)
        );
    }
}
