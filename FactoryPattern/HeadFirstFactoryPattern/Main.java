package ThirdExamplePizzaFactoryDesign;

import ThirdExamplePizzaFactoryDesign.factories.PizzaIngredientFactory;
import ThirdExamplePizzaFactoryDesign.pizzas.CheesePizza;
import ThirdExamplePizzaFactoryDesign.pizzas.Pizza;
import ThirdExamplePizzaFactoryDesign.sotres.ChicagoPizzaStore;
import ThirdExamplePizzaFactoryDesign.sotres.NYPizzaStore;
import ThirdExamplePizzaFactoryDesign.sotres.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
