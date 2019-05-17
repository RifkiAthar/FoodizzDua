package com.example.foodizzdua.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.foodizzdua.R;
import com.synnapps.carouselview.CarouselView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private CarouselView trendingItem;
    private CardView dessert, beverages, ingredient;
    private ImageView mainCourse;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView mainCourse = view.findViewById(R.id.main_course);
        CarouselView trendingItem = view.findViewById(R.id.trending_item);
        CardView dessert = view.findViewById(R.id.dessert);
        CardView beverages = view.findViewById(R.id.beverages);
        CardView ingredient = view.findViewById(R.id.ingredients);
        mainCourse.setOnClickListener(this);
        trendingItem.setOnClickListener(this);
        dessert.setOnClickListener(this);
        beverages.setOnClickListener(this);
        ingredient.setOnClickListener(this);
        mainCourse.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.trending_item:
                FragmentManager mTrendingFragmentManager = getFragmentManager();
                if (mTrendingFragmentManager != null) {
                    TrendingFragment mTrendingFragment = new TrendingFragment();
                    FragmentTransaction mFragmentTransaction = mTrendingFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.home_fragment, mTrendingFragment, TrendingFragment.class.getSimpleName());
                    mFragmentTransaction.commit();
                }
                break;

            case R.id.main_course:
                FragmentManager mMainCourseFragmentManager = getFragmentManager();
                if (mMainCourseFragmentManager != null) {
                    MainCourseFragment mMainCourseFragment = new MainCourseFragment();
                    FragmentTransaction mFragmentTransaction = mMainCourseFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.home_fragment, mMainCourseFragment, MainCourseFragment.class.getSimpleName());
                    mFragmentTransaction.commit();
                }
                break;
            case R.id.dessert:
                FragmentManager mDessertFragmentManager = getFragmentManager();
                if (mDessertFragmentManager != null) {
                    DessertFragment mDessertFragment = new DessertFragment();
                    FragmentTransaction mFragmentTransaction = mDessertFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.home_fragment, mDessertFragment, DessertFragment.class.getSimpleName());
                    mFragmentTransaction.commit();
                }
                break;
            case R.id.beverages:
                FragmentManager mBeveragesFragmentManager = getFragmentManager();
                if (mBeveragesFragmentManager != null) {
                    BeveragesFragment mBeveragesFragment = new BeveragesFragment();
                    FragmentTransaction mFragmentTransaction = mBeveragesFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.home_fragment, mBeveragesFragment, BeveragesFragment.class.getSimpleName());
                    mFragmentTransaction.commit();
                }
                break;
            case R.id.ingredients:
                FragmentManager mIngredientFragmentManager = getFragmentManager();
                if (mIngredientFragmentManager != null) {
                    IngredientFragment mIngredientFragment = new IngredientFragment();
                    FragmentTransaction mFragmentTransaction = mIngredientFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.home_fragment, mIngredientFragment, IngredientFragment.class.getSimpleName());
                    mFragmentTransaction.commit();
                }
                break;
        }


    }
}
