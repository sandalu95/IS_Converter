package com.industrialmaster.digiflex;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.basictab);
        tabLayout.addTab(tabLayout.newTab().setText("LENGTH"));
        tabLayout.addTab(tabLayout.newTab().setText("AREA"));
        tabLayout.addTab(tabLayout.newTab().setText("WEIGHT"));
        tabLayout.addTab(tabLayout.newTab().setText("VOLUME"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.basicpager);
        final BasicPageAdapter adapter = new BasicPageAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void onClickButton(View view) {
        Spinner spinnerFrom = (Spinner) findViewById(R.id.spinnerFrom);
        String lengthFrom = spinnerFrom.getSelectedItem().toString();

        Spinner spinnerTo = (Spinner) findViewById(R.id.spinnerTo);
        String lengthTo = spinnerTo.getSelectedItem().toString();

        EditText tv1=findViewById(R.id.fromText);
        TextView tv2=findViewById(R.id.toText);
        String fromTxt = tv1.getText().toString();
        double fromDoubleTxt=Double.parseDouble(fromTxt);

        if(lengthFrom!=null){
            if(lengthFrom.equals("Meter")){
                this.fromMeter(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Kilometer")){
                this.fromKilometer(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Centimeter")) {
                this.fromCentimeter(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Millimeter")){
                this.fromMillimeter(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Mile")){
                this.fromMile(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Yard")){
                this.fromYard(fromDoubleTxt, lengthTo, tv2);
            } else if(lengthFrom.equals("Foot")){
                this.fromFoot(fromDoubleTxt, lengthTo, tv2);
            } else {
                this.fromInch(fromDoubleTxt, lengthTo, tv2);
            }
        }
    }

    public void fromMeter(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*0.001;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*100;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*1000;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt*0.000621371;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt*1.09361;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*3.28084;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*39.3701;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromKilometer(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*1000;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*100000;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*10000000;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt*0.621371;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt*1093.61;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*3280.84;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*39370.1;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromCentimeter(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*0.01;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*0.00001;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*10;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt/160934.4;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt/91.44;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt/30.48;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt/2.54
                ;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromMillimeter(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*0.001;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt/1000000;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*0.1;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt/1609000;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt/914.4;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt/304.8;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt/25.4;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromMile(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*1609.344;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*1.609;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*160934.4;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*1.609000;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt*1760;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*5280;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*63360;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromYard(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*0.9144;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*0.0009144;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*91.44;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*914.4;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt*0.000568182;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*3;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*36;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromFoot(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*0.3048;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt*0.0003048;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*30.48;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*304.8;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt*0.000189394;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt*0.333333;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*1;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*11.999988;
                break;
        }
        tv2.setText(toDoubleText+"");
    }

    public void fromInch(double fromDoubleTxt, String lengthTo, TextView tv2){
        double toDoubleText=0;

        switch (lengthTo) {
            case "Meter":
                toDoubleText=fromDoubleTxt*0.0254;
                break;
            case "Kilometer":
                toDoubleText=fromDoubleTxt/39370.079;
                break;
            case "Centimeter":
                toDoubleText=fromDoubleTxt*2.54;
                break;
            case "Millimeter":
                toDoubleText=fromDoubleTxt*25.4;
                break;
            case "Mile":
                toDoubleText=fromDoubleTxt/63360;
                break;
            case "Yard":
                toDoubleText=fromDoubleTxt/0.0277778;
                break;
            case "Foot":
                toDoubleText=fromDoubleTxt*0.0833333;
                break;
            case "Inch":
                toDoubleText=fromDoubleTxt*1;
                break;
        }
        tv2.setText(toDoubleText+"");
    }
}
