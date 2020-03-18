/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class TambahanSum {
    public double total;
    public int jumlah;
    public int elemen;

    
    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid1 = (l + r) / 2;
            double lsum = totalDC(arr, l, mid1 - 1);
            double rsum = totalDC(arr, mid1 + 1, r);
            return lsum + rsum + arr[mid1];        
        }
        return 0;
    }
}
