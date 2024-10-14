import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = SCANNER.nextLine();
    System.out.print("Enter you age: ");
    int age = SCANNER.nextInt();
    SCANNER.skip(System.lineSeparator());
    System.out.print("Enter your salary: ");
    double salary = SCANNER.nextDouble();
    SCANNER.skip(System.lineSeparator());

    System.out.printf("""
                Welcome %s!
                
                Name: %1$s
                Age: %d
                Salary: %.2f
                
                Bye bye %1$s!
            """, name,  age, salary);
}