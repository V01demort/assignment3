public class Searcher {

    public int search(int[] arr, int target) {
        // Linear Search: O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}