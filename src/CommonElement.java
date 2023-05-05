import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 7,4, 6,6};
        int arr1[] = {1, 8, 9, 6,4};
        HashSet<Integer> hs =new HashSet<>();
//        for (int i = 0; i < arr.length;i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr[i] == arr1[j]) {
//                    hs.add(arr[i]);
//                }
//
//            }
//        }
//        for (int no:hs) {
//            System.out.println(no);
//        }
        for (int no:arr) {
            hs.add(no);
        }
        for (int no:arr1) {
            boolean b=hs.add(no);
            if(b==false){
                System.out.println(no);
            }
        }
        System.out.println(hs);


    }
}
