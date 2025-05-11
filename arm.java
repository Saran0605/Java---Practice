import java.util.*;
public class arm {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int actualno = n;
    int pow = 0;
    int temp = n;
    int sum = 0;
    while(temp>0){
        pow++;
        temp/=10;

    }
    temp = n;
    while(temp>0){
        int digit = temp%10;
        sum += Math.pow(digit,pow);
        temp/=10;


    }
    if(sum==actualno){
        System.out.println("its an armstrong number");
    }
    else{
        System.out.println("not an armstrong number");
    }
    sc.close();

}
}
