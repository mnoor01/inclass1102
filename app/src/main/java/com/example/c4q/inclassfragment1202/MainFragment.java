package com.example.c4q.inclassfragment1202;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
private View nuevoView;
private EditText eText;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nuevoView=inflater.inflate(R.layout.fragment_main, container, false);
        Button button=(Button) nuevoView.findViewById(R.id.bt1);
        eText=(EditText) nuevoView.findViewById(R.id.etxt01);
        // Inflate the layout for this fragment
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           FragmentUno fragmentUno= new FragmentUno();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                String textFromEditText= eText.getText().toString();
                Bundle bundle= new Bundle();
                bundle.putString("hey",textFromEditText);//we use the name the information that is being passed
                fragmentUno.setArguments(bundle);//this sends the data to fragmentuno
                fragmentTransaction.setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit);
                fragmentTransaction.replace(R.id.frag_container,fragmentUno);
                fragmentTransaction.addToBackStack("next_fragment");
                fragmentTransaction.commit();
            }
        });
        return nuevoView;
    }

}
