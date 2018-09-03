package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {

    public static void main(String[] args) {

        Person person1 = new Person("Andrzej", "Kowalski", 42);
        Person person2 = new Person("Jan", "Nowak", 13);
        Person person3 = new Person("Tomasz", "Kowal", 17);
        Person person4 = new Person("Zbigniew", "Blaszka", 34);
        Person person5 = new Person("Janusz", "Nowakowski", 50);
        Person person6 = new Person("Maciej", "Kowalski", 29);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);

//        Consumer cons = person -> System.out.println(person);

        consumeList(people, person -> System.out.println(person));
//        consumeList(people, System.out::println);
    }



    static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for(T object: list){
            consumer.accept(object);
        }
    }
}
