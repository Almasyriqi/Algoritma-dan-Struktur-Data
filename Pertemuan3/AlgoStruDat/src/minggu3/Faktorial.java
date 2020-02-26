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
public class Faktorial {
    public int nilai;
    
    //Source Code asli
//    public int faktorialBF(int n) {
//        int fakto = 1;
//        for (int i = 1; i <= n; i++) {
//            fakto = fakto * i;
//        }
//        return fakto;
//    }
    
    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else 
        {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
    
    //Modifikasi kode dari Pertanyaan 2.3.3 nomor 3
    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i<=n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
}
