class Calculator{
    int a = 4;
    int b = 8;
    int sum = a+b;
    int sub = a-b;
    int mod = a%b;
    double c = 7.890;
    double d = 4.678;
    double mul = c*d;
    double div = c/d;
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.display();
    }
    void display(){
        System.out.println("Sum: "+ sum);
        System.out.println("Sub: "+ sub);
        System.out.println("Mod: "+ mod);
        System.out.println("Mul: "+ mul);
        System.out.println("Div: "+ div);       
    }
}