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
public abstract class Diando07228_MahasiswaAbstractModel {
    protected String Diando07228_nama,Diando07228_kelas,Diando07228_jurusan,Diando07228_npm,Diando07228_Pass;
    protected Date Diando07228_tl;

    public Diando07228_MahasiswaAbstractModel(String Diando07228_nama, String Diando07228_kelas, String Diando07228_npm, String Diando07228_Pass, Date Diando07228_tl) {
        this.Diando07228_nama = Diando07228_nama;
        this.Diando07228_kelas = Diando07228_kelas;
        this.Diando07228_jurusan=Diando07228_jurusan;
        this.Diando07228_npm = Diando07228_npm;
        this.Diando07228_Pass = Diando07228_Pass;
        this.Diando07228_tl = Diando07228_tl;
    }
    public String getDiando07228_nama() {
        return Diando07228_nama;
    }

    public String getDiando07228_kelas() {
        return Diando07228_kelas;
    }

    public String getDiando07228_jurusan() {
        return Diando07228_jurusan;
    }

    public String getDiando07228_npm() {
        return Diando07228_npm;
    }

    public String getDiando07228_Pass() {
        return Diando07228_Pass;
    }

    public Date getDiando07228_tl() {
        return Diando07228_tl;
    }
    
}
