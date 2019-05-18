public class Poveste {
    public static void main(String[] args){
        Biserica bisericaSfIosif = new Biserica();
        bisericaSfIosif.nume = "Catedrala Romano Catolica Sf Iosif";
        bisericaSfIosif.capacitate = 100;
        bisericaSfIosif.longitudine = 21.3;
        bisericaSfIosif.latitudine = 36.8;
        bisericaSfIosif.tipReligie = "catolica";
        bisericaSfIosif.program = " Luni-Dumica 7-20";
        bisericaSfIosif.buget = 1000;
        bisericaSfIosif.rating = 4;
        bisericaSfIosif.oameniPrezenti= 98;

        bisericaSfIosif.faSlujba();
        bisericaSfIosif.primesteOameni(98);

        Biserica catedralaMN= new Biserica();
        catedralaMN.nume = "Catedrala mantuirii Neamului";
        catedralaMN.capacitate = 1000;
        catedralaMN.longitudine = 45.3;
        catedralaMN.latitudine = 85.0;
        catedralaMN.tipReligie = "Ortodoxa";
        catedralaMN.program = "Luni-Duminica 8-20";
        catedralaMN.buget = 3000;
        catedralaMN.rating = 5;

        catedralaMN.faSlujba();
        catedralaMN.primesteOameni(67);
        System.out.println("Am primit toti " + " oamenii");
    }
}
