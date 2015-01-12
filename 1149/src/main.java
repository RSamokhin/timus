import java.util.Scanner;
public class main {
    public static void a(int n) {
        for(int i=1;i<=n;i++){
            if(i==n){
                System.out.print("sin("+Integer.toString(i));
            }else{
                if(i%2==1){
                    System.out.print("sin("+Integer.toString(i)+"-");
                }else{
                    System.out.print("sin("+Integer.toString(i)+"+");
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(")");
        }
    }
    public static void s(int n){
        for(int i=0;i<n-1;i++){
            System.out.print("(");
        }
        for(int i=1;i<n;i++){
            a(i);
            System.out.print("+"+Integer.toString(n+1-i)+")");
        }
        a(n);
        System.out.print("+1");
    }
    public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            s(n);
    }
}