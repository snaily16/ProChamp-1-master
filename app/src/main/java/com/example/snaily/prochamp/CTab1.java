package com.example.snaily.prochamp;

/**
 * Created by snaily on 4/4/17.
 */

import  android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CTab1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_c_tab1, container, false);
        String[] C_Basics ={"Hello World","Input data","Newline","Arithmetic","If-Else","Switch","For-loop","While-loop","Do-while loop","Swapping"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,C_Basics);
        ListView view = (ListView) rootView.findViewById(R.id.basic_list);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String prog = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getActivity(),"hello",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
