import java.util.*;
class str4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(s);
String rev = "";
for(int i= 0;i<s.length();i++){
char c = s.charAt(i);
rev = c+rev;

}
System.out.println(rev);
}
}