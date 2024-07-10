package main.set.basicOperations;

public class MainGuest {
    public static void main(String[] args) {
        SetGuests setGuests = new SetGuests();

        setGuests.addGuest("Test 01", 1);
        setGuests.addGuest("Test 02", 2);
        setGuests.addGuest("Test 03", 3);
        setGuests.addGuest("Test 04", 4);

        setGuests.countGuests();
        setGuests.showGuests();
        setGuests.removeGuestByInvitationCode(2);

        setGuests.countGuests();
        setGuests.showGuests();
    }
}