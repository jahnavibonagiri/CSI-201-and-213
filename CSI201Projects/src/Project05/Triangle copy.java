package Project05;

import java.io.FileNotFoundException;

public class Triangle extends Shape {
	
	double sideOne, sideTwo, sideThree;
	String name;
	
	public Triangle() {
		super("Triangle");
		sideOne=1.0;
		sideTwo=1.0;
		sideThree=1.0;	
	}
	
	public Triangle( double side1, double side2, double side3, String name) {
		super(name);
		this.name=name;
		sideOne=side1;
		sideTwo=side2;
		sideThree=side3;
		//String Exception= "Not a Triangle";
	//if(side1 >= (side2+side3)){ // || side3 >= (side1+side2) || side2 >= (side1+side3)){
		//System.out.println("Side 1 Not Valid");
		//return Exception;
		
	}

	//}
	
	public double getSide1() {
		return sideOne;
	}
	public void setSide1(double side1) {
		sideOne=side1;
		
		if(sideOne >= (sideTwo+sideThree)){ // || side3 >= (side1+side2) || side2 >= (side1+side3)){
			System.out.println("Side 1 Not Valid");
		}
	}
	
	public double getSide2() {
		return sideTwo;
	}
	public void setSide2(double side2) {
		sideTwo= side2;
		if(sideTwo >= (sideOne+sideThree)){ // || side3 >= (side1+side2) || side2 >= (side1+side3)){
			System.out.println("Side 2 Not Valid");
		}
		
	}
	
	public double getSide3( ) {
		
		return sideThree;
	}
	public void setSide3(double side3) {
		sideThree=side3;
		if(sideThree >= (sideOne+sideTwo)){ // || side3 >= (side1+side2) || side2 >= (side1+side3)){
			System.out.println("Side 3 Not Valid");
		}
		
	}
	
	public double area() {
		double s=(sideOne+sideTwo+sideThree)/2;
		return Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
		//return area;
	}
	

	
	public String toString() {
		return super.toString()+ "\nName: "+ name+ "\nSide 1: "+ sideOne+ "\nSide 2: "+ sideTwo+ "\nSide 3: "+ sideThree +"\nArea: "+ area()+ "\n";
	}

	
	
	public boolean equals(Object obj){
		if (!(obj instanceof Triangle)){
			return false;
		}
		
		Triangle other = (Triangle)obj;
		return super.equals(obj)&& this.sideOne == other.sideOne && this.sideTwo == other.sideTwo && this.sideThree==other.sideThree;
				
	}
	
//} 


public Triangle(double side1, double side2, double side3) throws InvalidTriangleException{
	 try{
		 if(side1 <= (side2+side3) || side3 <= (side1+side2) || side2 <= (side1+side3)) {
			 //System.out.println("This is a valid triangle");			 
			 }
	 else
		 throw new InvalidTriangleException("Not a Triangle");
	}catch (InvalidTriangleException ex){
		ex.printStackTrace();
		
		
	}catch (Exception ex) {
		ex.printStackTrace();
	}finally {
		//System.out.println("Not a Triangle");
		InvalidTriangleException newTriangle= new InvalidTriangleException("Not a Triangle");
	}
}


//public Triangle(double side1, double side2, double side3) throws InvalidTriangleException{
//	if(side1 <= (side2+side3) || side3 <= (side1+side2) || side2 <= (side1+side3)) {
//			 System.out.println("This is a valid triangle");			 
//			 } 
//	else {
//		throw new InvalidTriangleException("Not a Triangle");
//	}
//		
//}
	


	
}


		 
		
	

		 

		
		
	
	
	
	

