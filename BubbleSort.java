import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {6, 3, 5, 1, 4, 7, 2};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j < n - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}