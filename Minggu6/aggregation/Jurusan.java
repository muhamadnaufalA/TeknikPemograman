package Aggregation;

/**
 *
 * @author GHANI
 */
public class Jurusan {
    // state //
    private String namaJurusan;
    private Dosen dosen;
    
    // constructor //
    public Jurusan (String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
    
    // getter setter //
    public void setDosen (Dosen dosen){
        this.dosen = dosen;
    }
    
    public Dosen getDosen(){
        return dosen;
    }
    
    public String getNamaJurusan(){
        return namaJurusan;
    }
}
