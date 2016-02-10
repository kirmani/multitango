/*
 * PoseTracker.java
 * Copyright (C) 2016 kirmani <sean@kirmani.io>
 *
 * Distributed under terms of the MIT license.
 */

package com.projecttango.experiments.sandbox;

import org.rajawali3d.math.Quaternion;
import org.rajawali3d.math.vector.Vector3;

public class PoseTracker {
    private Vector3 mPosition;
    private Quaternion mOrientation;

    public PoseTracker(Vector3 position, Quaternion orientation) {
        mPosition = position.clone();
        mOrientation = orientation.clone();
    }

    public void setPosition(Vector3 position) {
        mPosition = position.clone();
    }

    public Vector3 getPosition() {
        return mPosition;
    }

    public void setOrientation(Quaternion orientation) {
        mOrientation = orientation.clone();
    }

    public Quaternion getOrientation() {
        return mOrientation;
    }
}

