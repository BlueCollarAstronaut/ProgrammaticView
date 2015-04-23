package com.sstewart.programmaticview;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by sstewart on 4/23/2015.
 *
 * Utility class to create and initialize fixed size text views and  derivatives
 */
public class GuiUtil {

     public GuiUtil(Context context){
        this.context = context;
    }

    private Context context;

    public <T extends TextView> T Create(Class<T> clazz, float x, float y, int width, int height){

        Class[] paramTypes = { Context.class };
        Object[] paramValues = { context };
        try {
            T results = clazz.getConstructor(paramTypes).newInstance(paramValues);
            results.setX(x);
            results.setY(y);
            results.setWidth(width);
            results.setHeight(height);
            return results;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
