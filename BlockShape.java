import java.awt.*;
import java.awt.geom.*;

/**
   A rectangle with an X in it.
*/
public class BlockShape extends CompoundShape
{
   /**
      Constructs a car shape.
      @param x the left of the bounding rectangle
      @param y the top of the bounding rectangle
      @param width the width of the bounding rectangle
   */
   public BlockShape(int x, int y, int width)
   {
      Rectangle2D.Double body
         = new Rectangle2D.Double(x, y, 
            width, width);
      // The bottom of the front windshield
      Point2D.Double r1
         = new Point2D.Double(x, y);
      // The front of the roof
      Point2D.Double r2
         = new Point2D.Double(x + width, y + width);
      // The rear of the roof
      Point2D.Double r3
         = new Point2D.Double(x + width, y);
      // The bottom of the rear windshield
      Point2D.Double r4
         = new Point2D.Double(x, y + width);
      Line2D.Double l1
         = new Line2D.Double(r1, r2);
      Line2D.Double l2
         = new Line2D.Double(r3, r4);

      add(body);
      add(l1);
      add(l2);
   }
}