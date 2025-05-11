import java.util.*;
public class fibo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            int c = a+b;
             a=b;
             b=c;
            System.out.println(c);
        }

    }
    
}
