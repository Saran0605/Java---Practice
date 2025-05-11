import java.util.*;
class alist{
public static void main(String args[]){
String[] a1 = {"java","python","c++","c"};
System.out.println(a1);
List<String> li = new ArrayList<String>();
System.out.println(li);
li.add("R");
li.add("java");
li.add("java");
li.add("java");
li.add("java");


li.remove("java");

System.out.println(li);

}
}
