/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 * Nama : M.Syifa'ul Ikrom A Kelas : TI 1F NIM : 1941720057
 */
public class ModifSum {

    public int jumlah;
    public int elemen;
    public double keuntungan;
    public double total;

    double totalBF(double keuntungan) {
        for (int i = 0; i < elemen; i++) {
            total = total + keuntungan;
        }
        
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    
}
