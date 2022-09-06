import java.util.Scanner;

public class NumbersOfDigitInteger {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        //for(int n!=0; n=n/10;++count)
        while(n!=0)
        {
            n=n/10;
            count++;


        }
        System.out.println("number of digit:" +count);
    }
}
