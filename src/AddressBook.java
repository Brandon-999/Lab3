import java.util.ArrayList;


public class AddressBook {

    ArrayList<BuddyInfo> book;

    public void main(){
        System.out.println("Address Book");
        BuddyInfo bud = new BuddyInfo();
        addBuddy(bud);
        removeBuddy();
    }

    public AddressBook() {
    book = new ArrayList();
    }

    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    public void removeBuddy(){
        book.remove(book.size() - 1);
    }


}
