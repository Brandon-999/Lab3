public class BuddyInfo {

    public String name;
    public String address;
    public String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Jack";
        this.address = "Carleton";
        this.phoneNumber = "6136743345";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "Ottawa", "6135970072");

        System.out.println("Hello " + buddy.getName());
    }
}
