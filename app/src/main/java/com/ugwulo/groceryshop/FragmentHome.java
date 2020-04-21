package com.ugwulo.groceryshop;


import android.content.ClipData;
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
    int price1 , price2;
    String item1, item2;

    EditText editPrice1, editPrice2, editItem1, editItem2;
    public FragmentHome() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editPrice1 = view.findViewById(R.id.price1);
        editPrice2 = view.findViewById(R.id.price2);
        editItem1 = view.findViewById(R.id.item1);
        editItem2 = view.findViewById(R.id.item2);
        navController = Navigation.findNavController(view);
        submitButton = view.findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(this);

//        Bundle bundle = new Bundle();
//        bundle.putString("item1", "Carrot");
//        bundle.putString("item2", "Carrot");
//        bundle.putInt("price1", 45);
//        bundle.putInt("price2", 45);
////        Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_orderFragment, bundle);
//
//        item1 = editItem1.getText().toString();
//        item2 = editItem2.getText().toString();
//        price1 = Integer.parseInt(editPrice1.getText().toString());
//        price2 = Integer.parseInt(editPrice2.getText().toString());


    }

    @Override
    public void onClick(View view) {
        FragmentHomeDirections.ActionFragmentHomeToOrderFragment action = FragmentHomeDirections.actionFragmentHomeToOrderFragment();


        Navigation.findNavController(view).navigate(action);
        submitButton.setOnClickListener(
                // Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_orderFragment, bundle)
                Navigation.createNavigateOnClickListener(R.id.action_fragmentHome_to_orderFragment)
        );
    }
}
