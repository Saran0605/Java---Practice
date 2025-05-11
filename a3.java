import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class a3{
public static void main(String[] args){
String [] str = {"Saran1","saran2","saran3"};


System.out.println("First");

Arrays.asList(str).forEach(ele -> System.out.println(ele));

System.out.println("Second");

Arrays.stream(str).forEach(System.out::println);

System.out.println("third");

Stream.of(str).forEach(ele-> System.out.println(ele));

System.out.println("four -- for loop"); 
 
System.out.println("five -- for each");

System.out.println("Six");

System.out.println(Arrays.toString(str));

System.out.println("Seven");

String res = Arrays.stream(str).collect(Collectors.joining(", "));
System.out.println(res);







}
}