package Chapter10List.Challenge.MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int position = findContact(oldContact);

        if (position < 0) {
            return false;
        }

        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {

        int position = findContact(contact);

        if (position < 0) {
            return false;
        }

        myContacts.remove(position);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {

            Contact contact = myContacts.get(i);

            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {

        int position = findContact(name);

        if (position >= 0) {
            return myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");

        for (int i = 0; i < myContacts.size(); i++) {

            Contact contact = myContacts.get(i);

            System.out.println(
                    (i + 1) + ". " +
                            contact.getName() +
                            " -> " +
                            contact.getPhoneNumber()
            );
        }
    }
}
