import java.util.*;
public class palistr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str;
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--){
            str2 += str.charAt(i);
        }
        if(str2==str1){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();




    }
}