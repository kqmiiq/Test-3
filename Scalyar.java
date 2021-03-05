import java.util.Scanner;
public class Scalyar {
    public float[][] arr(float[][] array, int n){

        float minimum = array[0][0];
        float maximum = array[0][0];
        int index_of_min = 0, index_of_max = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(maximum < array[i][j]){
                    maximum = array[i][j];
                    index_of_max = i;
                }
                if(minimum > array[i][j]){
                    minimum = array[i][j];
                    index_of_min = j;
                }
            }
        }
        System.out.println("Минимальный элемент матрицы: " + minimum + "\nИндекс строки с минимальным элементом: " + index_of_min);
        System.out.println("Максимальный элемент матрицы: " + maximum + "\nИндекс стобца с максимальным элементом: " + index_of_max);
        for(int i = 0; i < n; i++){
            array[index_of_max][i] = array[index_of_max][i] * array[i][index_of_min];
        }
        return array;
    }

    public float[][] return_farr(int n){
        float [][] array = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (float) Math.round((Math.random() * 30) + 1);
            }
        }
        System.out.println("До: ");
        for( int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}
