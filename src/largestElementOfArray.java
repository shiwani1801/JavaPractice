
public class largestElementOfArray {

    public static void main(String[] args) {
        int arr[]={1,2,6,4,5};
        int max=arr[0];//1/2/6
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];//6
            }

        }
            System.out.println(max+"=largest no");
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];//6
        }

    }
            System.out.println(min+"=minimum no");
}
    }


