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


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
private View nuevoView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nuevoView=inflater.inflate(R.layout.fragment_main, container, false);
        Button button=(Button) nuevoView.findViewById(R.id.bt1);
        // Inflate the layout for this fragment
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           FragmentUno fragmentUno= new FragmentUno();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Bundle bundle= new Bundle();
                bundle.putString("hey","nice");
                fragmentUno.setArguments(bundle);//this sends the data to fragmentuno
                fragmentTransaction.replace(R.id.frag_container,fragmentUno);
                fragmentTransaction.addToBackStack("next_fragment");
                fragmentTransaction.commit();
            }
        });
        return nuevoView;
    }

}
