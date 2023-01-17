public class jumin {
    public static void main(String[] args){
        String jumin = "881120-1068234";
        int k = jumin.indexOf("-");
        System.out.println(jumin.substring(0,k));
        System.out.println(jumin.substring(k+1,14));
    }
}
