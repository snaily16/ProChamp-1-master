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

import static android.R.attr.id;

/**
 * Created by snaily on 6/4/17.
 */

public class CppTab2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_cpp_tab2, container, false);;
        String[] Cpp_Intermediate ={"Array","Pointers","Print String","Concatenate String","toUpper-toLower","Factorial","Fibonacci","Palindrome","Armstrong Number"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Cpp_Intermediate);
        ListView view2 = (ListView) rootView.findViewById(R.id.intermediate_cpp_list);
        view2.setAdapter(adapter);
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
