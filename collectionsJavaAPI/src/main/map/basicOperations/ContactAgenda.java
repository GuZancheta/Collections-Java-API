package main.map.basicOperations;

import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {
    private Map<String, Integer> contactAgendaMap = new HashMap<>();

    public void addContact(String name, Integer phoneNumber) {
        // .put add and update Map
        contactAgendaMap.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        if (!contactAgendaMap.isEmpty()) {
            contactAgendaMap.remove(name);
        }
    }

    public void showContacts() {
        System.out.println(contactAgendaMap);
    }

    public Integer searchByName(String name) {
        return !contactAgendaMap.isEmpty() ? contactAgendaMap.get(name) : null;
    }
}