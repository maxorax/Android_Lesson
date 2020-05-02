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

public class ContactDetailsFragment extends Fragment {

    private int id;
    private ImageView contactImage;
    private TextView name;
    private TextView phone;
    private TextView phone2;
    private TextView email;
    private TextView email2;
    private TextView description;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            getActivity().setTitle("Детали контакта");
            return inflater.inflate(R.layout.fragment_contact_details,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = view.findViewById(R.id.name);
        contactImage = view.findViewById(R.id.image);
        phone = view.findViewById(R.id.phone);
        phone2 =view.findViewById(R.id.phone2);
        email = view.findViewById(R.id.email);
        email2 = view.findViewById(R.id.email_2);
        description = view.findViewById(R.id.description);
        if(getArguments()!=null){
            id = getArguments().getInt("id");
            name.setText(getArguments().getString("name"));
            phone.setText(getArguments().getString("phone"));
            phone2.setText(getArguments().getString("phone2"));
            email.setText(getArguments().getString("email"));
            email2.setText(getArguments().getString("email2"));
            description.setText(getArguments().getString("description"));
            contactImage.setImageResource(getArguments().getInt("image"));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        name = null;
        contactImage = null;
        phone = null;
        phone2 = null;
        email = null;
        email2 = null;
        description = null;
    }

    public static ContactDetailsFragment newInstance(Contact contact){
        Bundle arg = new Bundle();
        arg.putInt("id",contact.getId());
        arg.putString("name",contact.getName());
        arg.putString("phone",contact.getPhone());
        arg.putString("phone2",contact.getPhone2());
        arg.putString("email",contact.getEmail());
        arg.putString("email2",contact.getEmail2());
        arg.putString("description",contact.getDescription());
        arg.putInt("image",contact.getImage());
        ContactDetailsFragment contactDetailsFragment = new ContactDetailsFragment();
        contactDetailsFragment.setArguments(arg);
        return contactDetailsFragment;
    }

}
