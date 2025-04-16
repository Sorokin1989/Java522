package homeWork_14;

public class HomeWork_14 {
    public static void main(String[] args) {
        //  public static void printArr( int[] arr,int size)
        // {
        //
        //  //nujno napisat cerez rekursiyu
        //  //for ispolzovat nelzya
        // }
        //  int[] arr = {1,3,4,5,6,7};
        //
        // printArr(  arr, arr.length)
        //
        // //result : 1,3,4,5,6,7

        int[] arr = {1, 3, 4, 5, 6, 7};
        printArr(arr, 0);


    }

    public static void printArr(int[] arr, int size) {

        if (size >= arr.length) {
            return;
        }
        System.out.print(arr[size] + " ");
        printArr(arr, size + 1);

    }
}
