package com.example.doodleapp;

import android.graphics.Path;

public class PathStroke {
    public int color;
    public float size;
    public Path path;

    public PathStroke(int color, float size) {
        this.color = color;
        this.size = size;
        this.path = new Path();
    }
}
