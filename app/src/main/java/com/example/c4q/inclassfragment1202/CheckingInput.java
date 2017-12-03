package com.example.c4q.inclassfragment1202;

import android.content.Context;
import android.widget.Switch;

/**
 * Created by c4q on 12/3/17.
 */

public class CheckingInput {
    private String editTextString;
    private String output;
    private Context context;

    public CheckingInput(String editTextString,Context context){
      this.editTextString=editTextString.toLowerCase();
      this.context=context;

    }
    public String getStringResource(){
        switch (editTextString){
            case "first": return context.getString(R.string.one);
            case "second":return context.getString(R.string.two);
            case "third": return context.getString(R.string.three);
        }
        return editTextString;
    }
}
