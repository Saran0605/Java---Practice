import java.util.*;
class str2{
public static void main(String arguments[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first word");

String s1 = sc.nextLine();

System.out.println("Enter second word");
String s2 =sc.nextLine();

boolean temp = false;

for(int i = 0;i<s1.length();i++){
for(int j = 0;j<s2.length();j++){
if(s1.charAt(i) == s2.charAt(j)){
 temp = true;
}
else{
temp = false;
}
}
}
if(temp){
System.out.println("equal");
}
else{System.out.println("Not Equal");}


}
}
