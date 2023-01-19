package OOP;


interface Metal{
    int getValue();
}

class Gold implements Metal {
    public int getValue(){
        return 100;
    }
}

class Silver implements Metal{
    @Override
    public int getValue() {
        return 90;
    }
}

class Bronze implements Metal{
    @Override
    public int getValue() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;
    public void add(Metal metal){
        this.value += metal.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Practice_Interface {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}
