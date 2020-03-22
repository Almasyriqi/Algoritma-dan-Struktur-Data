/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4_5;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Suara {

    public int jumlahSuara;
    public int total;
    public int suaraDipilih[];
    public int major = 0;
    public int maxCount = 0;
    
    
    public void suaraTerbanyak(int arr[]) {
        suaraBagi(arr, 0, arr.length-1);
    }

    private void suaraBagi(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            suaraBagi(data, left, middle);
            suaraBagi(data, middle + 1, right);
            findMajority(data, left, right+1);
        }
    }
    
    private void findMajority(int arr[], int left, int right) {
        
        int index = -1; 
        for (int i = left; i < right; i++) {
            int count = 0;
            for (int j = left; j < right; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
 
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > right / 2) {
            major = (arr[index]);
        } 
    }
}
