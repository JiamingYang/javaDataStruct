package sort;

import netscape.javascript.JSException;
import sun.plugin.javascript.navig.Array;

import java.util.Random;

/**
 * Created by asus on 2018/11/23.
 */
public class Sort {
    public static void main(String[] args) {
        int testArray[]=new int[50];
        Random rand=new Random();
        for(int i=0;i<50;i++){
            testArray[i]=rand.nextInt(100);
            System.out.print(testArray[i]+" ");
        }
        //冒泡排序
//        System.out.print("\n");
//        System.out.print("冒泡排序\n");
//        for(int j=0;j<50;j++){
//            for(int k=0;k<50-j-1;k++){
//                if(testArray[k]>testArray[k+1]){
//                    int temp=testArray[k+1];
//                    testArray[k+1]=testArray[k];
//                    testArray[k]=temp;
//                }
//
//            }
//        }
//        for(int i=0;i<50;i++){
//            System.out.print(testArray[i]+" ");
//        }
//        //选择排序
//        for(int i=0;i<50;i++){
//            int index=i;
//            for(int j=i;j<50;j++){
//                if(testArray[index]>testArray[j]){
//                    index=j;
//                }
//            }
//            int temp=testArray[i];
//            testArray[i]=testArray[index];
//            testArray[index]=temp;
//        }
//        System.out.print("\n");
//        System.out.print("选择排序\n");
//        for(int i=0;i<50;i++){
//            System.out.print(testArray[i]+" ");
//        }
//
//        //插入排序
//        for(int i=0;i<50;i++){
//            for(int j=i;j>0;j--){
//                if(testArray[j]<testArray[j-1]){
//                    int temp=testArray[j-1];
//                    testArray[j-1]=testArray[j];
//                    testArray[j]=temp;
//                }else{
//                    break;
//                }
//            }
//        }
//        System.out.print("\n");
//        System.out.print("插入排序\n");
//        for(int i=0;i<50;i++){
//            System.out.print(testArray[i]+" ");
//        }
        //希尔排序
        for(int incream=testArray.length/2;incream>=1;incream/=2){
            for(int i=0;i<testArray.length;i++){
                for(int j=i;j<testArray.length-incream;j+=incream){
                    if(testArray[j]>testArray[j+incream]){
                        int temp=testArray[j];
                        testArray[j]=testArray[j+incream];
                        testArray[j+incream]=temp;
                    }
                }
            }
        }
        System.out.print("\n");
        System.out.print("希尔排序\n");
        for(int i=0;i<50;i++){
            System.out.print(testArray[i]+" ");
        }


    }
}
