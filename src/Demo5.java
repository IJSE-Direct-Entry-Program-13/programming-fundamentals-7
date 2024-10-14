import java.util.Scanner;

void main() {
//    final var SCANNER = new Scanner(System.in);
//    System.out.print("Enter a price1: ");
//    double price1 = SCANNER.nextDouble();
//    System.out.println("Price1 is: " + price1);
//    System.out.print("Enter a price2: ");
//    double price2 = SCANNER.nextDouble();
//    System.out.println("Price2 is: " + price2);
//    System.out.println("==========================");
//    double total = price1 + price2;
//    System.out.println("Total: " + total);

    System.out.println(formatPrice(123456789.12557));
    System.out.println(formatPrice(125.));
    System.out.println(formatPrice(.2555));
}

String formatPrice(double price){
    return "Rs. %,.2f".formatted(price);
//    int integer = (int) price;
//    String precision = String.valueOf(price - integer).substring(2);
//    return "Rs. " + thousandGrouping(integer) + "." + formatPrecision(precision);
}

String formatPrecision(String number) {
    int value = 0;
    if (number.length() > 2) {
        value = Integer.valueOf(String.valueOf(number.charAt(1)));
        if (Integer.valueOf(String.valueOf(number.charAt(2))) >= 5) if (value < 9) value++;
    }
    return String.valueOf(number.charAt(0)) + value;
}

String thousandGrouping(int n) {
    String number = String.valueOf(n);
    int end = number.length();
    String value = "";
    for (int i = end - 3; i > 0; end = i, i -= 3) {
        value += STR.",\{number.substring(i, end)}";
    }
    return number.substring(0, end) + value;
}

void formatThousandGrouping(int n) {
    String number = String.valueOf(n);
    int i = number.length() % 3;
    String value = (number.substring(0, i));
    while (i < number.length()) {
        value += (value.isEmpty() ? "" : ",") + number.substring(i, i += 3);
    }
    System.out.println(value);
}