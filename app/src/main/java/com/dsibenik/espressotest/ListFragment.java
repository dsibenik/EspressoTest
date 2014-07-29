package com.dsibenik.espressotest;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by davor on 7/28/14.
 */
public class ListFragment extends Fragment {
    ListView listview;

    public ListFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_listfragment,container,false);

        listview = (ListView) rootView.findViewById(R.id.listview2);

        String[] values = new String[]{ "Prvi","Drugi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // selected item
                String product = ((TextView) view).getText().toString();
                switch(position) {
                    case 0:
                        ((MyInterface)getActivity()).onClick(1);
                        break;
                    case 1:
                        ((MyInterface)getActivity()).onClick(2);
                        break;
                }
            }
        });


        return rootView;
    }
}
