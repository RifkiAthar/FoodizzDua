package com.example.foodizzdua.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodizzdua.R;
import com.example.foodizzdua.activity.PattayaActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainCourseFragment extends Fragment implements View.OnClickListener{
    CardView nasiGorengPattaya;


    public MainCourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_course, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CardView nasiGorengPattaya = view.findViewById(R.id.nasigorengpattaya);
        nasiGorengPattaya.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.nasigorengpattaya){
            Intent intent = new Intent(getActivity(), PattayaActivity.class);
            startActivity(intent);
        }

    }
}
