
public class Property{
	private String propertyName;
	private String city;
	private String owner;
	private Plot plot;
	private double rentAmount;
	
	public Property(){
		// make everything default or have no values
		this.propertyName = "";
		this.city = "";
		this.owner= "";
		this.rentAmount = 0;
		this.plot = new Plot();
	
	}
	
	// constructs w/ new values based off input (makes a default plot)
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	
	// constructs using parameterized values, even w/ plot.
	 public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
	        this.propertyName = propertyName;
	        this.city = city; 
	        this.owner = owner;
	        this.rentAmount = rentAmount;
	        this.plot = new Plot(x, y, width, depth);
	}
	
	// using the values of another property
	// making a copy
	public Property(Property otherProperty){
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = new Plot(otherProperty.plot);
	}
	
	// methods

	// to equals
	public boolean equals(Property otherProperty){
		return (propertyName.equals(otherProperty.propertyName) && city.equals(otherProperty.city) && 
			owner.equals(otherProperty.owner) && rentAmount == rentAmount.equals(otherProperty.rentAmount)&& 
			plot.equals(otherProperty.plot)); 

	}
	public String getCity() {
		return city;
	}
	public String getOwner() {
		return owner;
	}
	public Plot getPlot() {
		return plot;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
	
}
