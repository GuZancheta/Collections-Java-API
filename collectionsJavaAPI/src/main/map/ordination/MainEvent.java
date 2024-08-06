package main.map.ordination;

import java.time.LocalDate;
import java.time.Month;

public class MainEvent {
    public static void main(String[] args) {
        EventAgenda eventAgenda = new EventAgenda();

        eventAgenda.addEvent(LocalDate.of(2024, Month.OCTOBER, 6), "Event 01", "Attraction 01");
        eventAgenda.addEvent(LocalDate.of(2023, Month.AUGUST, 6), "Event 02", "Attraction 02");
        eventAgenda.addEvent(LocalDate.of(2024, Month.SEPTEMBER, 12), "Event 03", "Attraction 03");
        eventAgenda.addEvent(LocalDate.of(2024, Month.DECEMBER, 25), "Christmas", "Attraction 04");

        eventAgenda.showAgenda();

        eventAgenda.getNextEvent();
    }
}