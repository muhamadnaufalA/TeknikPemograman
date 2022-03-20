package Aggregation;

/**
 *
 * @author GHANI
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen("211525016", "Pangestu");
        Jurusan jurusan = new Jurusan ("Teknik Informatika");
        
        jurusan.setDosen(dosen);
        
        // tampil //
        System.out.println ("NIP Dosen      : " + jurusan.getDosen().getNip());
        System.out.println ("Nama Dosen     : " + jurusan.getDosen().getNama());
        System.out.println ("Jurusan        : " + jurusan.getNamaJurusan());
        System.out.println (jurusan.getDosen().getNama() + " adalah dosen "+ jurusan.getNamaJurusan() + " dengan NIP : " + jurusan.getDosen().getNip());
    }
    
}
