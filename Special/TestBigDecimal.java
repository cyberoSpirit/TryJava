import java.math.BigDecimal;

public class TestBigDecimal {
    public static void TryBigDecimal() {
        double x = 0.1;

        System.out.println(x);

        double y = 0.2;
        double z = x + y;
        
        System.out.println("Double: " + z);

        BigDecimal x2 = new BigDecimal("0.1");

        System.out.println(x2);

        BigDecimal y2 = new BigDecimal(0.2);
        BigDecimal z2 = x2.add(y2);
        
        System.out.println("Double: " + z2);
    }
}
