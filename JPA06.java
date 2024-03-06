import java.util.Scanner;
import static java.lang.Math.*;
public class JPA06{
    public static void main(String[] args){
        while(true){
            System.out.println("Input:");
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            int c = a.nextInt();
            int d = (int)(Math.pow(b,c));
            if(b==999){
                break;
            }else{
            System.out.println(d);
            }
        }
    }
}
