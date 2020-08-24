package ThirdExamplePizzaFactoryDesign.sotres;

import PizzaFactoryDesign.pizzas.VeggiePizza;
import ThirdExamplePizzaFactoryDesign.factories.ChicagoPizzaIngredientFactory;
import ThirdExamplePizzaFactoryDesign.factories.PizzaIngredientFactory;
import ThirdExamplePizzaFactoryDesign.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
