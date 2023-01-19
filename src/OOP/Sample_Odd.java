package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample_Odd {
    boolean isOdd(int a){
        boolean k;
        if (a % 2 == 0) {
            k=false;
        }else{
            k=true;
        }
      return k;
    }
    int avg (ArrayList<Integer> data){
        int result = 0;
        int sum = 0;
        int count =0 ;
        for (Integer number: data) {
            sum += number;
            count++;
        }

        return sum/count;
    }

    public static void main(String[] args) {

        Sample_Odd cal = new Sample_Odd();
        System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력


        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력

    }
}
