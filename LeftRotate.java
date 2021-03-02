public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        int n=arr.size();
       Collections.rotate(arr,n-d);
       return arr;
    }