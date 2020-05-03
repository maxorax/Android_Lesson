package android.develop.a65apps.maxim.orlov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.develop.a65apps.maxim.orlov.pojo.Contact;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ContactClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            addFragment();
        }
    }

    private void addFragment(){
        Fragment contactList = new ContactListFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragments_container, contactList).commit();
    }

    @Override
    public void onClickOnContactCard(Contact contact) {
                Fragment contactDetails = ContactDetailsFragment.newInstance(contact);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragments_container, contactDetails).addToBackStack(null).commit();
    }

}
