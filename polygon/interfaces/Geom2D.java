package polygon.interfaces;

import java.awt.*;

public interface Geom2D {
	
	double getArea();				// public abstract
	double getPerimeter();			// public abstract
	void   drawIllustration();		// public abstract
	void  drawShape(Graphics g, int offsetX, int offsetY);
}
