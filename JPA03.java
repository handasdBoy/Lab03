public class JPA03{
    public static void main(String[] args){
        System.out.print("1~1000中的完美數有: ");
        for(int a=1;a<=1000;a++){
            int sum = 0;
            for(int b=1;b<a;b++){
                if(a%b==0){
                    sum+=b;
                }
            }
            if(sum==a){
                System.out.print(a+" ");
            }
            
        }
    }
}