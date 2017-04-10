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

/**
 * Created by snaily on 6/4/17.
 */

public class PyTab3 extends Fragment {
    ArrayAdapter<String> adp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_py_tab3, container, false);
        //String[] Py_Advance ={"Bubble Sort","Quick Sort","Selection Sort","Linear Search","Binary Search","* Patterns"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Py_Advance);
        ListView view3 = (ListView) rootView.findViewById(R.id.advance_py_list);

        ArrayList<String> arrayProg =new ArrayList<>();
        arrayProg.addAll(Arrays.asList(getResources().getStringArray(R.array.Advanced)));
        adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayProg);
        view3.setAdapter(adp);
        //view3.setAdapter(adapter);
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
