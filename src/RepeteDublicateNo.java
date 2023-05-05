import java.util.HashSet;

public class RepeteDublicateNo {
    public static void main(String[] args) {
        int arr[] = {1, 4, 32, 6, 32, 8, 20,8,8,4,2,4};

        HashSet<Integer> hs=new HashSet<>();
        int temp;
        for(int i= arr.length-1;i>=0;i--){
            if(hs.contains(arr[i])){
                temp=i;
            }else {
                hs.add(arr[i]);
            }
        }
        System.out.println(hs);
    }
    }

