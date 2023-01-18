package control;

public class WhileTest {
    public static void main(String[] args) {
        int s = 0;
        int a = 1000;
        int sum = 0 ;

        while(s < 1000){
            s++;
            if(s%3==0){
                sum += s;
            }
        }

        System.out.println("sum=="+sum);

    }
}
