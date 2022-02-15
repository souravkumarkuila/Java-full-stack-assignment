class SearchArray{
    public static boolean searchArray(int[] arr, int toCheckValue) {
        boolean t = false;
        for (int i : arr) {
            if (i == toCheckValue) {
                t = true;
                break;
            }
        }
        return t;
    }
}

public class AssignmentQ7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 19;
        System.out.println(SearchArray.searchArray(arr, valueToCheck));
    }
}