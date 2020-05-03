package android.develop.a65apps.maxim.orlov;

import android.content.Context;
import android.develop.a65apps.maxim.orlov.pojo.Contact;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactListFragment extends Fragment{

    private final Contact CONTACT = new Contact(1,R.drawable.smoke,"Максим Орлов","+79111111111",
                                        "+79502222222","orlov3020max@gmail.com","max@netlevel.com",
                                        "Студент 2 курса ИжГТУ, институт ИВТ, факультет ИВТ, кафедра АСОИУ");
    private ContactClick contactClick = null;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ContactClick){
            contactClick =(ContactClick) context;
        }
    }

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
    }

    @Override
    public void onStart() {
        super.onStart();
        View contactCard = getActivity().findViewById(R.id.contactCard);
        contactCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(contactClick != null) {
                 contactClick.onClickOnContactCard(CONTACT);
              }
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        contactClick = null;
    }

}
