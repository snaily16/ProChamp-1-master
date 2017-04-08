package com.example.snaily.prochamp;

/**
 * Created by snaily on 6/4/17.
 */
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CppTab1 extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_cpp_tab1, container, false);
        final String[] Cpp_Basics ={"Hello World","Input data","Newline","Arithmetic","If-Else","Switch","For-loop","While-loop","Do-while loop"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Cpp_Basics);
        ListView view = (ListView) rootView.findViewById(R.id.basic_cpp_list);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String prog = String.valueOf(parent.getItemAtPosition(position));
                //Toast.makeText(getActivity(),"hello",Toast.LENGTH_SHORT).show();
                {
                    if(position==0){
                        Intent i1 =  new Intent(view.getContext(),CppHelloWorld.class);
                        startActivityForResult(i1,0);
                    }
                    if(position==1){
                        Intent i1 =  new Intent(view.getContext(),CppInputdata.class);
                        startActivityForResult(i1,1);
                    }
                    if(position==2){
                        Intent i1 =  new Intent(view.getContext(),CppNewline.class);
                        startActivityForResult(i1,2);
                    }
                    if(position==3){
                        Intent i1 =  new Intent(view.getContext(),CppArithmetic.class);
                        startActivityForResult(i1,3);
                    }
                    if(position==4){
                        Intent i1 =  new Intent(view.getContext(),CppIfelse.class);
                        startActivityForResult(i1,4);
                    }
                    if(position==5){
                        Intent i1 =  new Intent(view.getContext(),CppSwitch.class);
                        startActivityForResult(i1,5);
                    }
                    if(position==6){
                        Intent i1 =  new Intent(view.getContext(),CppForloop.class);
                        startActivityForResult(i1,6);
                    }
                    if(position==7){
                        Intent i1 =  new Intent(view.getContext(),CppWhileloop.class);
                        startActivityForResult(i1,7);
                    }
                    if(position==8){
                        Intent i1 =  new Intent(view.getContext(),CppDowhile.class);
                        startActivityForResult(i1,8);
                    }
                }
            }
        });
        return rootView;
    }
}
