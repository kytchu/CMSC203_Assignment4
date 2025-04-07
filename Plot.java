


public class Plot {	
	private int width;
	private int depth;
	private int x;
	private int y;
	
	public Plot() {
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x,  int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
		
	}
	
	public Plot(Plot otherCompany) {
		this.x = otherCompany.x;
		this.y = otherCompany.y;
		this.width = otherCompany.width;
		this.depth = otherCompany.depth;
		
		
	}
	
	public boolean overlaps(Plot plot) {
		// we want to see if the parameter plot overlops a value from this plot
		  return !(x + width <= plot.x ||      
		             plot.x + plot.width <= x || 
		             y + depth <= plot.y ||      
		             plot.y + plot.depth <= y);  
		
	}
	
	public boolean encompasses(Plot plot) {
		// find if the parameter plot values are outside this plot
		if (plot.x >= this.x &&
                plot.y >= this.y &&
                plot.x + plot.width <= this.x + this.width &&
                plot.y + plot.depth <= this.y + this.depth) 
		{
			return true;
		} else {
			return false;
		} 
	}
	
// methods
	public int getWidth() {
		return width;
	}
	public int getDepth() {
		return depth;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setDepth(int depth){
		this.depth = depth;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public String toString() {
	    return x +  "," + y + "," + width + "," + depth;
	}
}
