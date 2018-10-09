package algorithms;

public class BinarySearch {
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int  answer  =runBinarySearchRecursively(arr,2,0,arr.length-1);
        System.out.println(answer);

    }
    private static int runBinarySearchRecursively(
            int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}


