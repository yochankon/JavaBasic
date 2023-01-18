import java.util.HashMap;

public class EnumChange {

    enum CofferType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    static void printCofferPrice(CofferType type){
        HashMap<CofferType, Integer> priceMap = new HashMap<>();
        priceMap.put(CofferType.AMERICANO,3000);
        priceMap.put(CofferType.ICE_AMERICANO,4000);
        priceMap.put(CofferType.CAFE_LATTE,5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.",price));
    }
    public static void main(String[] args) {
        printCofferPrice(CofferType.AMERICANO);
        printCofferPrice(CofferType.CAFE_LATTE); //NullPointException 발생

    }
}
