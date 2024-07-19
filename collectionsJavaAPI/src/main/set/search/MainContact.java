package main.set.search;

public class MainContact {
    public static void main(String[] args) {
        ContactAgenda contactAgenda = new ContactAgenda();

        contactAgenda.addContact("teste 01", 111111);
        contactAgenda.addContact("teste 01", 222222);
        contactAgenda.addContact("abcde 01", 323232);
        contactAgenda.addContact("asdfaq", 123);
        contactAgenda.addContact("teste 04", 111111);

        contactAgenda.showContacts();

        contactAgenda.updatePhoneNumber("asdfaq", 123123);

        contactAgenda.showContacts();

        System.out.println(contactAgenda.searchByName("teste"));
    }
}