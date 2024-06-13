package main.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingPerson {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> orderingByAge() {
        List<Person> personListOrderingByAge = new ArrayList<>(personList);
        Collections.sort(personListOrderingByAge);
        return personListOrderingByAge;
    }

    public List<Person> orderingByHeight() {
        List<Person> personListOrderingByHeight = new ArrayList<>(personList);
        personListOrderingByHeight.sort(new ComparatorByHeight());
        return personListOrderingByHeight;
    }
}
