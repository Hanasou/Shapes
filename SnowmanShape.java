
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
   Snowman that can be drawn
*/
public class SnowmanShape extends CompoundShape
{
   /**
      Constructs a car item.
      @param x the left of the bounding rectangle
      @param y the top of the bounding rectangle
      @param width the width of the bounding rectangle
   */
   public SnowmanShape(int x, int y, int width)
   {
	   Ellipse2D.Double top
       = new Ellipse2D.Double(x, y + width / 2, 
             width, width);
	   Ellipse2D.Double bottom
       = new Ellipse2D.Double(x, y - width / 2,
             width, width);
 		add(top);
 		add(bottom);
   }
   
}