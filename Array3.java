public class Array3 {
    public static void main(String[] args){
        Array3 ex = new Array3();
        // task 16
       /* int [] arr = {1,1,1,4};
        System.out.println(ex.only14(arr));*/

        // task 17
        int [] arr = {1,2,1,3};
        System.out.println(ex.isEverywhere(arr,2));

    }

    public boolean only14(int [] arr){

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] != 1 && arr[i] !=4){
               return false;
            }
        }
        return true;
    }

    public boolean isEverywhere(int [] arr, int n){
        for (int i =0 ; i<arr.length-1;i++){
            if(arr[i] != n && arr[i+1] != n){
                return false;
            }
        }
        return true;
    }
}
