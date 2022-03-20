package Association;

/**
 *
 * @author GHANI
 */
public class MainProgram {

    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank ("BRI");
        
        // inisialisasi nama pegawai //
        Employee e1 = new Employee ("Derry Pangestu");
        Employee e2 = new Employee ("Raihan Shidqi");
        Employee e3 = new Employee ("Bayu Vijanendra");
        Employee e4 = new Employee ("Adam mulyono");
        
        // tampil //
        System.out.println(e1.getNameEmployee() + " adalah pegawai dari bank " + bank.getBankName());
        System.out.println(e2.getNameEmployee() + " adalah pegawai dari bank " + bank.getBankName());
        System.out.println(e3.getNameEmployee() + " adalah pegawai dari bank " + bank.getBankName());
        System.out.println(e4.getNameEmployee() + " adalah pegawai dari bank " + bank.getBankName());
    }
    
}
