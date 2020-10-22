package Heapsort;

import java.util.Arrays;

/*
* 堆排序
* */
public class Sort {
    private int[] arr;
    private int len;
    public void setArr(int [] arr){
        this.arr=arr;
        this.len=arr.length;
    }

    public Sort (int [] arr){
        this.arr=arr;
        this.len=arr.length;
    }
    public Sort(){}

    public Sort(String value){
        this.len=value.length();
        int[] values=new int[this.len];
        char[] c=value.toCharArray();
        for(int i=0;i<this.len;i++){
            values[i]=To_int(c[i]);
        }
        this.arr=values;
    }

    public int[] do_Sort_I(){
        //TODO:构建大顶堆
        for(int i=len/2-1;i>=0;i--){
            do_Sort(i,len);
        }
        for(int j=len-1;j>0;j--){
            //TODO:将堆顶元素与末尾元素进行交换
            swap(0,j);
            //TODO:重新调整除顶结点
            do_Sort(0,j);
        }
        return this.arr;
    }

    public String do_Sort_S(){
        //TODO:构建大顶堆
        for(int i=len/2-1;i>=0;i--){
            do_Sort(i,len);
        }
        for(int j=len-1;j>0;j--){
            //TODO:将堆顶元素与末尾元素进行交换
            swap(0,j);
            //TODO:重新调整除顶结点
            do_Sort(0,j);
        }
        return Arrays.toString(this.arr);
    }
    private void do_Sort(int i,int len){
        int temp=arr[i];
        //TODO:从左子结点开始比较
        for(int k=i*2+1;k<len;k=k*2+1){
            //TODO:若右子节点小于左子节点则指向右节点
            if(k+1<len&&arr[k]<arr[k+1]){
                k++;
            }
            //TODO:如果这个节点大于头节点，则交换
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }else {
                break;
            }
        }
        arr[i]=temp;
    }
    private void swap(int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

    private int To_int(char c){
        switch (c){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
            default:return -1;
        }
    }
}
