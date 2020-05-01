package android.develop.a65apps.maxim.orlov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.develop.a65apps.maxim.orlov.pojo.Contact;
import android.develop.a65apps.maxim.orlov.pojo.ContactList;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private ContactList contactList = new ContactList();
    private Contact contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            addFragment();
        }

    }

    private void addFragment(){
        contact = new Contact(1,R.drawable.smoke,"Максим Орлов","+79111111111","+79502222222","orlov3020max@gmail.com","max@netlevel.com","Студент 2 курса ИжГТУ, институт ИВТ, факультет ИВТ, кафедра АСОИУ");
        contactList.addInList(contact);
        Fragment contactList =ContactListFragment.newInstance(contact);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragments_container, contactList).commit();
    }

    public void onClickOnContact(View view){
        Fragment contactDetails = ContactDetailsFragment.newInstance(contact);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragments_container, contactDetails).addToBackStack(null).commit();

    }

}
