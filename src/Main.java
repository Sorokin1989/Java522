import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String dough;
    private String souce;
    private String topping;
    private String name;

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza " + name + " => " + " topping " +
                topping + " souce " + souce + " dough " + dough;
    }

    public Pizza(String name) {
        this.name = name;
    }
}
    interface PizzaBuilder {
        Pizza build();

        void buildSouce();

        void buildTopping();

        //        void buildName();
//    }
        void buildDough();

    class MargaretPizzaBuilder implements PizzaBuilder {
private Pizza pizza;

        public MargaretPizzaBuilder() {
          pizza=new Pizza("MargaretPizza");
        }


        @Override
        public Pizza build() {
            return pizza;
        }


        @Override
        public void buildSouce() {
this.pizza.setSouce("томатный");
        }

        @Override
        public void buildTopping() {
this.pizza.setTopping("сыр и колбаса");
        }

        public void buildDough(){
            this.pizza.setDough("тонкое");
        }

    }

    class HawainPizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        public HawainPizzaBuilder() {
            pizza=new Pizza("HawainPizza");
        }





        @Override
        public Pizza build() {
            return pizza;
        }

        @Override
        public void buildSouce() {
            this.pizza.setSouce("без соуса");
        }

        @Override
        public void buildTopping() {
            this.pizza.setTopping("ананас и ветчина");
        }

        @Override
        public void buildDough() {
            this.pizza.setDough("толстое");
        }

    }

}

class Director{
    List<PizzaBuilder> pizzaBuilders;
    Director(List<PizzaBuilder> pizzaBuilders) {
        this.pizzaBuilders=pizzaBuilders;
    }
private List<Pizza> getPizzaDifferent() {
List<Pizza> list=new ArrayList<>();
for (PizzaBuilder pizzaBuilder : pizzaBuilders) {
    pizzaBuilder.buildSouce();
    pizzaBuilder.buildTopping();
    pizzaBuilder.buildDough();

    Pizza pizza=pizzaBuilder.build();
    list.add(pizza);
}
return list;

}
    public List<Pizza> getPizza(){
return getPizzaDifferent();
    }

}




public class Main {
    public static void main(String[] args) {

        List<PizzaBuilder> pizzaBuilders=new ArrayList<>();
        pizzaBuilders.addAll(
                List.of(
                        new PizzaBuilder.MargaretPizzaBuilder(),
                        new PizzaBuilder.MargaretPizzaBuilder(),
                        new PizzaBuilder.MargaretPizzaBuilder(),
                        new PizzaBuilder.HawainPizzaBuilder(),
                        new PizzaBuilder.HawainPizzaBuilder(),
                        new PizzaBuilder.HawainPizzaBuilder(),
                        new PizzaBuilder.HawainPizzaBuilder()


                )

        );

Director director=new Director(pizzaBuilders);
        for (int i = 0; i < director.getPizza().size(); i++) {
            System.out.println(director.getPizza().get(i));
        }
    }
}