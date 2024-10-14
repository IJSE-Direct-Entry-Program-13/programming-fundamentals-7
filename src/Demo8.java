import java.math.BigDecimal;
import java.math.BigInteger;

void main(){
    System.out.printf("%5s %n", "abc");
    System.out.printf("%-5s %n", "abc");
    System.out.println("=============");

    System.out.printf("%5d %n", 123);
    System.out.printf("%05d %n", 123);
    //System.out.printf("%-05d %n", 123);
    //System.out.printf("%0-5d %n", 123);
    System.out.println("=============");

    System.out.printf("%,d %n",1255550);
    // System.out.printf("%,s","abc");

    System.out.printf("%+,020d %n",1255550);

    System.out.printf("%d %n", new BigInteger("10"));
    System.out.printf("%f %n", new BigDecimal("10.25"));
}