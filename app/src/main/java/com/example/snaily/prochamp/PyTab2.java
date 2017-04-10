package com.example.snaily.prochamp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class PyTab2 extends Fragment {
    ArrayAdapter<String> adp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_py_tab2, container, false);
        //String[] Py_Intermediate ={"Array","Pointers","Print String","Concatenate String","toUpper-toLower","Factorial","Fibonacci","Palindrome","Armstrong Number"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Py_Intermediate);
        ListView view2 = (ListView) rootView.findViewById(R.id.intermediate_py_list);

        ArrayList<String> arrayProg =new ArrayList<>();
        arrayProg.addAll(Arrays.asList(getResources().getStringArray(R.array.Intermediate)));
        adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayProg);
        view2.setAdapter(adp);
        view2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view2, int position, long id) {
                String prog = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getActivity(),"yippe",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
