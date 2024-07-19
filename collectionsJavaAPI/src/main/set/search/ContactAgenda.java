package main.set.search;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class ContactAgenda {
    private Set<Contact> contactSet = new HashSet<>();

    public void addContact(String name, int phoneNumber) {
        contactSet.add(new Contact(name, phoneNumber));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactByName = new HashSet<>();
        contactSet.forEach(contact -> {
            if (contact.getName().startsWith(name)) {
                contactByName.add(contact);
            }
        });
        return contactByName;
    }

    public void updatePhoneNumber(String name, int newPhoneNumber) {
        contactSet.forEach(contact -> {
            if (!name.isEmpty() && contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println(contact);
            }
        });
    }
}