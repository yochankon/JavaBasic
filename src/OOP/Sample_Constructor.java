package OOP;

class Calculator_Constructor {
    Integer value;

    Calculator_Constructor(){
        this.value = 0 ;
    }
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Sample_Constructor {
    public static void main(String[] args) {
        Calculator_Constructor cal = new Calculator_Constructor();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
