package com.dsibenik.espressotest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by davor on 7/24/14.
 */

public class Fragment2 extends Fragment {
    public Fragment2(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment2,container,false);
        return rootView;
    }


}