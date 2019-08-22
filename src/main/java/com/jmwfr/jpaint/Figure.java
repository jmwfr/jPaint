package com.jmwfr.jpaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

/**
 * A special drawing component
 * @author JMA
 */
public abstract class Figure {
    /**
     * List of points for the Figure element to draw
     */
    public List<Point> pointsList;
    /**
     * Border color for the figure 
     */
    public Color borderColor;
    public Color fillColor;
    
    public abstract void draw(Graphics g);
}
