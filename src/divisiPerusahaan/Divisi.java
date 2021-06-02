/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiPerusahaan;

/**
 *
 * @author istimewa
 */
abstract class Divisi {
        private String nik;
        private String nama;
        public int nilaiTulis, nilaiCoding,nilaiWawancara;
        
    public Divisi(String nik, String nama, int nilaiTulis, int nilaiCoding,int nilaiWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    abstract void hasil();
    
    public void edit(int nilaiTulis, int nilaiCoding,int nilaiWawancara){
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    public String getNama(){
        return nama;
    }
}
