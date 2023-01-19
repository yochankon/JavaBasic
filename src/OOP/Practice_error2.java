package OOP;


interface Practice2_Predator {
    String bark();
}

abstract class Practice2_Animal {
    public String hello() {
        return "hello";
    }
}

class Practice2_Dog extends Practice2_Animal {
}

class Practice2_Lion extends Practice2_Animal implements Practice2_Predator {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Practice_error2 {
    public static void main(String[] args) {
        Practice2_Animal a = new Practice2_Lion();
        Practice2_Lion b = new Practice2_Lion();
        Practice2_Predator c = new Practice2_Lion();

        System.out.println(a.hello());  // 1번
        //System.out.println(a.bark());   // 2번 오류발생
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        //System.out.println(c.hello());  // 5번 오류발생
        System.out.println(c.bark());   // 6번
    }
}
