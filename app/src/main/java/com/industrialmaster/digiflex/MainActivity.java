package com.industrialmaster.digiflex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.basicbtn:
                intent = new Intent(this, BasicActivity.class);
                break;
            case R.id.livingbtn:
                intent = new Intent(this, LivingActivity.class);
                break;
            case R.id.sciencebtn:
                intent = new Intent(this, ScienceActivity.class);
                break;
            case R.id.miscbtn:
                intent = new Intent(this, MiscActivity.class);
                break;
            default:
                intent = new Intent(this, BasicActivity.class);
        }
        startActivity(intent);
    }

}
