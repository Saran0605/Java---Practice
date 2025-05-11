import java.util.*;
class palin{
public static void main(String arguments[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number for check:");

int num = sc.nextInt();

int rem = 0 ;
int sum = 0;
int temp = num;

while(num!=0){
sum = (sum*10)+(num%10);
num = num/10;

}
if(sum != temp){
System.out.println("Not a palindrome");
}
else{
System.out.println("Palindrome");
}


}

}