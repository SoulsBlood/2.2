import java.util.Scanner;

public class Rec6 {
    public static void binar(int a){
        int b;
        String s = "";
        while(a !=0){
            b = a%2;
            s = b + s;
            a = a/2;
        } System.out.print(s);
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter number: ");
        a = s.nextInt();
        binar(a);
    }
}





