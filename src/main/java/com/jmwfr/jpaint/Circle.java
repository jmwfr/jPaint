package com.jmwfr.jpaint;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends Figure {

    @Override
    public void draw(Graphics g) {
        Point startPoint = this.pointsList.get(0);
        Point endPoint = this.pointsList.get(1);
        
        int width = this.calculateWidth(startPoint.x, endPoint.x);
        int height = this.calculateHeight(startPoint.y, endPoint.y);
        
        g.setColor(this.borderColor);
        
        if(endPoint.x > startPoint.x)
            g.drawOval(startPoint.x, startPoint.y, width, height);
        else
            g.drawOval(endPoint.x, endPoint.y, width, height);
        
        if(this.fillColor != null) {
            g.setColor(this.fillColor);
            if(endPoint.x > startPoint.x)
                g.fillOval(startPoint.x + 1, startPoint.y + 1, width - 2, height - 2);
            else
                g.fillOval(endPoint.x + 1, endPoint.y + 1, width - 2, height - 2);
        }
    }
}
