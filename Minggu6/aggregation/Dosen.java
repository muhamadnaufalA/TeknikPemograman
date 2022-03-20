package Aggregation;

/**
 *
 * @author GHANI
 */
public class Dosen {
    // state //
    private String nip;
    private String nama ;
    
    // constructor //
    public Dosen (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip (){
        return nip;
    }
}
