import java.util.*;
public class minandmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr1[] = new int[len];
        for(int i=0;i<len;i++){
            arr1[i] = sc.nextInt();
        }
        int min = arr1[0];
        int max = arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]<min){
                min = arr1[i];

            }
            if(arr1[i]>max){
                max = arr1[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    
}
