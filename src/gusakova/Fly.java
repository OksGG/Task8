package gusakova;

interface Fly {


   void fly();


 }

  interface Run {


      void run();
 }

 interface Swim {


      void swim();
 }



abstract class Animals {

    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void getName();

}

class Dogs extends Animals implements Run, Swim {

    public Dogs(String type) {
        super(type);
    }

    @Override
    public void getName() {

    }

    public void run() {
        System.out.println("Я бегаю");
    }

    public void swim() {
        System.out.println("Я плаваю");
    }
}

class Cats extends Animals implements Run{

    public Cats(String type) {
        super(type);
    }

    @Override
    public void getName() {

    }

    public void run() {
        System.out.println("Я бегаю");
    }
}

class Ducks extends Animals implements Run, Swim, Fly{

    public Ducks(String type) {
        super(type);
    }
    @Override
    public void getName() {

    }

    public void run() {
        System.out.println("Я бегаю");
    }

    public void swim() {
        System.out.println("Я плаваю");
    }

    public void fly() {
        System.out.println("Я летаю");
    }
}

class AnimalInterface {

    public static void main(String[] args) {
        Dogs dogs = new Dogs("Тузик");
        dogs.run();
        dogs.swim();
        Cats cats = new Cats("Пушок");
        cats.run();
        Ducks ducks = new Ducks("Кря");
        ducks.fly();
        ducks.run();
        ducks.swim();
    }

}