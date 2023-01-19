package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample_objectNew {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        // ArrayList<Integer> b = new ArrayList<>(a); 다른 객체 생성 하면 달라집
        a.add(4);
        System.out.println(b.size()); // 1,2,3,4

        System.out.println(a==b);  // true 출력 // a와 b는 동일한 객체를 가르킴



    }
}
