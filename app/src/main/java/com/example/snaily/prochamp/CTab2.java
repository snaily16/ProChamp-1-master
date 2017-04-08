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

/**
 * Created by snaily on 4/4/17.
 */

public class CTab2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_c_tab2, container, false);
        String[] C_Intermediate ={"Array","Pointers","Print String","Concatenate String","toUpper-toLower","Factorial","Fibonacci","Palindrome","Armstrong Number"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,C_Intermediate);
        ListView view2 = (ListView) rootView.findViewById(R.id.intermediate_list);
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
