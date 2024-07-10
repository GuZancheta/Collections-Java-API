package main.set.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {
    private Set<Guest> guestSet = new HashSet<>();

    public void addGuest(String name, int codeInvitation) {
        guestSet.add(new Guest(name, codeInvitation));
    }

    public void removeGuestByInvitationCode(int codeInvitation) {
        guestSet.removeIf(guest -> guest.getCodeInvitation() == codeInvitation);
    }

    public void countGuests() {
        System.out.println(guestSet.size());
    }

    public void showGuests() {
        System.out.println(guestSet);
    }
}