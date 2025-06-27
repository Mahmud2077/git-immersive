package day12_practice_tasks;

public class Circle {

   private double radius;  //attributes

    public Circle(double radius) { // generating constructor for radius
        this.radius = radius;

    }

    public double getRadius() {  // getting the radius
        return radius;
    }

    public void setRadius(double radius) { // setting the radius
        this.radius = radius;
        if(radius > 0){
            this.radius = radius;
        }

    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }

}

/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.


 */