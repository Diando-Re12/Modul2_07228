/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diando07228_PembuatanModel;

/**
 *
 * @author CLIENT
 */
import java.util.Date;

public class Diando07228_MahasiswaBaru extends Diando07228_MahasiswaAbstractModel{
    private String Diando07228_kelas;
    public Diando07228_MahasiswaBaru(String Diando07228_nama, String Diando07228_kelas, String Diando07228_npm, String Diando07228_Pass, Date Diando07228_tl) {
        super(Diando07228_nama, Diando07228_kelas, Diando07228_npm, Diando07228_Pass, Diando07228_tl);
        this.Diando07228_kelas=Diando07228_kelas;
    }
    
    @Override
            
    public String Diando07228_getNpm() {
        return Diando07228_npm;
    }

    public String Diando07228_getKelas() {
        return Diando07228_kelas;
    }

    public void Diando07228_setKelas(String kelas) {
        this.Diando07228_kelas = Diando07228_kelas;
    }
}
