import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println( powMod(a, b, c));
    }
    public static int powMod(int a,int b,int c){
        if (b==0){
            return 1;
        }

        long p=powMod(a,b/2,c) ;

        if (b%2==0){
            return (int) ((p*p)%c);
        } else{
            return (int) ((p*p*a)%c);
        }
    }


}
