package Project05;

/**
 *Representing a Triangle subclass that extends the abstract class Shape
 *@author Jahnavi Bonagiri
 *@version 1.0
 */
public class Triangle extends Shape {
	
	/**
	 * The sides of this Triangle
	 */
	
	double sideOne, sideTwo, sideThree;
	
	/**
	 * The name of this Circle
	 */
	String name;
	/**
	 * Constructs a newly created Triangle object that represents the name "Triangle", and the sides 1,2,3 of the Triangle.
	 */
	public Triangle() {
		super("Triangle");
		this.sideOne=1.0;
		this.sideTwo=1.0;
		this.sideThree=1.0;	
	}
	
	/**
	 * Constructs a newly created Triangle object with String name, double side1, side2, side3 as parameters.
	 * @param name The name of this Triangle
	 * @param side1 The side1 of this Triangle
	 * @param side2 The side2 of this Triangle
	 * @param side3 The side3 of this Triangle
	 */
	 
	public Triangle( double side1, double side2, double side3, String name) {
		super(name);
		this.name=name;
		this.sideOne=side1;
		this.sideTwo=side2;
		this.sideThree=side3;

	}
	/**
	 * Returns the side1 of the Triangle
	 * @return the side1 of the Triangle
	 */
	
	public double getSide1() {
		return this.sideOne;
	}
	/**
	 * Changes the side1 of this Triangle 
	 * @param side1 The side1 of this Triangle
	 */
	public void setSide1(double side1) {
		this.sideOne=side1;
	}
	
	/**
	 * Returns the side2 of the Triangle
	 * @return the side2 of the Triangle
	 */
	public double getSide2() {
		return this.sideTwo;
	}
	/**
	 * Changes the side2 of this Triangle 
	 * @param side2 The side2 of this Triangle
	 */
	public void setSide2(double side2) {
		this.sideTwo= side2;
		
		
	}
	/**
	 * Returns the side3 of the Triangle
	 * @return the side3 of the Triangle
	 */
	public double getSide3( ) {
		
		return this.sideThree;
	}
	/**
	 * Changes the side3 of this Triangle 
	 * @param side3 The side3 of this Triangle
	 */
	public void setSide3(double side3) {
		this.sideThree=side3;
		
	}
	
	/**
	 * Returns the area of the Triangle and figures out which side out the three triangle sides is invalid and throws an InavlidTriangleException
	 * @return the area of the Triangle
	 */
	
	public double area() throws InvalidTriangleException{ 
		
		//If side 1 is greater than side 2 and side 3, side 1 is invalid. Throws an Exception
		if(sideOne >= (sideTwo+sideThree)){ 
			System.out.println("For Triangle, "+ this.name+" ,Side 1 Not Valid");
			throw new InvalidTriangleException("Invalid Triangle");
		}
		//If side 2 is greater than side 1 and side 3, side 2 is invalid. Throws an Exception

		else if(sideTwo >= (sideOne+sideThree)) {
			System.out.println("For Triangle, "+ this.name+" ,Side 2 Not Valid");
			throw new InvalidTriangleException("Invalid Triangle");
		}	
		//If side 3 is greater than side 1 and side 2, side 3 is invalid. Throws an Exception

		else if(sideThree >= (sideOne+sideTwo)) {
			System.out.println("For Triangle, "+ this.name+" ,Side 3 Not Valid");
			throw new InvalidTriangleException("Invalid Triangle");
		}
		
		//Calculates the area of the Triangle and returns the area.
		double s=(sideOne+sideTwo+sideThree)/2;
		return Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
	}
	

	/**
	 * Returns a string representation of this Triangle. The returned string contains the type of this Triangle and the name of this Triangle, the sides, and area of this Triangle
	 * @return A string representation of the Triangle, the area, sides, and name of this Triangle. 
	 */
	public String toString() {
		
		//Uses try and catch statements to throw the exception if the sides are incorrect. 
		try {
			return super.toString()+ "\nName: "+ this.name+ "\nSide 1: "+ this.sideOne+ "\nSide 2: "+ this.sideTwo+ "\nSide 3: "+ this.sideThree +"\nArea: "+ area()+ "\n";
		} catch (InvalidTriangleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		return super.toString()+"\nName: "+ this.name+ "\nSide 1: "+ this.sideOne+ "\nSide 2: "+ this.sideTwo+ "\nSide 3: "+ this.sideThree +"\nArea cannot be calculated";
	}
	/**
	 * Indicates if this Triangle is "equal to" some other object. If the other object is a Triangle, this Triangle is equal to the other Triangle if they have the same name. 
	 * If the other object is not a Triangle, this triangle is not equal to the other object.
	 * @param A reference to some other object
	 * @return A boolean value specifying if this Triangle is equal to other object
	 */
	
	
	public boolean equals(Object obj){
		//The specific object isn't a Triangle

		if (!(obj instanceof Triangle)){
			return false;
		}
		//The specific object is a Triangle

		Triangle other = (Triangle)obj;
		return super.equals(obj)&& this.sideOne == other.sideOne && this.sideTwo == other.sideTwo && this.sideThree==other.sideThree;
				
	}
	
	
	/**
	 * Constructs a newly created Triangle object with String name, double side1, side2, side3 as parameters with a Throw Invalid Triangle Exception.
	 * @param name The name of this Triangle
	 * @param side1 The side1 of this Triangle
	 * @param side2 The side2 of this Triangle
	 * @param side3 The side3 of this Triangle
	 */
	
public Triangle(String name, double side1, double side2, double side3) throws InvalidTriangleException{
	
	super(name);
	this.name=name;
	
	//Uses try and catch statements to catch the exception
	 try{
		 //If triangle has valid sides, establish the sides.
		 
		 if((side1+side2)>side3 || (side2+side3)>side1|| (side1+side3)>side2 ){
			 	this.sideOne=side1;
				this.sideTwo=side2;
				this.sideThree=side3;
	
		 }
	// Else, throw an exception because it contains invalid sides.
	 else
		 throw new InvalidTriangleException("Not a Triangle");
		 //Catches exception and Prints the trace
	}catch (InvalidTriangleException ex){
		ex.printStackTrace();
		System.out.println(ex);	
		
		//Catches exception and Prints the trace
	}catch (Exception ex) {
		ex.printStackTrace();
		System.out.println(ex);	
		//Passes message to constructor
	}finally {
		new InvalidTriangleException("Not a Triangle");
	}
}
	
}


		 
		
	

		 

		
		
	
	
	
	

