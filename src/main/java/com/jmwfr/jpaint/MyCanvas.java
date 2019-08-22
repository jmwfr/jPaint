/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmwfr.jpaint;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author JMA
 */
public class MyCanvas extends JPanel {

    private List<Point> drawPoints = new ArrayList<Point>();
    public List<Figure> figuresList = new ArrayList<Figure>();

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

            @Override
            public void mouseDragged(MouseEvent e) {
                myCanvas_MouseDragged(e);
            }

        };

        this.addMouseListener(mouseAdapter);
        this.addMouseMotionListener(mouseAdapter);
    }

    private void timer_action() {
        this.repaint();
        for (Figure f : this.figuresList) {
            f.draw(this.getGraphics());
        }
    }

    private Figure getFigure() {
        JFrame mainFrame = (JFrame) SwingUtilities.getRootPane(this).getParent();
        JPanel panelTop = (JPanel) mainFrame.getContentPane().getComponent(0);
        Figure figure = null;

        for (Component c : panelTop.getComponents()) {
            if (c instanceof JRadioButton && ((JRadioButton) c).isSelected()) {
                switch (c.getName()) {
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
        JFrame mainFrame = (JFrame) SwingUtilities.getRootPane(this).getParent();
        JPanel panelTop = (JPanel) mainFrame.getContentPane().getComponent(0);
        Color color = null;

        for (Component c : panelTop.getComponents()) {
            if (c instanceof Button && c.getName() == colorControlName) {
                color = ((Button) c).getBackground();
                break;
            }
        }

        return color;
    }

    private void myCanvas_MousePressed(MouseEvent e) {
        this.drawPoints.add(e.getPoint());
    }

    private void myCanvas_MouseDragged(MouseEvent e) {
        if (this.drawPoints.size() == 1) {
            this.drawPoints.add(e.getPoint());
        } else {
            this.drawPoints.set(1, e.getPoint());
        }

        timer_action();

        drawShape(false);
    }

    private void myCanvas_MouseReleased(MouseEvent e) {
        this.drawPoints.set(1, e.getPoint());
        //this.getGraphics().setPaintMode();
        drawShape(true);
    }

    private void drawShape(Boolean reset) {
        this.getGraphics().setPaintMode();
        Figure figureToDraw = this.getFigure();
        figureToDraw.borderColor = this.getColor("btnBorderColor");
        figureToDraw.fillColor = this.getColor("btnFillColor");
        figureToDraw.pointsList = new ArrayList<Point>();
        figureToDraw.pointsList.addAll(drawPoints);

        figureToDraw.draw(this.getGraphics());

        if (reset) {
            this.figuresList.add(figureToDraw);

            for (Figure f : this.figuresList) {
                f.draw(this.getGraphics());
            }

            this.drawPoints.clear();
        }
    }

}
