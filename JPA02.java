import java.util.Scanner;
public class JPA07{
    public static void main(String[] args){
        int z = 27;
        for(int i=6;i<10;i++){
            for(int j=2;j<4;j++){
                if(z==i*j){
                    System.out.print("count = "+z);
                    break;
                }
            }
        }
    }
}

