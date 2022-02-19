package soal7;

/**
 *
 * @author GHANI
 */
public class MDArrayJava
{
    public static void main(String[] args)
    {
        int i,j,k;
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3}; 
        int[] secondArray = {9, 5, 3}; 
        int[] thirdArray = {2, 4, 9}; 
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16, 17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eighthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27}; 
    //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
    //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
    // tampilkan //
    for (i=0; i<3; i++){
        for (j=0; j<3; j++){
            for (k=0; k<3; k++){
                if (j==0 && k==0){
                   System.out.print("{{"+threeDimensionalArray[i][j][k]+" "); 
                }else if (k==2 && j!=2){
                   System.out.print(+threeDimensionalArray[i][j][k]+" } ");
                }else if (k==0){
                    System.out.print("{"+threeDimensionalArray[i][j][k]+" ");
                }else if (j==2 && k==2){
                    System.out.print(+threeDimensionalArray[i][j][k]+" } }");
                }else{
                    System.out.print(threeDimensionalArray[i][j][k]+" ");
                }
            }
        }
        System.out.println ("");
    }
  }
}