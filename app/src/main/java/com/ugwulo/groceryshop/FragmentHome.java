package com.ugwulo.groceryshop;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentHome extends Fragment implements View.OnClickListener {
    private static final String ARG_PARAM = "name";
    Button submitButton;
    NavController navController;
    Item price1, price2, item1, item2 ;
    public FragmentHome() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        price1 = (Item) view.findViewById(R.id.price1);
//        price2 = view.findViewById(R.id.price2);
//        item1 = view.findViewById(R.id.item1);
//        item2 = view.findViewById(R.id.item2);
        navController = Navigation.findNavController(view);
        submitButton = view.findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("name", "Ugwulo");
        Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_orderFragment, bundle);

       FragmentHomeDirections.ActionFragmentHomeToOrderFragment action = FragmentHomeDirections.actionFragmentHomeToOrderFragment(price1,  price2,  item1, item2);
       Navigation.findNavController(view).navigate(action);
    }
}
