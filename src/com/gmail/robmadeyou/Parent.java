package com.gmail.robmadeyou;

import java.util.ArrayList;

/**
 * Created by apex on 02/03/14.
 */
public interface Parent {
    ArrayList<Part> getChildren();
    void addChild(Part p);
}