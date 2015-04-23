package com.sstewart.programmaticview;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // "Master Div" is, basically the full-page container
        DivLayout masterDiv = new DivLayout(this);

        // This util stores the context for future control creations
        GuiUtil util = new GuiUtil(this);

        // Create a "header" 200 pixels tall
        DivLayout headerDiv = masterDiv.addDiv(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        headerDiv.setBackgroundColor(Color.DKGRAY);

        // Stick a couple buttons in the header
        // NOTE: These buttons intentionally overlap each other as well as the header boundaries to
        // demonstrate the flexibility (risk?) of the fixed-sizing/-locating
        Button myButton1 = util.Create(Button.class, 50, 60, 250, 300);
        myButton1.setText("Button 1");
        myButton1.setBackgroundColor(Color.BLUE);
        headerDiv.addView(myButton1);

        Button myButton2 = util.Create(Button.class, 225, 90, 250, 250);
        myButton2.setText("Button 2");
        myButton2.setBackgroundColor(Color.RED);
        headerDiv.addView(myButton2);

        // The header was added to the main div as part of its creation, so it's sufficient to
        // set the content view to the masterDiv
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
