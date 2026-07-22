class Book{
    int id;
    String title;
    String author ;
    String category;
    double price;
    boolean available;
    Book(int i,String t,String a,String c,double p,boolean av){
        id =i;
        title=t;
        author=a;
        category=c;
        price=p;
        available=av;
    }
    void display(){
        System.out.println("Book ID:"+id+"\nTitle:"+title+"\nAuthor:"+author+"\nCategory:"+category+"\nPrice:"+price+"\nAvailable:"+available);
    }
}
class Main{
    public static void main(String[]args){
        Book b1 = new Book(179,"java","james","program",600.88,true);
        Book b2 = new Book(170,"python","alice","programming",500.00,false);
        b1.display();
        b2.display();

    }
}