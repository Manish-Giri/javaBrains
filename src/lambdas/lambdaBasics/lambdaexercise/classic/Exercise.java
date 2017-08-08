package lambdas.lambdaBasics.lambdaexercise.classic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Exercise {

    private static void sortPeople(List<Person> people) {
        Collections.sort(people);
    }

    private static void printPeople(List<Person> people) {
        for(Person p: people) {
            System.out.println(p);
        }
    }

    private static void printSelectedPeople(List<Person> people) {
        for(Person p: people) {
            if(p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carol", 42),
                new Person("Thomas", "Carlisle", 51),
                new Person("Matthew", "Arnold", 39),
                new Person("Charlotte", "Bront", 45)

        );

        // step 1 = sort list by last name
        // step 2 = create a method that prints all elements in list
        // step 3 = create a method that prints all people whose last name starts with C

        // print unsorted people
        printPeople(people);
        // sort people
        sortPeople(people);
        System.out.println("---After sort---");

        // print sorted people
        printPeople(people);

        // print people with last names starting with C
        System.out.println("Last names starting with C---");
        printSelectedPeople(people);

    }
}

