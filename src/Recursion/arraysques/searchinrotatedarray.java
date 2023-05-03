package Recursion.arraysques;

public class searchinrotatedarray {
    public static void main(String[] args) {
        int[] arr={3,1};
        int target=1;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
}
