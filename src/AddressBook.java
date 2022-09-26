import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }


    public void addBuddy(BuddyInfo buddy)
    {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)
    {
        buddies.remove(buddy);
    }

    public void testMethod()
    {
        System.out.println("Test Method for Branches");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jack", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
