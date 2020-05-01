package android.develop.a65apps.maxim.orlov;

import android.develop.a65apps.maxim.orlov.pojo.Contact;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ContactListFragment extends Fragment {

    private int id;
    private ImageView contactImage;
    private TextView name;
    private TextView phone;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           getActivity().setTitle("Список контактов");
            return inflater.inflate(R.layout.fragment_contact_list, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = view.findViewById(R.id.contactName);
        contactImage = view.findViewById(R.id.contactImage);
        phone = view.findViewById(R.id.contactPhone);

        if(getArguments()!=null){
            id = getArguments().getInt("id");
            name.setText(getArguments().getString("name"));
            phone.setText(getArguments().getString("phone"));
            contactImage.setImageResource(getArguments().getInt("image"));
        }
    }

    public static ContactListFragment newInstance(Contact contact){
        Bundle arg = new Bundle();
        arg.putInt("id",contact.getId());
        arg.putString("name",contact.getName());
        arg.putString("phone",contact.getPhone());
        arg.putInt("image",contact.getContactImage());
        ContactListFragment contactListFragment = new ContactListFragment();
        contactListFragment.setArguments(arg);
        return contactListFragment;
    }



}
