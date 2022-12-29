

import BubbleSort.BubbleSort;
import Heapsort.HeapSort;
import Mergesort.MergeSort;
import Quicksort.QuickSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yxl
 * @date 2022/12/29 下午11:24
 */
public class Demo {
    public static void main(String[] args) {
        int n = 10000;
        int[] nums = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            nums[i] = r.nextInt(n);
        }
        System.out.println("原数组顺序:" + Arrays.toString(nums));
        long htime;
        long mtime;
        long qtime;
        long stime;
        long btime;
        HeapSort heap = new HeapSort(nums);
        MergeSort merge = new MergeSort(nums);
        QuickSort quick = new QuickSort(nums);
        ShellSort shell = new ShellSort(nums);
        BubbleSort bubble = new BubbleSort(nums);

        long start = System.currentTimeMillis();
        String heaps = heap.do_Sort_S();
        long end = System.currentTimeMillis();
        htime = end - start;

        start = System.currentTimeMillis();
        String merges = merge.do_Sort_S();
        end = System.currentTimeMillis();
        mtime = end - start;


        start = System.currentTimeMillis();
        String quicks = quick.do_Sort_S();
        end = System.currentTimeMillis();
        qtime = end - start;


        start = System.currentTimeMillis();
        String shells = shell.doSort_S();
        end = System.currentTimeMillis();
        stime = end - start;


        start = System.currentTimeMillis();
        String bubbles = bubble.do_Sort_S();
        end = System.currentTimeMillis();
        btime = end - start;


        System.out.println("--------------------------------");
        System.out.println("堆排序结果：" + heaps);
        System.out.println("堆排序时间：" + htime + "毫秒，" + htime / 1000 + "秒");
        System.out.println("--------------------------------");
        System.out.println("归并排序结果：" + merges);
        System.out.println("归并排序时间：" + mtime + "毫秒，" + mtime / 1000 + "秒");
        System.out.println("--------------------------------");
        System.out.println("快速排序结果：" + quicks);
        System.out.println("快速排序时间：" + qtime + "毫秒，" + qtime / 1000 + "秒");
        System.out.println("--------------------------------");
        System.out.println("希尔排序结果：" + shells);
        System.out.println("希尔排序时间：" + stime + "毫秒，" + stime / 1000 + "秒");
        System.out.println("--------------------------------");
        System.out.println("冒泡排序结果：" + bubbles);
        System.out.println("冒泡序时间：" + btime + "毫秒，" + btime / 1000 + "秒");
        System.out.println("--------------------------------");

    }
}
