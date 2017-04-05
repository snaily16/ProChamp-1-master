package com.example.snaily.prochamp;

/**
 * Created by snaily on 4/4/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.Menu;
import android.widget.TextView;

public class CTab1 extends ListFragment{

    String C_Basics[] ={"Hello World","Input basics","Newline"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_c_tab1, container, false);
        return rootView;

    }
}
