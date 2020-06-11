import java.util.*;
public class lab4_V5_1{
    public static void main(String[] args) {
        try {
            System.out.println("Введите количество чисел в массиве");
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int k=0,b=1,c=0;
            float min = 1;
            float arr[] = new float[a];
            for (int i=0; i < a ;i++){
                float number = sc.nextFloat();
                arr[i]=number;
            }
            for (int i=0; i < a ;i++){
                System.out.print(arr[i]+" ");
            }
            for (int i=0; i < a ;i++){
                if (min>arr[i]){
                    min=arr[i];
                    b+=1;
                    c=i+1;
                }
                if (arr[i]<0){
                    k+=1;
                }
                if(k==0) throw new RuntimeException("В массиве отсутсвуют отрицательные числа");
            }
            if ( b!=1){
                System.out.println();
                System.out.println("Минимум среди отрицательных элементов = "+ min);
                System.out.println("Номер минимума среди отрицательных элементов = "+ c);
            }
        } catch(InputMismatchException e){
            System.out.println("Ошибка при вводе числа");
        } catch(RuntimeException qe){
        }

    }
}