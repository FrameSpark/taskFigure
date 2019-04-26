import Figure.Figure;
import Figure.FigureFunc;
import Figure.Point;
import Figure.Rectangle;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(new Point(2,2),new Point(6,2), new Point(2,6), new Point(6,6));
        figures[1] = new Rectangle(new Point(1,1),new Point(1.5,1), new Point(1,2), new Point(1.5,2));
        figures[2] = new Rectangle(new Point(2.5,2),new Point(5.5,2), new Point(2.5,5.5), new Point(5.5,5.5));

        Point[] points = new Point[4];
        points[0] = new Point(1.25,1.5);
        points[1] = new Point(3,4);
        points[2] = new Point(2.5,5.5);
        points[3] = new Point(7,7);


        FigureFunc.checkContains(figures,points);
    }
}
