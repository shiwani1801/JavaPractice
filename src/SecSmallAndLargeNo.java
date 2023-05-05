public class SecSmallAndLargeNo {
    public static void main(String[] args) {
        int arr[] = {4, 8, 1, 9, 22, 15, 11};
        int max = arr[0];
        int min=arr[0];
        int secLargeNo = arr[0];
        int secSmallNo=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];//6
            }
            if (arr[i] != max && arr[i] > secLargeNo) {
                secLargeNo = arr[i];

            }
        }
        System.out.println(secLargeNo + "=sec large no");

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];//6
        }
        if (arr[i]!=min && arr[i]<secSmallNo){
            secSmallNo=arr[i];

        }
    }
        System.out.println(secSmallNo+"=sec small no");
}


}

//1)max =4
//        secLargeNo=4
//        2)max=4
//        secLargeNo=8
//        3) max =8
//        secLarge =8
//        4)max=8
//        seclarge =9
//        1)max =9
//        secLargeNo=22
//        1)max =22
//        secLargeNo=22

//    int arr[] = {1, 4, 32, 6, 7, 8, 20};
//    int temp;
//        for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i] < arr[j]) {
//        temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//        }
//        }
//        }
//        System.out.println(arr[5]);
//        }
