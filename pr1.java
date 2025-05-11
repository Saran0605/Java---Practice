import java.util.*;
class pr1{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(Integer.valueOf(2));
        System.out.println(list);
        

    }
}