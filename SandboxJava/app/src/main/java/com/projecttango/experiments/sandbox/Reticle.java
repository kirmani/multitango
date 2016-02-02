/*
 * Reticle.java
 * Copyright (C) 2016 kirmani <sean@kirmani.io>
 *
 * Distributed under terms of the MIT license.
 */

package com.projecttango.experiments.sandbox;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class Reticle {
    private int mX;
    private int mY;

    public Reticle(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(metrics);
        mX = metrics.widthPixels / 2;
        mY = metrics.heightPixels / 2;
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }
}

