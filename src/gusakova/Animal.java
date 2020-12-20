package gusakova;

 abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void getName();

}

class Dog extends Animal {

    public Dog(String type) {
        super(type);
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

}

class Cat extends Animal {

    public Cat(String type) {
        super(type);
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

}

class AnimalName {

    public static void main(String[] args) {
        Animal animalDog = new Dog("Шарик");
        Animal animalCat = new Cat("Муся");
        animalDog.getName();
        animalCat.getName();
    }

}
