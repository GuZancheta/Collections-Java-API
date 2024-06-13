package main.list.ordering;

public class MainOrdering {
    public static void main(String[] args) {
        OrderingPerson orderingPerson = new OrderingPerson();

        orderingPerson.addPerson("Nome 1", 20, 1.54);
        orderingPerson.addPerson("Nome 2", 25, 1.85);
        orderingPerson.addPerson("Nome 3", 15, 1.62);
        orderingPerson.addPerson("Nome 4", 18, 1.49);

        System.out.println(orderingPerson.orderingByAge());
        System.out.println(orderingPerson.orderingByHeight());
    }
}
