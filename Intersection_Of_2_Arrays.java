import java.util.HashSet;

public class Intersection_Of_2_Arrays {
    public static void main(String[] args) {
//        Intersection - The comman elements between 2 arrays.
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,4,6,1};

        printIntersection(arr1, arr2);
    }

    private static void printIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        for (int i=0; i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}
