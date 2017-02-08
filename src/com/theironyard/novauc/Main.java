package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {

        //This is setting up 3 objects using the Cakes class
        Cakes brownie = new Cakes();
        Cakes lemonCake=new Cakes();
        Cakes poundCake=new Cakes();

        //All of the classes have an if statement that helps set the
        //ratings if it ever goes outside of the 0-thru-10 parameters it replies with an error message
        brownie.setName("Brownie");
        brownie.setCalories(550);
        brownie.setServingSize(2);
        brownie.setRating(8);

        lemonCake.setName("Lemon Cake");
        lemonCake.setCalories(410);
        lemonCake.setServingSize(1);
        lemonCake.setRating(4);

        poundCake.setName("Pound Cake");
        poundCake.setCalories(340);
        poundCake.setServingSize(3);
        poundCake.setRating(7);

        //This is displaying the object.name and using a method is the class to find out if it is healthy or not using a funtion
        System.out.println(brownie.getName());
        System.out.println("Is this snack healthy???   "+brownie.isHealthy(brownie.getCalories(),brownie.getServingSize()));
        System.out.println(lemonCake.getName());
        System.out.println("Is this snack healthy???   "+lemonCake.isHealthy(lemonCake.getCalories(),lemonCake.getServingSize()));
        System.out.println(poundCake.getName());
        System.out.println("Is this snack healthy???   "+poundCake.isHealthy(poundCake.getCalories(),poundCake.getServingSize()));

        Candy snickers = new Candy();

        snickers.setRating(9);
        snickers.setServingSize(1);
        snickers.setCalories(499);
        snickers.setFlavor("Chocolate");
        snickers.setName("Snickers");

        System.out.println(snickers.getName());
        System.out.println("Is this snack healthy???   "+snickers.isHealthy(snickers.getCalories(),snickers.getServingSize()));

        Chips doritos = new Chips();

        doritos.setName("Doritos");
        doritos.setBaked(true);
        doritos.setRating(8);
        doritos.setServingSize(2);
        doritos.setCalories(300);

        System.out.println(doritos.getName());
        System.out.println("Is this snack healthy???   "+doritos.isHealthy(doritos.getCalories(),doritos.getServingSize()));


        Pastries poptarts = new Pastries();

        poptarts.setName("POP-Tarts");
        poptarts.setCalories(1200);
        poptarts.setRating(3);
        poptarts.setServingSize(2);

        System.out.println(poptarts.getName());
        System.out.println("Is this snack healthy???   "+poptarts.isHealthy(poptarts.getCalories(),poptarts.getServingSize()));


        Sodas pepsi = new Sodas();

        pepsi.setName("Pepsi");
        pepsi.setServingSize(1);
        pepsi.setRating(8);
        pepsi.setCalories(900);
        pepsi.setCaffineFree(false);

        System.out.println(pepsi.getName());
        System.out.println("Is this snack healthy???   "+pepsi.isHealthy(pepsi.getCalories(),pepsi.getServingSize()));

        //This are using the constructor methods in each class

        Cakes       chocolate=  new Cakes("Chocolate",3000,2,12);
        Candy       skittles =  new Candy("Skittles",300,20,4,"Rainbow");
        Chips        fritos=    new Chips("Fritos", 400,3,8, false);
        Pastries   famousAmos = new Pastries("Famous Amos",500,3,8);
        Sodas       mountainDew=new Sodas("Mountain Dew",300,1,8,false);


        //HARD MODE activity
        CustomMath triangle = new CustomMath();
        CustomMath circle = new CustomMath();

        System.out.println(circle.AreaOfCircle(28));
        System.out.println(triangle.LengthOfHypotenuse(12,14));

        
    }
}
