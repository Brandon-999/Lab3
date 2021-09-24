import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> book;
    public AddressBook() {
        book = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            book.add(buddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < book.size()){
            book.remove(index);
        }
    }

    public static void main(){
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        BuddyInfo bud = new BuddyInfo();
        addressBook.addBuddy(bud);
        addressBook.removeBuddy(0);
        int testChange = 12;
    }

}
