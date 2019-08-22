package com.jmwfr.jpaint;

import java.awt.Graphics;
import java.awt.Point;

public class Line extends Figure {
    
    @Override
    public void draw(Graphics g) {
        Point startPoint = this.pointsList.get(0);
        Point endPoint = this.pointsList.get(1);
        
        g.setColor(this.borderColor);
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}
