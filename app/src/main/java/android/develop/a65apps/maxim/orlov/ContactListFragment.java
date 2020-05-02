package android.develop.a65apps.maxim.orlov;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ContactListFragment extends Fragment implements View.OnClickListener{

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
        onClick(view);
    }

    @Override
    public void onClick(View v) {
    try {
        ((ContactClick)getActivity()).onClickOnContact(getActivity().findViewById(R.id.contactCard));
    }
    catch (ClassCastException e){}
    }

}
