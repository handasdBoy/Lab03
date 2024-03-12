import java.util.Scanner;
public class JPA07{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        while(true){
            System.out.println("Input:");
            int b = a.nextInt();
            if(b==999){
                break;
            }
            int c = a.nextInt();
            for(int i=b;i>=1;i--){
                if(b%i==0 && c%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
