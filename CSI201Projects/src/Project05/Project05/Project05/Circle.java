package Project05;

/**
 *Representing a Circle subclass that extends the abstract class Shape
 *@author Jahnavi Bonagiri
 *@version 1.0
 */

public class Circle extends Shape {
	
	/**
	 * The Radius of this Circle
	 */
	double radius;
	/**
	 * The name of this Circle
	 */
	String name;
	/**
	 * The PI constant of this Circle
	 */
	double PI= 3.14159;
	/**
	 * Constructs a newly created Circle object that represents the name "Circle", and the radius.
	 */
	public Circle() {
		super("Circle");
		this.radius=1.0;
		
	}
	
	/**
	 * Constructs a newly created Circle object with String name, double r as parameters.
	 * @param name The name of this Circle
	 * @param r The radius of this Circle
	 */
	public Circle( double r, String name) {
		
		super(name);
		this.radius=r;
		this.name= name;
	}
	
	/**
	 * Returns the radius of the Circle
	 * @return the radius of the Circle
	 */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * Changes the radius of this Circle 
	 * @param r The radius of this Circle 
	 */
	public void setRadius( double r) {
		this.radius= r;
	}
	
	/**
	 * Returns the area of the Circle
	 * @return the area of the Circle
	 */
	public double area() {
		
		return PI* this.radius*this.radius;

	}

	/**
	 * Returns a string representation of this Circle. The returned string contains the type of this Circle and the name of this Circle, the radius, and area of this Circlee
	 * @return A string representation of this Circle, the area, radius, and name of this Circle
	 */
	public String toString() {
		return super.toString()+ "\nName: "+ this.name+ "\nRadius: "+ this.radius+ "\nArea: "+ area()+ "\n";
	}
	
	/**
	 * Indicates if this Circle is "equal to" some other object. If the other object is a Circle, this Circle is equal to the other Circle if they have the same name. 
	 * If the other object is not a Circle, this Circle is not equal to the other object.
	 * @param A reference to some other object
	 * @return A boolean value specifying if this Circle is equal to other object
	 */
	
	public boolean equals(Object obj){
		//The specific object isn't a Circle

		if (!(obj instanceof Circle)){
			return false;
		}
		//The specific object is a Circle

		Circle other = (Circle)obj;
		return super.equals(obj)&& this.radius == other.radius;
		
	}	
	}
	
				



