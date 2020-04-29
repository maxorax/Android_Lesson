package android.develop.a65apps.maxim.orlov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {




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

    public void onClickOnContact(View view){
        Fragment contactDetails = new ContactDetailsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(findViewById(R.id.fragments_container).getId(),contactDetails).addToBackStack(null).commit();
    }



}
