package com.oodesign.solidprinciples.ocp.badexample;

/**
 * Open-Close Principle - Bad example
 *
 */
public class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawCircle(Circle r) {
    }

    public void drawRectangle(Rectangle r) {
    }
}
