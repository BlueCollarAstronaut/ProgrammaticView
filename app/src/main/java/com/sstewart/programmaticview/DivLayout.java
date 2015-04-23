package com.sstewart.programmaticview;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class DivLayout extends RelativeLayout {

    public DivLayout(Context context) {
        super(context);
    }

    public DivLayout(Context context, ViewGroup.LayoutParams layoutParams) {
        super(context);
        super.setLayoutParams(layoutParams);
    }

    public DivLayout addDiv(){
        DivLayout child = new DivLayout(this.getContext());
        this.addView(child);
        return child;
    }

    public DivLayout addDiv(ViewGroup.LayoutParams layoutParams){
        DivLayout child = new DivLayout(this.getContext());
        child.setLayoutParams(layoutParams);
        this.addView(child);
        return child;
    }

}
