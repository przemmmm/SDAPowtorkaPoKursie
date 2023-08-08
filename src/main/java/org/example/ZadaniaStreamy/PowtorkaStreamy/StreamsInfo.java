package org.example.ZadaniaStreamy.PowtorkaStreamy;

/*
CZYM SĄ STRUMIENIE?
Strumienie służą do przetwarzania danych. Zawierają dane i pozwalają na opisanie co chcesz zrobić tymi danymi.
Strumienie pozwalają w łatwy sposób zrównoleglić pracę na danych. Dzięki temu przetwarzanie dużych zbiorów
danych może być dużo szybsze.

Strumienie to nie struktury danych
W poprzednich artykułach opisałem kilka struktur danych. Przykładem struktur danych może być lista wiązana czy mapa.
Strumienie nie są strukturą danych. W odróżnieniu od struktur nie służą do przechowywania danych.
Strumienie jedynie pomagają określić operacje, które na tych danych chcesz wykonać.

RODZAJE OPERACJI NA STRUMIENIACH

-> TWORZENIE STRUMIENI

Strumień na podstawie kolekcji:

                            Stream<Integer> stream1 = new LinkedList<Integer>().stream();

Strumień na podstawie tablicy:

                            Stream<Integer> stream2 = Arrays.stream(new Integer[]{});

Strumień typów prostych:

                            DoubleStream doubles = DoubleStream.of(1, 2, 3);
                            IntStream ints = IntStream.range(0, 123);
                            LongStream longs = LongStream.generate(() -> 1L);


Strumień danych losowych:
                            DoubleStream randomDoubles = new Random().doubles();
                            IntStream randomInts = new Random().ints();
                            LongStream randomLongs = new Random().longs();


Strumień danych z pliku:
                            try (Stream<String> lines = new BufferedReader(new FileReader("file.txt")).lines()) {
                                // do something


-> OPERACJE NA STREAMACH (te popularne)

filter – zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true,
map – każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu,
sort - sortuje wg jakiegos schematu, np. od najmniejszej do największej
Allmatch - sprawdza, czy wszystkie elementy spleniaja dany warunek. Konczy weryfikacje przy pierwszym niespelniajacym
Anymatch - sprawdza, czy ktorys z elementow spelnia dany warunek. Konczy przy pierwszym spelniającycm
None match - sprawdza, czy zaden z elementow nie spelnia warunku. Konczy przy pierwszym spelniającycm
Max / Min - wskazuje waertosci max i min


-> KOŃCZENIE STRUMIENI


Operacjami kończącymi są wszystkie, które zwracają typ inny niż Stream. Metody tego typu mogą także nie zwracać żadnych wartości.

forEach – wykonuje zadaną operację dla każdego elementu,
count – zwraca liczbę elementów w strumieniu,
allMatch – zwraca flagę informującą czy wszystkie elementy spełniają warunek. Przestaje sprawdzać na pierwszym elemencie, który tego warunku nie spełnia,
collect – pozwala na utworzenie nowego typu na podstawie elementów strumienia. Przy pomocy tej metody można na przykład utworzyć listę. Klasa Collectors zawiera sporo gotowych implementacji.

DOBRE PRAKTYKI NA STRUMIENIACH
- najpierw filtorowanie - pozwala na zredukowanie ilosci danych do dalszej obróbki
- nie naduzywać strumieni, pętle też są spoko
- nie uzywac skomplikowanych wyrażen lambda


 */

public class StreamsInfo {
}
