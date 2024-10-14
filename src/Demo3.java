import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    while (true) {
        System.out.print("Enter your cid: ");
        int cid = SCANNER.nextInt();
        //System.out.println("Your cid is: " + generateId("C", cid));
        System.out.println("Your cid is: " + "C-%04d".formatted(cid));
        System.out.print("Enter your sid: ");
        int sid = SCANNER.nextInt();
        //System.out.println("Your sid is: " + generateId("S", sid));
        System.out.println("Your sid is: " + "S-%04d".formatted(sid));
    }
}

String generateId(String prefix, int id){
    //return prefix + "-" + (id < 10 ? STR."000\{id}" : id < 100 ? STR."00\{id}": id < 1000 ? STR."0\{id}" : STR."\{id}");
    String formattedId = STR."\{prefix}-";
    if (id < 10){
        formattedId += STR."000\{id}";
    }else if (id < 100){
        formattedId += STR."00\{id}";
    }else if (id < 1000){
        formattedId += STR."0\{id}";
    }else{
        formattedId += STR."\{id}";
    }
    return formattedId;
}

