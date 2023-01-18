package control;

public class ForEachAvg {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0 ;
        int count =0 ;
        for (int number :marks){
            sum += number;
            count++;
        }
        System.out.println(sum/count);
    }
}
