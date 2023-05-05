import java.util.ArrayList;

public class OddEven {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 4};
//        int evenCount=0;
//        int oddCount=0;
//        for (int i = 0; i < arr.length;i++){
//            if(arr[i]%2==0){
//                evenCount++;
//                System.out.println(arr[i]+"=even");
//            }
//        }
//        for (int i = 0; i < arr.length;i++){
//            if(arr[i]%2!=0){
//                oddCount++;
//                System.out.println(arr[i]+"=odd");
//            }
//        }
//        System.out.println(evenCount+"=count");
//        System.out.println(oddCount+"=odd count");

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                al1.add(arr[i]);
            } else {
                al2.add(arr[i]);
            }

        }
        int total1=0;
        int total2=0;
        System.out.println("even......");
        for (int no:al1) {
            total1=total1+no;
            System.out.println(no);

        }
        System.out.println(total1+"=total");
        System.out.println("odd......");
        for (int no:al2) {
            total2=total2+no;
            System.out.println(no);
        }System.out.println(total2+"=total");
    }
}
