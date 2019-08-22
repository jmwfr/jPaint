/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmwfr.jpaint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
 
/**
 *
 * @author JMA
 */
public class MyCanvas extends JPanel {
    
    private List<Point> drawPoints = new ArrayList<Point>();
    public List<Figure> figuresList = new ArrayList<Figure>();
    
 
    private final Map<String, Color> colorMap = new HashMap<String, Color>() {
        {
            put("BLACK", Color.BLACK);
            put("BLUE", Color.BLUE);
            put("GREEN", Color.GREEN);
            put("RED", Color.RED);
            put("YELLOW", Color.YELLOW);
        }
    };
    
    public MyCanvas() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                myCanvas_MousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                myCanvas_MouseReleased(e);
            }         
        };
        
        this.addMouseListener(mouseAdapter);
    }
    
    private Figure getFigure() {
        JFrame mainFrame = (JFrame)SwingUtilities.getRootPane(this).getParent();
        JPanel panelTop = (JPanel) mainFrame.getContentPane().getComponent(0);
        Figure figure = null;
        
        for(Component c : panelTop.getComponents())
        {
            if (c instanceof JRadioButton && ((JRadioButton)c).isSelected()) {
                switch(c.getName()) {
                    case "rbLine":
                        figure = new Line();
                        break;
                    case "rbRectangle":
                        figure = new Rectangle();
                        break;
                    case "rbCircle":
                        figure = new Circle();
                        break;
                    default:
                        figure = null;
                }
                break;
            }
        }
        return figure;
    }
    
    private Color getColor(String colorControlName) {
        JFrame mainFrame = (JFrame)SwingUtilities.getRootPane(this).getParent();
        JPanel panelTop = (JPanel) mainFrame.getContentPane().getComponent(0);
        String color = null;
        
        for(Component c : panelTop.getComponents())
        {
            if (c instanceof JComboBox && c.getName() == colorControlName) {
                color = ((JComboBox) c).getSelectedItem().toString();
                break;
            }
        }
        
        if(color == "---")
            return null;
        
        return this.colorMap.get(color);
    }
    
    private void myCanvas_MousePressed(MouseEvent e) {
        this.drawPoints.add(e.getPoint());
    }
    
    private void myCanvas_MouseReleased(MouseEvent e) {
        this.drawPoints.add(e.getPoint());
        drawShape();
    }    
    
    private void drawShape() {
        Figure figureToDraw = this.getFigure();
        figureToDraw.borderColor = this.getColor("cbBorderColor");
        
        Color innerColor = this.getColor("cbFillColor");
        
        if(innerColor != null) {
            figureToDraw.fillColor = innerColor;
        }
        
        figureToDraw.pointsList = this.drawPoints;
        figureToDraw.draw(this.getGraphics());
        
        this.figuresList.add(figureToDraw);
        this.drawPoints.clear();        
    }
    
}
