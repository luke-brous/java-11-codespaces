// Runs in Theta(log n) time
// Space complexity is O(1) for iterative and O(log n) for recursive
// Binary Search

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int index = search(target, a);
        
        StdOut.println("Index of '" + target + "': " + index);
    }

    public static int search(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        
        if (key == a[mid]) {
            return mid;
        } else if (key < a[mid]) {
            return search(key, a, lo, mid - 1);
        } else {
            return search(key, a, mid + 1, hi);
        }
    }

    public static int search(int key, int[] a) {
        return search(key, a, 0, a.length - 1);
    }
}
