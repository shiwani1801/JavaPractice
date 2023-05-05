import java.util.HashSet;
import java.util.Set;

public class dublicatNo{
    public static void main(String[] args) {

        int arr[] = {1, 4, 32, 6,1, 32, 8, 20,8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(arr[i]);

                }
            }
        }
        System.out.println("count="+count);

//        Set<Integer> set=new HashSet<>();
//
//        for (int no:arr) {
//            if(set.add(no)==false){
//                System.out.println(no);
//            }
        }

    }



