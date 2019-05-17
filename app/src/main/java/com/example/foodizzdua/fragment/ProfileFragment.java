package com.example.foodizzdua.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.foodizzdua.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener{
    private Button allergy;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        allergy = view.findViewById(R.id.allergy);
        allergy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.allergy){
            FragmentManager mAllergyFragmentManager = getFragmentManager();
            if (mAllergyFragmentManager != null) {
                AllergyFragment mAllergyFragment = new AllergyFragment();
                FragmentTransaction mFragmentTransaction = mAllergyFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.profile_fragment, mAllergyFragment, AllergyFragment.class.getSimpleName());
                mFragmentTransaction.commit();
            }

        }
    }
}
