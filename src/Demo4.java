import java.math.BigInteger;
import java.util.Date;

void main(){
    System.out.printf("Value: %s \n", "10");
    System.out.printf("Value: %s \n", 10);
    System.out.printf("Value: %s \n", 10.25);

    System.out.println("====================");

    // System.out.printf("Value: %d \n", "10");
    System.out.printf("Value: %d \n", 10);
    //System.out.printf("Value: %d \n", 10.25);

    System.out.println("====================");

    //System.out.printf("Value: %f \n", "10.25");
    //System.out.printf("Value: %f \n", 10);
    System.out.printf("Value: %f \n", 10.25);

    System.out.println("====================");
    System.out.printf("Value: %c \n", 'A');
    System.out.printf("Value: %o \n", 8);
    System.out.printf("Value: %o \n", 10);
    System.out.printf("Value: %x \n", 10);
    System.out.printf("%n%n");
    System.out.printf("Value: %X \n", 10);
    System.out.printf("Value: %X \n", 250);
    System.out.printf("Value: %tH \n", new Date());
    System.out.printf("Value: %tI \n", new Date());
    System.out.printf("Value: %tB \n", new Date());
    System.out.printf("Value: %tT \n", new Date());
    System.out.printf("Value: %tF \n", new Date());

    long l1 = 10;
    long l2 = 5;
    System.out.printf("Value: %d \n", l1 + l2);
    BigInteger bi1 = new BigInteger("10");
    BigInteger bi2 = new BigInteger("5");
    System.out.printf("Value: %d \n", bi1.add(bi2));

    long l3 = 999999999999999999L;
    var bi3 = new BigInteger("999999999999999999999999999999999999");
    System.out.println(bi3);
}