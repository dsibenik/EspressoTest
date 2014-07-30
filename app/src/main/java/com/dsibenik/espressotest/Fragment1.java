package com.dsibenik.espressotest;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by davor on 7/24/14.
 */

public  class Fragment1 extends Fragment {
    Button donotpress;
    ImageButton nextactivity;

    String text = "Do not press!";
    int k = 2;
    int j = 0;

    public Fragment1() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);

        donotpress = (Button) rootView.findViewById(R.id.donotpress);
        donotpress.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showToast(text);
            ((MyInterface) getActivity()).onClick(k);
            if(k==3)k=1;
            else k++;
        }
        });

        nextactivity = (ImageButton) rootView.findViewById(R.id.nextactivity);
        nextactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyInterface) getActivity()).switchActivity();
            }
        });

        return rootView;
    }


    public void updateFragment1(int arg){
        k=arg;
    }


    public void showToast(String text){
        Toast.makeText(getActivity(), text+j, Toast.LENGTH_SHORT).show();
    }
}
