import java.util.Date;

void main(){
    String str1 = "This will simply embed a string: %s here \n";
    String str2 = "This will simply embed a decimal number: %d here \n";
    String str3 = "This will simply embed a floating point number: %f  here \n";

    // 1. printf(string, argument, argument, ....): void
    System.out.printf(str1, "Hello");
    System.out.printf(str2, 10);
    System.out.printf(str3, 10 + 2.2);

    System.out.println(STR."This will simply embed this expression \{10 + 12} here");

    // 2. String.format(string, argument, argument, ...): String
    String newString1 = String.format(str1, "World");
    System.out.print(newString1);
}