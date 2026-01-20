import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {6, 3, 5, 1, 4, 7, 2};
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }


    private static void selectionSort(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
