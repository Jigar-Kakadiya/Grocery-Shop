package com.ugwulo.groceryshop;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class OrderFragment extends Fragment {

     TextView textItem1;
     String item1, item2;
     int price1, price2;
    public OrderFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textItem1 = view.findViewById(R.id.item1);
        item1 = OrderFragmentArgs.fromBundle(getArguments()).getItem1();
        textItem1.setText(item1);
    }
}
