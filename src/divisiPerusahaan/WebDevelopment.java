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
public class WebDevelopment extends Divisi implements HitungNilaiAkhir {
    private double totalNilai;

    public WebDevelopment(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
        hitungNilai();
    }
    
    
    @Override
    public double hitungNilai() {
        return totalNilai = ((nilaiTulis*0.4) + (nilaiCoding*0.35) + (nilaiWawancara*0.25));
    }
    
    @Override
    public void hasil() {
        System.out.println("Nilai Akhir\t: "+totalNilai);
        if (totalNilai>=85){
            System.out.println("Keterangan\t: Lolos");
            System.out.println("Selamat kepada " + getNama() + " telah diterima sebagai web");
        }
        else{
            System.out.println("Keterangan\t: gagal");
            System.out.println("selamat kepada " + getNama() + " telah ditolak sebagai web");
        }
    }
}

