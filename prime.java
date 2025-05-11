import java.util.*;
public class prime {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<n;i++){
        if(n%i==0){
            System.out.println("Not a prime number");
        }
    }

    
}
}
