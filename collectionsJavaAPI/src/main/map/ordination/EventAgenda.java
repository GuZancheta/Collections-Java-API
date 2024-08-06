package main.map.ordination;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventAgenda {

    private Map<LocalDate, Event> eventMap = new HashMap<>();

    public void addEvent(LocalDate date, String name, String attraction) {
        eventMap.put(date, new Event(name, attraction));
    }

    public void showAgenda() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        System.out.println(eventTreeMap);
    }

    public void getNextEvent() {
        LocalDate actualDate = LocalDate.now();
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);

        for (var entry : eventTreeMap.entrySet()) {
            if (actualDate.equals(entry.getKey()) || actualDate.isBefore(entry.getKey())) {
                System.out.println("The next event: " + entry.getValue() + " will happen on the date " + entry.getKey());
                break;
            }
        }
    }
}