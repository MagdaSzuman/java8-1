package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        filterByPredicate(people, person -> person.getAge() > 18);

        applyToList(people, person -> {
            person.setAge(person.getAge() + 1);
            return person;
        });

        people.forEach(System.out::println);

    }


    static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T object : list) {
            consumer.accept(object);
        }
    }

    static <T> void filterByPredicate(List<T> list, Predicate<T> predicate) {
        for (T object : list) {
            if (predicate.test(object)) {
                System.out.println(object);
            }
        }
    }

    static <T> void applyToList(List<T> list, Function<T, T> function) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,function.apply(list.get(i)));
        }


    }
}
