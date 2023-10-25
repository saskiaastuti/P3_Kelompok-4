
package tas;

public class Tas {
    String nama;
    String jenis;
    
    public Tas() {
        this.nama = "Saskia Ast";
        this.jenis = "Dior";
    }

    public static void main(String[] args) {
        Tas tas = new Tas();
        System.out.println(tas.nama + " " + tas.jenis);
    }
}
   