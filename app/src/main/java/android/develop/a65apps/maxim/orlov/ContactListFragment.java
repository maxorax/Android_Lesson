package android.develop.a65apps.maxim.orlov;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactListFragment extends Fragment{

    private Context activity = null;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ContactClick){
            activity = context;
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
        Click();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        activity = null;
    }

    private void Click() {
    try {
        ((ContactClick) activity).onClickOnContactCard(R.id.contactCard);
    }
    catch (ClassCastException e){
        e.printStackTrace();
    }
    }

}
