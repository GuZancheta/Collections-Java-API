package main.map.basicOperations;

public class MainContactAgenda {
    public static void main(String[] args) {
        ContactAgenda contactAgenda = new ContactAgenda();

        contactAgenda.addContact("Gustavo", 123123);
        contactAgenda.addContact("Gustavo", 444433);
        contactAgenda.addContact("Gustavo Z", 919191);
        contactAgenda.addContact("Gustavo Zancheta", 171717);
        contactAgenda.addContact("Salomão", 333777);
        contactAgenda.addContact("Davi", 151515);

        contactAgenda.showContacts();

        contactAgenda.removeContact("Gustavo");

        contactAgenda.showContacts();

        System.out.println(contactAgenda.searchByName("Davi"));
    }
}