import java.util.*;
class anag{
public static boolean isanag(String str1,String str2){
 str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

if(str1.length() != str2.length()){
return false;
}

char[] s1 = str1.toCharArray();
char[] s2 = str2.toCharArray();

Arrays.sort(s1);
Arrays.sort(s2);

if(Arrays.equals(s1,s2)){
return true;
}
else{
return false;
}

}
}

class anagram{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first word");
 String string1 = sc.nextLine(); 
System.out.println("Enter your second word");
 String string2 =sc.nextLine(); 

anag obj = new anag();

if(obj.isanag(string1,string2)){
System.out.println("the strings are anagrams");
}
else{
System.out.println("the strings are not anagrams");
}
}
}