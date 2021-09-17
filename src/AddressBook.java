import java.util.ArrayList;


public class AddressBook {

    ArrayList<BuddyInfo> book;

    public void main(){
        System.out.println("Address Book");
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
