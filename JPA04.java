import java.util.Scanner;
public class JPA04{
    public static void main(String[] args){
        double sum = 0;
        int d = 0;
        while(true){
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            if(b==-1){
                break;
            }else{
                d++;
            }
            sum+=b;
        }
        System.out.printf("餐點總費用:%.1f",sum);
        System.out.print("\n");
        System.out.printf(d+" 道餐點平均費用為: %.2f",(sum/d));
    }
}