/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4_5;

/**
 *
 * @author ASUS
 */
public class Suara {

    public int jumlahSuara;
    public int total;
    public int suaraDipilih[];

    public int suaraTerbanyak(int arr[], int l, int r)
    {
        if (l == r) {
            return arr[l];
        }
        else if (l<r){
            int left = suaraTerbanyak(arr,l,r-1);
            int right = suaraTerbanyak(arr,r+1,r);
            return arr[left];
        }
        return 0;
    }
}
