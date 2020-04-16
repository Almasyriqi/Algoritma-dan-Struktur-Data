/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ModifNode<T> {
    T data;
    ModifNode<T> next;
    
    public ModifNode(T data, ModifNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
