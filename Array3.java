public class Array3 {
    public static void main(String[] args){
        Array3 ex = new Array3();
        // task 16
       /* int [] arr = {1,1,1,4};
        System.out.println(ex.only14(arr));*/

        // task 17
       /* int [] arr = {1,2,1,3};
        System.out.println(ex.isEverywhere(arr,2));*/

        // task 18
       /* int [] arr = {1,7,2,7};
        System.out.println(ex.has77(arr));*/

        // task 19
        /*int [] arr = {3,3,3,1,2,1};
        System.out.println(ex.haveThree(arr));*/

        // task 20
        /*int [] arr = {23,24,25};
        System.out.println(ex.tripleUp(arr));*/

        // task 21
        int [] arr = {23,10,2,3,20,18};
        System.out.println(java.util.Arrays.toString(ex.tenRun(arr)));


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

    public boolean has77(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            if((arr[i]== 7 && arr[i+1] == 7) || (arr[i]== 7 && arr[i+2]== 7) ){
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int [] arr){
    int count3 = 0;


        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == 3 && arr[i+1] == 3){
                 return false;
            }else if (arr[i] == 3){
                count3++;
            }

            if(count3 == 3){
                return true;
            }
        }

      return false;

    }

    public boolean tripleUp(int [] arr){
        for(int i = 0 ; i < arr.length - 2 ; i++){
            if((arr[i+1] == arr[i] + 1) && (arr[i+2] == arr[i] + 2)){
                return true;
            }
        }
        return false;
    }

    public int [] tenRun(int [] arr){
        int currentTen = 0;
        boolean foundTen =false;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 10 == 0){
                currentTen = arr[i];
                foundTen = true;

            } else if (foundTen) {
                arr[i]= currentTen;
            }
        }
        return arr;
    }
}
