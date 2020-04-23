/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Pariwisata<P> {
    P data18;
    P data19;
    P data20;
    P bulan;
    Pariwisata<P> next;
    
    public Pariwisata(P bulan, P dt18, P dt19, P dt20, Pariwisata<P> next) {
        this.bulan = bulan;
        this.data18 = dt18;
        this.data19 = dt19;
        this.data20 = dt20;
        this.next = next;
    }
}
