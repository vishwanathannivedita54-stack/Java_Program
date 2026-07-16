import java.util.Scanner;
class Days{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days = sc.nextInt();
        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDays = (days % 365) % 30;
        System.out.println(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }
}