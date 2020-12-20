package gusakova;



interface RunHuman {


    void fastRun();
    void slowRun();

}

interface SwimHuman {

    void  fastSwim();
    void slowSwim();

}

abstract class Human implements SwimHuman, RunHuman{

    public void fastRun() {
        System.out.println("Я бегаю быстро");
    }

    public void slowRun() {
        System.out.println("Я бегаю медленно");
    }
    public void fastSwim() {
        System.out.println("Я плаваю быстро");
    }

    public void slowSwim() {
        System.out.println("Я плаваю медленно");
    }
}
class Child extends Human{
    @Override
    public void slowRun() {
        super.slowRun();
        System.out.println("Медленный бег");
    }

    @Override
    public void slowSwim() {
        super.slowSwim();
        System.out.println("Медленное плавание");
    }
}

class Adult extends Human{
    @Override
    public void fastRun() {
        super.fastRun();
        System.out.println("Быстрый бег");
    }

    @Override
    public void fastSwim() {
        super.fastSwim();
        System.out.println("Быстрое плавание");
    }
}
class HumanInterface {

    public static void main(String[] args) {
        Child  child = new Child();
        child.slowRun();
        child.slowSwim();
        Adult adult = new Adult();
        adult.fastRun();
        adult.fastSwim();

    }

}