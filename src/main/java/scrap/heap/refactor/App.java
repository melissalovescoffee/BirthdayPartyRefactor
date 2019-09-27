package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

public static void main(String[] args) {

    CakeOrder cake = new CakeOrder();
    BalloonOrder balloons = new BalloonOrder();

    //Place birthday party orders
    balloons.setBalloonColor("red");
    balloons.setMaterial("mylar");
    balloons.setNumber("4");
    cake.setFlavor("chocolate");
    cake.setFrostingFlavor("chocolate");
    cake.setShape("circle");
    cake.setSize("large");
    cake.setCakeColor("brown");
    order(balloons, cake);

    balloons.setBalloonColor("blue");
    balloons.setMaterial("latex");
    balloons.setNumber("7");
    cake.setFlavor("Vanilla");
    cake.setFrostingFlavor("chocelate");
    cake.setShape("square");
    cake.setSize("med");
    cake.setCakeColor("brown");
    order(balloons, cake);

    balloons.setBalloonColor("yellow");
    balloons.setMaterial("mylar");
    balloons.setNumber("4");
    cake.setFlavor("vanilla");
    cake.setFrostingFlavor("vanilla");
    cake.setShape("square");
    cake.setSize("small");
    cake.setCakeColor("yellow");
    order(balloons, cake);

}

private static void order(BalloonOrder b, CakeOrder c) {

    orderBalloons(b);

    orderCake(c);
}

private static void orderBalloons(BalloonOrder b) {

    //for the purposes of this exercise, pretend this method works and adds balloons to the order
    System.out.println("Balloons ordered; " + b.balloonColor + ", " + b.material + ", " + b.number);

}

private static void orderCake(CakeOrder c) {

    //for the purposes of this exercise, pretend that this method adds a cake to the order
    System.out.println("cake ordered; " + c.flavor + ", " + c.frostingFlavor + ", " + c.shape + ", " + c.size + ", " + c.cakeColor);

}

public static class BalloonOrder {

    // Variables
    String balloonColor;
    String material;
    String number;

    // Constructor
    public BalloonOrder() {
    }

    public void setBalloonColor(String balloonColor) {
        this.balloonColor = balloonColor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

public static class CakeOrder {

    // Variables
    String flavor;
    String frostingFlavor;
    String shape;
    String size;
    String cakeColor;

    // Constructor
    public CakeOrder() {
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCakeColor(String cakeColor) {
        this.cakeColor = cakeColor;
    }
}
    
}
