import java.util.*;
/*
 Large elements come to the end of array by swapping with 
 adjacent elements  
 
 */
public class bubble{
    public static void main(String[]args){
        int[] arr = {4,5,9,7,1,3,2};
        // int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        printArray(arr);
        
    }
    public static void bubbleSort(int[] arr){
       
        for(int i=0;i<arr.length-1;i++){ //turns
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
        public static void printArray(int[] arr){ 
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        
        
    }

