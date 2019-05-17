package com.example.foodizzdua.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.foodizzdua.R;
import com.example.foodizzdua.activity.BeliActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutletFragment extends Fragment implements View.OnClickListener{
    private Button shopHere;


    View view;
    public OutletFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_outlet, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopHere = view.findViewById(R.id.shop_now);
        shopHere.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.shop_now){
            Intent intent = new Intent(getActivity(), BeliActivity.class);
            startActivity(intent);
        }
    }
}
