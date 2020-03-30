package com.example.planing.planingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonthlyFragment extends Fragment {
    private ListView MonthPlan;


    public MonthlyFragment() {
        // Required empty public constructor
        //adapter =
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_monthly, container, false);

       // MonthPlan = (ListView) findVievById(R.id.month_plan);
        //List<String> items = initData1();

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        //MonthPlan.setAdapter(adapter);
    }

    private Object findVievById(int month_plan) {
        return null;
    }

    private List<String> initData1(){
        List<String> plan = new ArrayList<String>();

        plan.add ("Learn Japanese" );
        plan.add ("Nails" );
        plan.add ("Sleep well" );
        plan.add ("Do sports" );
        plan.add ( "Watch 5 films");


        return plan;
    }





}
