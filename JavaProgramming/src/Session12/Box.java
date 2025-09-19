package Session12;

public class Box
{
    double width, height, depth;
    
    Box()
    {
    	width=height=depth=0;
    }
    
    Box(double w, double h, double d)
    {
    	width=w;
    	height=h;
    	depth=d;
    }
    
    Box(double length)
    {
    	width=height=depth=length;
    }
    
    double Volume()
    {
    	return(width*height*depth);
    }
}
