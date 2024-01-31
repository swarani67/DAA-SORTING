import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;


public class DAASorting {


    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int k = 1; k < n; k++) {
            int x = array[k];
            int l = k - 1;

            while (l >= 0 && array[l] > x) {
                array[l + 1] = array[l];
                l--;
            }
            array[l + 1] = x;
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int k = 0; k < n - 1; k++) {
            int min = k;

            for (int l = k + 1; l < n; l++) {
                if (array[l] < array[min]) {
                    min = l;
                }
            }

            if (min != k) {
                int temp = array[k];
                array[k] = array[min];
                array[min] = temp;
            }
        }
    }
