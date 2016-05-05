package com.oodesign.solidprinciples.ocp.goodexample;

/**
 * Open-Close Principle - good example
 *
 */
public class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }
    
}
