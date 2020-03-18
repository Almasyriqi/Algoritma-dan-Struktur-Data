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
    public int suara1=1;
    public int suara2=2;
    public int suara3=3;
    public int suara4=4;

    public int suaraTerbanyak(int arr[], int l, int r)
    {
        if (l == r) {
            return arr[l];
        }
        else if (l<r){
            int mid = (l+r) / 2;
            int left = suaraTerbanyak(arr,l,mid-1);
            int right = suaraTerbanyak(arr,mid+1,r);
            if (left == suara1 || arr[mid] == suara1 || right == suara1) {
                return suara1;
            }
            else if (left == suara2 || arr[mid] == suara2 || right == suara2) {
                return suara2;
            }
            else if (left == suara3 || arr[mid] == suara3 || right == suara3) {
                return suara3;
            }
            else if (left == suara4 || arr[mid] == suara4 || right == suara4) {
                return suara4;
            }
        }
        return 0;
    }
}
