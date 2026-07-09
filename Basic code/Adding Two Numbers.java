class Add {
    double a = 8.12;
    float b = 9.17f;
    double Sum = a + b;

    public static void main(String[] args) {

        Add add = new Add();
        add.display();
    }

    void display() {
        System.out.println("Sum: " + Sum);
    }
}