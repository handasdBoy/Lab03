import java.util.Scanner;
public class JPA05{
    public static void main(String[] args){
        int a = 1;
        int sum = 1;
        while (a<=3){
            System.out.print("Please enter one value:");
            Scanner b = new Scanner(System.in);
            int c = b.nextInt();
            if(1<=c && c<=10){
                for(int d=1;d<=c;d++){
                    sum*=d;
                }
                System.out.println(c+"! : "+sum);
            }else{
                System.out.print("Error, the value is out of range.");
            }
            a++;
        }
    }
}