import java.util.*;
class str5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word");
String st = sc.nextLine();
String st1 = st;
for(int i = 0;i<st.length();i++){
for(int j = i+1;j<st.length();j++){

if(st.charAt(i) == st.charAt(j)){
st=st.replace(st.charAt(j),"");
}
}

}
System.out.println(st);

}
}