import java.util.Scanner;
public class JPA01{
    public static void main(String[] args){
        int total = 0;
        System.out.println("Input:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        for(int n=1;n<=b;n++){
            total = total+n;
        }
        System.out.println("1 + ... + "+b+" = "+total);
    }
}