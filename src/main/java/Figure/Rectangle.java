package Figure;

import Figure.Point;


public class Rectangle implements Figure {

    private Point p1,p2,p3,p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    /**Check for entry points in the figure
     *
     * @param point
     * @return true if contains
     */
    public boolean contains(Point point) {
        //Border search and entry check
      if( ((p1.getX() == p2.getX() ? p1.getX()<p3.getX() ? p1.getX() : p3.getX() : p1.getX()<p2.getX() ? p1.getX() : p2.getX()) <= point.getX() &&
          (p1.getX() == p2.getX() ? p1.getX()>p3.getX() ? p1.getX() : p3.getX() : p1.getX()>p2.getX() ? p1.getX() : p2.getX()) >= point.getX()) &&
              ((p1.getY() == p2.getY() ? p1.getY()<p3.getY() ? p1.getY() : p3.getY() : p1.getY()<p2.getY() ? p1.getY() : p2.getY()) <= point.getY() &&
                      (p1.getY() == p2.getY() ? p1.getY()>p3.getY() ? p1.getY() : p3.getY() : p1.getY()>p2.getY() ? p1.getY() : p2.getY()) >= point.getY()))
          return true;
      return false;
    }
}
