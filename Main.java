import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        calcIndefinite();
    }

    public static BigDecimal calc(int max) {
        BigDecimal output = new BigDecimal(0);

        for (int i = 1; i < max; i++) {
            output = output.add(new BigDecimal(chi(i)/(double)i));
        }

        output = output.multiply(new BigDecimal((double)4));
        return output;
    }

    public static void calcIndefinite() {
        BigDecimal output = new BigDecimal(0);
        final BigDecimal multiplicand = new BigDecimal(4);
        // depends on power of your computer
        final int PRINT_INTERVAL = 2000000;

        for (int i = 1; i > 0; i++) {
            output = output.add(new BigDecimal(chi(i)/(double)i));
            i++;

            if (i % PRINT_INTERVAL == 0)
                System.out.println(output.multiply(multiplicand));
        }
    }

    public static double chi(int input) {
        int mod4 = input%4;

        if (mod4 == 0 || mod4 == 2)
            return 0;
        if (mod4 == 1)
            return 1;
        else //if (mod4 == 3)
            return -1;
    }
}