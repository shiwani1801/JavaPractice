import java.util.HashSet;

public class FirstDublicate {
    public static void main(String[] args) {
        int arr[] = {1, 4, 32, 6, 32, 8, 20,8,8};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//
//                    System.out.println(arr[i]);
//                    count=count+1;
//                    break;
//                }
//            }
//            if(count>0){
//                break;
//            }
            //i=2
            //j=4
            //temp=1
      //  }
        HashSet<Integer> hs=new HashSet<>();
        int temp=-1;
        for(int i= arr.length-1;i>=0;i--){
            if(hs.contains(arr[i])){
                temp=i;
            }else {
                hs.add(arr[i]);
            }
        }
        if(temp!=-1){
            System.out.println(arr[temp]);
        }else {
            System.out.println("not present");
        }
    }
}
