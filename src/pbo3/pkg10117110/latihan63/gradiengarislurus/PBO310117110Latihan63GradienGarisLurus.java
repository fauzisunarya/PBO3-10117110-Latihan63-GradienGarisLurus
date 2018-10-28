

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Gradien Garis Dengan Menggunakan Konsep OOP interface dan constructor
 */

package pbo3.pkg10117110.latihan63.gradiengarislurus;


public class PBO310117110Latihan63GradienGarisLurus {


    public static void main(String[] args) {
        
        Koordinat obj = new Koordinat(0,0,0,0);
        obj.setX1(2);
        obj.setY1(10);
        obj.setX2(5);
        obj.setY2(7);
        System.out.println("Garis yang melalui titik ("+obj.getX1()+","
                +obj.getY1()+") dan ("+obj.getX2()+","+obj.getY2()+")");
        System.out.println("Memiliki Gradien Sebesar "+obj.hitungGradien());
        
        System.out.println("");
        
        Koordinat obj2 = new Koordinat(0,0,0,0);
        obj2.setX1(5);
        obj2.setY1(1);
        obj2.setX2(3);
        obj2.setY2(12);
        System.out.println("Garis yang melalui titik ("+obj2.getX1()+","
                +obj2.getY1()+") dan ("+obj2.getX2()+","+obj2.getY2()+")");
        
        System.out.println("Memiliki Gradien Sebesar "+obj2.hitungGradien());
    }
    
}
