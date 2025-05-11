import java.util.*;

class bin {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int search = t.nextInt();
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (ar[mid] == search) {
                System.out.print(mid);
                break;
            } else if (ar[mid] > search) {
                high = mid - 1;
            } else if (ar[mid] < search) {
                low = mid + 1;
            }

        }

    }
}