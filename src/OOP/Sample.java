package OOP;
class Updater {
        void update(Counter counter) {
            counter.count++;
         }
        }

class Counter {
    int count = 0;  // 객체변수
}


public class Sample {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();

        //yUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
