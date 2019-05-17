package com.example.foodizzdua.activity;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodizzdua.R;
import com.example.foodizzdua.fragment.IngredientFragment;
import com.example.foodizzdua.fragment.OutletFragment;
import com.example.foodizzdua.fragment.StepsFragment;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class PattayaActivity extends AppCompatActivity implements View.OnClickListener{
    private TabLayout tablayout;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattaya);
        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById (R.id.appbar);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new StepsFragment(), "Steps");
        adapter.AddFragment(new IngredientFragment(), "Ingredients");
        adapter.AddFragment(new OutletFragment(), "Outlets");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        appBarLayout.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.appbar){
            Intent intent = new Intent(PattayaActivity.this, VideoPattayaActivity.class);
            startActivity(intent);
        }
    }
}
