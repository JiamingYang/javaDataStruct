package sort;

import java.util.Random;

/**
 * Created by asus on 2018/11/26.
 */
public class QuickSort {
    private static int times=0;
    public static void main(String[] args) {
        int testArray[]=new int[]{51,35 ,31,52, 55 ,54,98,2,12,45,75,62,25,86,29};
      //  Random rand=new Random();
//        for(int i=0;i<50;i++){
//            testArray[i]=rand.nextInt(100);
//            System.out.print(testArray[i]+" ");
//        }
        for(int i=0;i<testArray.length;i++){
            System.out.print(testArray[i]+" ");
        }
        qkSort(testArray,0,testArray.length-1);
        System.out.print("\n");
        System.out.print("快速排序\n");
        for(int i=0;i<testArray.length;i++){
            System.out.print(testArray[i]+" ");
        }

    }
    public static void qkSort(int[] testArray,int start,int end){
        times++;
        int low=start;
        int high=end;
        int pivotal=testArray[start];
        while (end>start){
            while(testArray[end]>pivotal){
                end--;
            }
            if(testArray[end]<pivotal){
                int temp=testArray[end];
                testArray[end]=testArray[start];
                testArray[start]=temp;
            }
            while (testArray[start]<pivotal){
                start++;
            }
            if(testArray[start]>pivotal){
                int temp=testArray[start];
                testArray[start]=testArray[end];
                testArray[end]=temp;
            }
        }
        System.out.print("\n");
        System.out.print("第"+times+"次排序\n");
        for(int i=0;i<testArray.length;i++){
            System.out.print(testArray[i]+" ");
        }
        if(start>low)qkSort(testArray,low,start-1);
        if(end<high)qkSort(testArray,end+1,high);
    }
}
