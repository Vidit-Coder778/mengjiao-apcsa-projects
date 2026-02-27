package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
        
    }

    public double perimeter() {
        
        double perimeter = 0.0;
        int n = myPolygon.size();
        if (n < 2) {
            return 0.0;
        }
        for (int i = 0; i < n; i++) {
           Point2D.Double current = myPolygon.get(i);
            Point2D.Double next = myPolygon.get((i + 1) % n);
            perimeter += current.distance(next); 
        }
        
        return perimeter;
    }

    public double area() {
        // TODO: Calculate the area.
        Double area = 0.0;
        int n = myPolygon.size();

        if (n < 3) {
            return area;
        }
        for (int i = 0; i < n; i++) {
            Point2D.Double current = myPolygon.get(i);
             Point2D.Double next = myPolygon.get((i+1) % n);
             area += (current.x * next.y) - (next.x - current.y);
        }
        return Math.abs(area) / 2.0;

    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try {
            // TODO: Draw the polygon.
            // Documents: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            int n = myPolygon.size();
            if (n < 2) {
                return;
            }
            POint2D.Double first = myPolygon.get(0);
            myDrawingTool.up();
            myDrawingTool.move(first.x,first.y);
            myDrawingTooll.down();
            for (int i = 1; i < n; i++) {
                Point2D.Double pt = myPolygon.get(i);
                myDrawingTool.move(pt.x,pt.y);
            }
            myDrawingTool.move(first.x,first.y);
            //myDrawingTool.move(50, 50);

        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
