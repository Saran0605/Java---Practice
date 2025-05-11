import java.util.*;
class str3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            boolean flag = false;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(s.charAt(i));
            }
        }
    }
}
