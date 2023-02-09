package Project05;

/**
 *Representing a Rectangle subclass that extends the abstract class Shape
 *@author Jahnavi Bonagiri
 *@version 1.0
 */

class Rectangle extends Shape{
	
	/**
	 * The width of this Rectangle
	 */
	
	double width;
	/**
	 * The width of this Rectangle
	 */
	double length;
	
	/**
	 * Constructs a newly created Rectangle object that represents the name "Rectangle", and the width and the length.
	 */
	public Rectangle() {
		super("Rectangle");
		this.width=1.0;
		this.length=1.0;
		
			}
	
	/**
	 * Constructs a newly created Rectangle object with String name, double w, double l as parameters.
	 * @param name The name of this Rectangle
	 * @param w The width of this Rectangle
	 * @param l The length of this Rectangle
	 */
	public Rectangle(double w, double l, String name) {
		super(name);
		this.name=name;
		this.length= l;
		this.width= w;
		
	}
	/**
	 * Returns the width of this Rectangle
	 * @return the width of this Rectangle
	 */
	
	public double getwidth() {
		
		return this.width;
	}
	
	/**
	 * Changes the width of this Rectangle
	 * @param w The width of this Rectangle
	 */
	public void setwidth( double w) {
		
		this.width=w;
	}
	/**
	 * Returns the length of this Rectangle
	 * @return the length of this Rectangle
	 */
	
	public double getlength() {
		
		return this.length;
	}
	
	/**
	 * Changes the length of this Rectangle
	 * @param l The length of this Rectangle
	 */
	public void setlength( double l) {
		this.length=l;
	}
	
	/**
	 * Returns the area of the Rectangle
	 * @return the area of the Rectangle
	 */

	public double area() {
		return this.length*this.width;
	}
	/**
	 * Returns a string representation of this Rectangle. The returned string contains the type of this Rectangle and the name of this Rectangle, the length, width and area of this Rectangle
	 * @return A string representation of this Rectangle, the area, length, name and width of this Rectangle.
	 */
	
	public String toString() {
		return super.toString()+ "\nName: "+ this.name+ "\nLength: " + this.length+ " \nWidth: " +this.width+ " \nArea: " +area()+ "\n";
	}

	/**
	 * Indicates if this Rectangle is "equal to" some other object. If the other object is a Rectangle, this Rectangle is equal to the other Rectangle if they have the same name. 
	 * If the other object is not a Rectangle, this Rectangle is not equal to the other object.
	 * @param A reference to some other object
	 * @return A boolean value specifying if this Rectangle is equal to other object
	 */
	public boolean equals(Object obj){
		//The specific object isn't a Rectangle

		if (!(obj instanceof Rectangle)){
			return false;
		}
		//The specific object is a Rectangle

		Rectangle other = (Rectangle)obj;
		return super.equals(obj)&& this.width == other.width && this.length == other.length;
		
	}	
	
}


