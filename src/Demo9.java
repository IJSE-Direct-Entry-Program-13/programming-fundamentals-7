import java.text.DecimalFormat;
import java.text.NumberFormat;

void main(){
    // 1. Obtaining a NumberFormat instance
    NumberFormat instance1 = NumberFormat.getInstance();
    // 2. Config the NumberFormat instance
    instance1.setGroupingUsed(true);
    instance1.setMaximumFractionDigits(4);
    instance1.setMinimumFractionDigits(2);
    instance1.setMinimumIntegerDigits(5);
    // 3. Format
    String formattedText = instance1.format(10.1234578);
    System.out.println(formattedText);

    var instance2 = new DecimalFormat(".####");
    String fText = instance2.format(10.2545641);
    System.out.println(fText);

    var instance3 = new DecimalFormat("###,###.####");
    String fText2 = instance3.format(1234561.123456);
    System.out.println(fText2);

    System.out.println(new DecimalFormat("C-###").format(1));
    System.out.println(new DecimalFormat("C-###").format(25));
    System.out.println(new DecimalFormat("C-000").format(1));
    System.out.println(new DecimalFormat("C-000").format(25));
}