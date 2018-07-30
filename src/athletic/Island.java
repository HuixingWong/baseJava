package athletic;

public class Island {

    public  static int countIsland(int [] [] arr){

        int islandCount = 0;
        for (int i=0;i<arr.length;i++){

            for (int j =0;j<arr[i].length;j++){


                if (arr[i][j] == 1){

                    infection(arr,i,j);
                    islandCount ++;
                }

            }

        }

        return islandCount;

    }



    private static void infection(int[][] arr, int i, int j) {

        if (i > arr.length-1 || j > arr[i].length -1){
            return;
        }

        arr[i][j] = 2;
        if (i-1 >= 0 && arr[i-1][j] == 1){
            infection(arr,i-1,j);
        }
        if (i+1 < arr.length && arr[i+1][j] == 1){
            infection(arr,i+1,j);
        }
        if (j-1 >= 0 && arr[i][j-1] == 1){
            infection(arr,i,j-1);
        }
        if (j+1 < arr[i].length && arr[i][j+1] == 1){
            infection(arr,i,j+1);
        }


    }


    public static void main(String[] args) {

        int [][] arr = new int[4][5];
        arr[0][0] =1;
        arr[0][1] =0;
        arr[0][2] =1;
        arr[0][3] =1;
        arr[0][4] =1;


        arr[1][0] =0;
        arr[1][1] =0;
        arr[1][2] =0;
        arr[1][3] =1;
        arr[1][4] =1;


        arr[2][0] =1;
        arr[2][1] =1;
        arr[2][2] =0;
        arr[2][3] =0;
        arr[2][4] =0;

        arr[3][0] =0;
        arr[3][1] =0;
        arr[3][2] =1;
        arr[3][3] =0;
        arr[3][4] =1;


        int i = countIsland(arr);

        System.out.println(i);


    }


}
