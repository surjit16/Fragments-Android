package com.example.surjit.workwithfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.but1);
        b2 = (Button) findViewById(R.id.but2);
        b3 = (Button) findViewById(R.id.but3);

        Toast.makeText(this, "onCreate Activity  Started", Toast.LENGTH_SHORT).show();
    }


    public void dothis(View v) {
        int k = v.getId();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (k == b1.getId()) {
            ft.replace(R.id.frag, new Fragment1(), "First");
            try {
                Toast.makeText(this, " aa1 " + getSupportFragmentManager().getFragments().get(0).getTag() + " l " + getSupportFragmentManager().getFragments().size(), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {}
        } else if (k == b2.getId()) {
            ft.replace(R.id.frag, new Fragment2(), "Second");
            try {
                Toast.makeText(this, " aa1 " + getSupportFragmentManager().getFragments().get(0).getTag() + " l " + getSupportFragmentManager().getFragments().size(), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {}
        } else if (k == b3.getId()) {

            Fragment curFag = getSupportFragmentManager().getFragments().get(0);

            if(curFag == null)
            {
                ft.replace(R.id.frag, new Fragment1(), "First");
            }
            else {
                ft.replace(R.id.frag, curFag instanceof Fragment1 ? new Fragment2() : new Fragment1(), curFag instanceof Fragment1 ? "Second" : "First");
            }

            Toast.makeText(this, " aa3 " + getSupportFragmentManager().getFragments().get(0).getTag() + " l " + getSupportFragmentManager().getFragments().size(), Toast.LENGTH_SHORT).show();
        }
        ft.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Activity  Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Activity  Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Activity  Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Activity  Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Activity  Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Activity  Started", Toast.LENGTH_SHORT).show();
    }
}


