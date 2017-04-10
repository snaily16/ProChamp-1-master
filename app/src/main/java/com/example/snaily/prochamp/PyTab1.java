package com.example.snaily.prochamp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class PyTab1 extends Fragment {
    ArrayAdapter<String> adp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_py_tab1, container, false);
       // String[] Py_Basics ={"Hello World","Input data","Newline","Arithmetic","If-Else","For-loop","While-loop","Do-while loop","Swapping"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Py_Basics);
        ListView view = (ListView) rootView.findViewById(R.id.basic_py_list);

        ArrayList<String> arrayProg =new ArrayList<>();
        arrayProg.addAll(Arrays.asList(getResources().getStringArray(R.array.Basic)));
        adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayProg);
        view.setAdapter(adp);
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
