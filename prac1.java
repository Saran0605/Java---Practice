import java.io.*;
class prac1{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter name");
         String name = br.readLine();
         System.out.println("enter age");
         String age = br.readLine();
         System.out.println(name);
         System.out.println(age);
         int age1 = (int) age;
         System.out.println(22+age1);







    }
}