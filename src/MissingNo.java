public class MissingNo {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int expectedElement= arr.length+1;
        int total=expectedElement*(expectedElement+1)/2;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(total-sum);
    }
}
