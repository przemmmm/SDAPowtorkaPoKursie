package org.example.ZadaniaPodstawa.Task19;

//Napisz program, składający się z kilku klas:
//        a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
//        b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
//        c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//        i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//        ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)

public class Task19 {
    public static void main(String[] args) {

        Poem poem1 = new Poem(new Author("Polska", "Mickiewicz"), 25);
        Poem poem2 = new Poem(new Author("USA", "King"), 125);
        Poem poem3 = new Poem(new Author("Polska", "Szymborska"), 12325);

        Poem[] poems = {poem1, poem2, poem3};


        int maxPoems=0;
        String mostStrophes="null";
        for (Poem poem : poems) {
            if(poem.getStropheNumbers()>maxPoems){
                maxPoems=poem.getStropheNumbers();
                mostStrophes=poem.getCreator().getName();
            }


        }
        System.out.println(mostStrophes);

    }



}
