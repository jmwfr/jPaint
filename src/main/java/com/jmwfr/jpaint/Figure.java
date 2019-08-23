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
    
    /**
     * Calculate width of the figure
     * @param startX
     * @param endX
     * @return int containing the width of the figure
     */
    public int calculateWidth(int startX, int endX) {
        int width = 0;
        if (startX > endX) {
            width = startX - endX;
        } else {
            width = endX - startX;
        }
        return width;
    }

    /**
     * Calculate the height of the figure
     * @param startY
     * @param endY
     * @return int containing the height of the figure
     */
    public int calculateHeight(int startY, int endY) {
        int height = 0;
        if (startY > endY) {
            height = startY - endY;
        } else {
            height = endY - startY;
        }
        return height;
    }
}
