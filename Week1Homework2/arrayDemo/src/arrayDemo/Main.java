package arrayDemo;

public class Main {

	public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Alperen";
        ogrenciler[1]="Melih";
        ogrenciler[2]="Berkan";
        ogrenciler[3]="Cihad";

        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------------");

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

	}

}
