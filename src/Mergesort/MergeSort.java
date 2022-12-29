package Mergesort;

import java.util.Arrays;

/*
* 并归排序
* */
public class MergeSort {
    private int[] value;
    private int len;
    public int[] getValue() {
        return value;
    }
    public void setValue(int[] value) {
        this.value = value;
        this.len=value.length;
    }
    public MergeSort(){}
    public MergeSort(int[] value){
        this.value=value;
        this.len=value.length;
    }
    public MergeSort(String value){
        this.len=value.length();
        int[] values=new int[this.len];
        char[] c=value.toCharArray();
        for(int i=0;i<this.len;i++){
            values[i]=To_int(c[i]);
        }
        this.value=values;
    }
    public String do_Sort_S(){
        do_Sort();
        return Arrays.toString(value);
    }
    public int[] do_Sort_I(){
        do_Sort();
        return value;
    }
    private void do_Sort(){
        do_Sort(0,len-1,new int[len]);
    }
    private void do_Sort(int left,int right,int[] temp){
        //TODO:若左边大于等于右边则不递归
        if(left<right){
            int mid=(left+right)/2;
            //TODO:将左边有序排列
            do_Sort(left,mid,temp);
            //TODO:将右边有序排列
            do_Sort(mid+1,right,temp);
            //TODO:将左右两边放入有序
            do_swap(left,mid,right,temp);
        }
    }

    private void do_swap(int left, int mid, int right, int[] temp) {
        int l=left;
        int r=mid+1;
        int p=0;
        //TODO:比较左右两个数组，将他们有序放入临时数组
        while(l<=mid&&r<=right){
            if(value[l]<=value[r]){
                temp[p++]=value[l++];
            }else{
                temp[p++]=value[r++];
            }
        }
        //TODO:将左边数组剩下的放入临时数组
        while(l<=mid){
            temp[p++]=value[l++];
        }
        //TODO:将右边数组剩下的放入临时数组
        while (r<=right){
            temp[p++]=value[r++];
        }
        p=0;
        //TODO:将临时数组的数据放入原数组
        while (left<=right){
            value[left++]=temp[p++];
        }
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
    private void swap(int a,int b){
        int t=value[a];
        value[a]=value[b];
        value[b]=t;
    }
}
