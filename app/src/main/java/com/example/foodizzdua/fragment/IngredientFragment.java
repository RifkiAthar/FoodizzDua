package com.example.foodizzdua.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodizzdua.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IngredientFragment extends Fragment {


    View view;
    public IngredientFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_ingredient, container, false);
        return view;
    }

}
