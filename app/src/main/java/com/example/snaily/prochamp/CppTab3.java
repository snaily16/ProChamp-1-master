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
 * Created by snaily on 6/4/17.
 */

public class CppTab3 extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_cpp_tab3, container, false);
        String[] Cpp_Advance ={"Bubble Sort","Quick Sort","Selection Sort","Linear Search","Binary Search","* Patterns"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Cpp_Advance);
        ListView view3 = (ListView) rootView.findViewById(R.id.advance_cpp_list);
        view3.setAdapter(adapter);
        view3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view3, int position, long id) {
                String prog = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getActivity(),"yo",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
