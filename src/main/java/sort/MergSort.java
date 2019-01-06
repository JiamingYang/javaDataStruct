package sort;

import java.util.Random;

/**
 * Created by asus on 2018/11/27.
 */
public class MergSort {
    public static void main(String[] args) {
        int testArray[]=new int[50];
        Random rand=new Random();
        for(int i=0;i<50;i++){
            testArray[i]=rand.nextInt(100);
            System.out.print(testArray[i]+" ");
        }
       // int testArray[]=new int[]{51,35 ,31,52 };

        sort(testArray,0,testArray.length-1);
        System.out.print("\n");
        System.out.print("希尔排序\n");
        for(int i=0;i<testArray.length;i++){
            System.out.print(testArray[i]+" ");
        }
    }
    public  static int[] sort(int[] array,int low,int high){
        int mid=(low+high)/2;
        if (low<high){
            sort(array,low,mid);
            sort(array,mid+1,high);
            merge(array,low,mid,high);
        }
        return array;
    }
    public  static void merge(int[] array,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low,j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if(array[i]<array[j]){
                temp[k]=array[i];
                k++;
                i++;
            }else{
                temp[k]=array[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            temp[k++]=array[i++];
        }
        while (j<=high){
            temp[k++]=array[j++];
        }

        for(int x=0;x<temp.length;x++){
            array[x+low]=temp[x];
        }
    }
}
