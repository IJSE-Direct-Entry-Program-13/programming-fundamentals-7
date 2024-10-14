import java.util.Formatter;

void main(){
    // 2. String.format(string, argument1, argument2, ...) String
    // 3. "".formatted(argument1, argument2, ...): String

    int total = 10;
    System.out.println("Total: " + total + " is payable");
    System.out.println(STR."Total: \{total} is payable"); // String Template (Preview)

    // Performance + [Formatting]
    // 1.
    System.out.printf("Total: %05d is payable \n", total);
    // 2.
    String formatted1 = String
            .format("Total: %05d is payable", total);
    System.out.println(formatted1);
    // 3. (Since 15)
    String formatted2 = "Total: %05d is payable".formatted(total);
    System.out.println(formatted2);
    // 4.
    Formatter formatted3 = new Formatter()
            .format("Total: %05d is payable", total);
    System.out.println(formatted3);
}