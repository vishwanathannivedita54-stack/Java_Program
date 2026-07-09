class Temp{
    double celsius = 6.98;
    double fahrenheit = (celsius * 9/5) + 32;
    public static void main(String[] args){
        Temp temp = new Temp();
        temp.display();
    }
    void display(){
        System.out.println("Celsius: "+ celsius);
        System.out.println("Fahrenheit: "+ fahrenheit);
    }   
}