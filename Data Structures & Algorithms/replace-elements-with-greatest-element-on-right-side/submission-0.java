class Solution {
    public int[] replaceElements(int[] arr) {
            int n = arr.length;
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    arr[j] = -1;
                } else {
                    int largest = arr[j + 1];
                    for (int i = j + 1; i <= n - 1; i++) {
                        if (arr[i] > largest) {
                            largest = arr[i];
                        }
                    }
                    arr[j] = largest;
                }
            }
            return arr;
    }
}