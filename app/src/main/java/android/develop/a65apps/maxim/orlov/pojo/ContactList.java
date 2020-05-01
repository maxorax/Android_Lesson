package android.develop.a65apps.maxim.orlov.pojo;

import android.develop.a65apps.maxim.orlov.R;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
   private List<Contact> contactList = new ArrayList<>();

    public ContactList() {
    }

    public ContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addInList(Contact contact){
        this.contactList.add(contact);
    }
}
