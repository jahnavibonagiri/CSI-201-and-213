package Project05;

/**
 * Representing a generic abstract shape with name which extends Rectangle, Triangle and Circle subclasses.
 * @author Jahnavi Bonagiri
 *@version 1.0
 */


public abstract class Shape{
	/**
	 * The name of this shape
	 */
	public String name;
	/**
	 * Constructs a newly created Shape object that represents a Shape with an empty name
	 */
	
	public Shape() {
		name=this.getClass().getName();
	}
	/**
	 * Constructs a newly created Shape object with String name parameter
	 * @param name The name of this Shape
	 */
	public Shape(String name) {
		this.name= name;
	}
	
	/**
	 * Returns the name of this Shape
	 * @return the name of this Shape
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Changes the name of this Shape
	 * @param name The name of this Shape
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * Returns the area of the Shape
	 * @return the area of the Shape
	 * @throws InvalidTriangleException throws the Invalid Triangle exception in the triangle subclass when invalid side is read.
	 */
	
	public double area() throws InvalidTriangleException{
		return area();
	}
	
	/**
	 * Returns a string representation of this Shape. The returned string contains the type of this Shape and the name of this Shape
	 * @return A string representation of this Shape
	 */
	public String toString() {
		return this.getClass().getSimpleName();
	
	}
	
	/**
	 * Indicates if this Shape is "equal to" some other object. If the other object is a Shape, this Shape is equal to the other Shape if they have the same name. 
	 * If the other object is not a Shape, this Shape is not equal to the other object.
	 * @param A reference to some other object
	 * @return A boolean value specifying if this Shape is equal to other object
	 */
	public boolean equals(Object obj){
		//The specific object isn't a Shape
		if (!(obj instanceof Shape)){
			return false;
		}
		
		//The specific object is a Shape
		Shape other = (Shape)obj;
		return (this.name).equalsIgnoreCase(other.name);
	}
	 
}



	
		



	

