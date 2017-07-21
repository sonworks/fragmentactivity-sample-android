package com.example.sonworks.fragmentactivitysample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.sonworks.fragmentactivitysample.fragment.AFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Rename and change types of parameters
        final String PARAM1 = "param1";
        final String PARAM2 = "param2";

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragmentLayoutId, AFragment.newInstance(PARAM1, PARAM2)).commit();

    }
}
