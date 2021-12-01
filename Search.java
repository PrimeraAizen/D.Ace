import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] myList = {4, 5, 6, 7};
        System.out.println(binarySearch(myList, x));
    }
    public static int binarySearch(int[] myList, int a) {
        int high = myList.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = myList[mid];
            if (guess == a) return mid;
            else if (guess > a) high = mid - 1;
            else low = mid + 1;
        }
        return a;
    }
}