package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }



    public int calcCost(){
        int baseValue = switch (size){
            case "small" -> 10;
            case "medium" -> 12;
            case "large" -> 14;
            default -> 0;
        };

        return baseValue + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
    }


    public String toString() {
        return "Your " + size + " pizza with " + numberOfCheeseToppings + " cheese toppings and "
                + numberOfPepperoniToppings + " pepperoni toppings costs a total of $" + calcCost() ;
    }
}


/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */