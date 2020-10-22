package Quicksort;

import java.util.Arrays;

/*
* 快速排序
* */
public class Sort {
    private int[] value;
    private int len;
    public int[] getValue() {
        return value;
    }
    public void setValue(int[] value) {
        this.value = value;
        this.len=value.length;
    }

    public Sort(){}

    public Sort(int[] value){
        this.value=value;
        this.len=value.length;
    }


    public Sort(String value){
        this.len=value.length();
        int[] values=new int[this.len];
        char[] c=value.toCharArray();
        for(int i=0;i<this.len;i++){
            values[i]=To_int(c[i]);
        }
        this.value=values;
    }
    public int[] do_Sort_i(){
        do_Sort(0,len);
        return value;
    }
    public String do_Sort_S(){
        do_Sort(0,len);
        return Arrays.toString(value);
    }
    public void do_Sort(int i,int len){
        int t;
        for(;i<len;i++){
            t=i+1;
            //TODO:将比key小的放到理key近的右边，并记下最后一位的地址
            for(int j=i+1;j<len;j++){
                if(value[i]>=value[j]){
                    swap(j,t);
                    t++;
                }
            }
            //System.out.println(Arrays.toString(value));
            //TODO:若有比key小的
            if(t!=i+1){
                //TODO:交换第一个与比他小的最后一个
                swap(i,t-1);
                //TODO:递归
                do_Sort(i,t-1);
            }/*else{
                if(value[i]>value[t-1]){
                    swap(i,t);
                }
            }*/
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
