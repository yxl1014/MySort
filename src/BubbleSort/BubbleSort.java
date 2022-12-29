package BubbleSort;

import java.util.Arrays;

/**
 * @author yxl
 * @date 2022/12/29 下午11:39
 */
public class BubbleSort {
    private int[] value;
    private int len;

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
        this.len = value.length;
    }

    public BubbleSort() {
    }

    public BubbleSort(int[] value) {
        this.value = value;
        this.len = value.length;
    }

    public BubbleSort(String value) {
        this.len = value.length();
        int[] values = new int[this.len];
        char[] c = value.toCharArray();
        for (int i = 0; i < this.len; i++) {
            values[i] = To_int(c[i]);
        }
        this.value = values;
    }

    public String do_Sort_S() {
        do_Sort();
        return Arrays.toString(value);
    }

    public int[] do_Sort_I() {
        do_Sort();
        return value;
    }

    private void do_Sort() {
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = 0; j < value.length - 1 - i; j++) {
                if (value[j] > value[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }


    private int To_int(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }

    private void swap(int a, int b) {
        int t = value[a];
        value[a] = value[b];
        value[b] = t;
    }
}
