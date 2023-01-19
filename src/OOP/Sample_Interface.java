package OOP;

interface Predator{
    String getFood();

}

interface Barkable {
    void bark();
}
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator, Barkable{
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Predator, Barkable {
    public String getFood() {
        return "banana";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed "+predator.getFood());
    }

}

class Bouncer {
    void barkAnimal(Barkable animal) {
       animal.bark();
    }
}
public class Sample_Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
