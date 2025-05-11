import java.util.*;
class secondlarge{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int temp = 0;
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
for(int i=0;i<n;i++){
System.out.print(arr[i]);
}
for(int i = 0;i<n;i++){
for(int j = i+1;j<n;j++){
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
for(int i=0;i<n;i++){
System.out.print(arr[i]);
}
System.out.print(arr[arr.length-1]);

}

}