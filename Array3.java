public class Array3 {
    public static void main(String[] args){
        Array3 ex = new Array3();
        int [] arr = {1,1,1,4};
        System.out.println(ex.only14(arr));
    }

    public boolean only14(int [] arr){

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] != 1 && arr[i] !=4){
               return false;
            }
        }
        return true;
    }
}
