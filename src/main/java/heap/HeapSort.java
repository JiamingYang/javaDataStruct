package heap;

/**
 * Created by asus on 2018/12/3.
 */
public class HeapSort {
    private int[] buildMaxHeap(int[] array){
        for(int i=(array.length-2)/2;i>=0;i--){
            adjustDownToUp(array,i,array.length);
        }
        return array;
    }
    private void adjustDownToUp(int[] array,int k,int length){
        int temp=array[k];
        for (int i=2*k+1;i<length-1;i=2*i+1){
            if (i<length-1 && array[i]>array[i+1]){
                i++;
            }
            if (temp>=array[i]) {
                break;
            }else {
                array[k]=array[i];
                k=i;
            }
        }
        array[k]=temp;
    }
    public void toString(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        HeapSort hst=new HeapSort();
        int[] array={87,45,78,32,17,65,53,9,122};
        System.out.print("构建大根堆");
        hst.toString(hst.buildMaxHeap(array));
    }
}
