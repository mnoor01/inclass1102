package com.example.c4q.inclassfragment1202;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentUno extends Fragment {
private View nuevoView;

    public FragmentUno() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nuevoView=inflater.inflate(R.layout.fragment_fragment_uno, container, false);
        TextView textView= (TextView) nuevoView.findViewById(R.id.txt01);
        Bundle bundle=getArguments();//we get the arguments from where we set the arguments
        String nText= bundle.getString("hey");//I put nice as the key in the other activity so I have to put it here
        textView.setText(nText);
        // Inflate the layout for this fragment
        return nuevoView ;
    }

}
