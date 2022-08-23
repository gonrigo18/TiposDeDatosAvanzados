
import java.math.BigDecimal;
public class BigDecimals {
    public static void main(String[] args) {

        BigDecimal  valorA = new BigDecimal(0.1f);
        BigDecimal  valorB = new BigDecimal(0.1f);

        BigDecimal resultado = valorA.add(valorB);
        System.out.println(resultado.toString());



    }
}
