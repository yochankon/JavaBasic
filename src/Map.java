import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> grade = new HashMap<>();
        grade.put("A",90);
        grade.put("B",80);
        grade.put("C",70);
        System.out.println("grade"+ grade);

        grade.remove("B");
        System.out.println("removeAfter"+grade);
    }
}
