package com.sstewart.programmaticview;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DivLayout masterDiv = new DivLayout(this);

        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        DivLayout headerDiv = masterDiv.addDiv(headerParams);
        headerDiv.setBackgroundColor(Color.DKGRAY);

        Button myButton1 = new Button(this);
        // Set box size and offset
        RelativeLayout.LayoutParams button1Params = new RelativeLayout.LayoutParams(250, 300);
        button1Params.leftMargin = 50;
        button1Params.topMargin = 60;
        myButton1.setText("Button 1");
        myButton1.setBackgroundColor(Color.BLUE);
        headerDiv.addView(myButton1, button1Params);

        Button myButton2 = new Button(this);
        // Set box size and offset (intentionally done to overlap other button)
        RelativeLayout.LayoutParams button2Params = new RelativeLayout.LayoutParams(250, 250);
        button2Params.leftMargin = 225;
        button2Params.topMargin = 90;
        myButton2.setText("Button 2");
        myButton2.setBackgroundColor(Color.RED);
        headerDiv.addView(myButton2, button2Params);


        /*
        RelativeLayout mainDiv = new RelativeLayout(this);
        RelativeLayout headerDiv = new RelativeLayout(this);

        headerDiv.setLayoutParams(new RelativeLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT));
        mainDiv.setBackgroundColor(Color.GREEN);
        headerDiv.setBackgroundColor(Color.CYAN);

        RelativeLayout.LayoutParams params;

        mainDiv.addView(headerDiv);

        */

        setContentView(masterDiv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
