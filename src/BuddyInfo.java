
public class BuddyInfo {
    private String name;
    private String address;
    private String phone;


    public BuddyInfo()  {
        this.name = "John Doe";
        this.address = "1234 Street Road";
        this.phone = "1234567890";
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homers", "58 Drive Drive", "2560981234");
        System.out.printf("Hello %s", buddy.getName());
    }

}

