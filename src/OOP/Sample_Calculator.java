package OOP;


class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }


}
class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator{

    void add(int val) {
        this.value += val;
        if(this.value >= 100) {
            this.value = 100;
        }

    }

}


public class Sample_Calculator {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);

        System.out.println(cal.getValue());  // 10 출력
    }
}
