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

public class WelcomeFragment extends Fragment implements View.OnClickListener {
    NavController controller;
    Button loginButton;
    EditText email, password;
    public WelcomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_welcome, container, false);

        loginButton = view.findViewById(R.id.buttonLogin);
        email = view.findViewById(R.id.editPassword);
        password = view.findViewById(R.id.editEmail);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();
        controller = Navigation.findNavController(view);

        view.findViewById(R.id.button_create_account).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_signupFragment)
        );

        if(!userEmail.isEmpty() && !userPassword.isEmpty()){
            view.findViewById(R.id.buttonLogin).setOnClickListener(
                    Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_fragmentHome)
            );
        }

    }

    @Override
    public void onClick(View view) {
    }
}
