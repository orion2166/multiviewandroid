package com.orion2166projects.multiviewandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by orion_000 on 12/12/2016.
 */

public class topview_activity extends GridView {
    Context parent_context;

    public topview_activity(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void setOnClickListener(OnClickListener l) {
        super.setOnClickListener(l);

    }
    //void column_set(int columns){
    //    setNumColumns(1);
    //    column_set(columns);
    //}
    void input_values(String[] catagories){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.topview,catagories);
        setAdapter(adapter);
    }

}
