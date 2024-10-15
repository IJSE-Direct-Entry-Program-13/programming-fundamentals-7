void main(){
    myMethod(10,20,30);
    myFun(10, 20, 30,40);
    method(10, 20, 30);
}

void myMethod(int... x){
    System.out.println("myMethod(int...)");
}

void myMethod(int x, int y, long...z){
    System.out.println("myMethod(int, int, long)");
}

//========================================

void myFun(int x, int y, long...z){
    System.out.println("myFun(int, int, long...)");
}

void myFun(int x, int y, int z, long... a){
    System.out.println("myFun(int, int, int, long...)");
}

//========================================

void method(int x, float... y){
    System.out.println("method(int, float...)");
}

void method(float y, double... z){
    System.out.println("method(float, double...)");
}