class Rectangle{
    double a=7.8;
    double b=9.8;
    double area=a*b;
public static void main(String[]args){
    Rectangle rectangle=new Rectangle();
    rectangle.display();
}
void display(){
    System.out.println("Area: "+ area);
}
}