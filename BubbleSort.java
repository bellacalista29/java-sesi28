public class BubbleSort {

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {4,7,10,1,2,5,8,11,68,33,56,22,21,5,8,10,13,48,26};
        long start = System.nanoTime();
        bs.bubbleSort(arr);
        long finish = System.nanoTime();
        long elapsedTime = finish-start;
        System.out.println("Durasi sorting : " + elapsedTime);
        System.out.println("Sorted array");
        bs.printArray(arr);
        
    }
}
