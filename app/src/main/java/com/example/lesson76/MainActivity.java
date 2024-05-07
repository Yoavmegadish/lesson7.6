package com.example.lesson76;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment firstfragment = FirstFragment.newInstance();
        secondFragment secondfragment = secondFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView,firstfragment).commit();

        Button frag1 = findViewById(R.id.fragOneBtn);
        Button frag2 = findViewById(R.id.fragTwoBtn);
        Bundle args = new Bundle();
        args.putString("TEST","Frag1");
        firstfragment.setArguments(args);
        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView,firstfragment)
                        .commit();
            }
        });
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment secondFragment;
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, secondfragment)
                        .commit();
            }
        });

    }
}