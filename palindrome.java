import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
            
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
    
}
