package OOP;


interface Practice_Predator {
}

class Practice_Animal {
}

class Practice_Dog extends Practice_Animal {
}

class Practice_Lion extends Practice_Animal implements Practice_Predator {
}

public class Practice_error1 {
    public static void main(String[] args) {
        Practice_Animal a = new Practice_Animal();  // 1번
        Practice_Animal b = new Practice_Dog();  // 2번
        Practice_Animal c = new Practice_Lion();  // 3번
        //Practice_Dog d = new Practice_Animal();  // is - a 관서 성립 안함
        Practice_Predator e = new Practice_Lion();  // 5번
    }
}
