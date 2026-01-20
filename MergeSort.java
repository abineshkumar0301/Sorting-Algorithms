import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {6, 3, 5, 1, 4, 7, 2};
        mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int l, int r){
        if(l >= r){
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    private static void merge(int[] nums, int l, int mid, int r){
        int[] temp = new int[r - l + 1];
        int idx = 0;

        int i = l;
        int j = mid + 1;

        while(i <= mid && j <= r){
            if(nums[i] <= nums[j]){
                temp[idx++] = nums[i++];
            }
            else{
                temp[idx++] = nums[j++];
            }
        }

        while(i <= mid){
            temp[idx++] = nums[i++];
        }
        while(j <= r){
            temp[idx++] = nums[j++];
        }

        for(int index = 0; index < temp.length; index++){
            nums[index + l] = temp[index];
        }
    }
}
