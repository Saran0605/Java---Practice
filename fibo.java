import java.util.*;
class fibo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n  = sc.nextInt();
int a = 0;
int b = 1;
int temp = 0;
System.out.println(a);
System.out.println(b);

for(int i = 1;i<=n;i++){
temp = a+b;
System.out.println(temp);
a = b;
b = temp;


}
}
}