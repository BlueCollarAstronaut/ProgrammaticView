package com.sstewart.programmaticview;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.jar.Attributes;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        Button myButton1 = new Button(this);
        myButton1.setHeight(100);
        myButton1.setWidth(200);
        myButton1.setX(150);
        myButton1.setY(50);
        myButton1.setText("Button 1");
        myButton1.setBackgroundColor(Color.BLUE);

        Button myButton2 = new Button(this);
        myButton2.setHeight(125);
        myButton2.setWidth(225);
        myButton2.setX(175);
        myButton2.setY(75);
        myButton2.setText("Button 2");
        myButton2.setBackgroundColor(Color.GREEN);

        layout.addView(myButton1);
        layout.addView(myButton2);
        setContentView(layout);
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
