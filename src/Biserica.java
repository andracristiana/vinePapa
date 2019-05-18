public class Biserica {
    String nume;
    Double latitudine;
    Double longitudine;
    String tipReligie;
    String program;
    int buget;
    int rating;
    int capacitate;
    int oameniPrezenti;

    public void faSlujba(){
        System.out.println("Bine ati venit la slujba de la biserica " + nume);
    }
    public int primesteOameni(int numarOameni){
        if (capacitate == oameniPrezenti){
            System.out.println ("Nu mai avem locuri.");
            return 0;
        }
        int locuriInBiserica = capacitate - oameniPrezenti;
        if(numarOameni > locuriInBiserica){
            System.out.println("Din pacate au putut intra in biserica doar " + locuriInBiserica + "oameni");
            this.oameniPrezenti = capacitate;
            int ramasiAfara = numarOameni - locuriInBiserica;
            System.out.println("Au ramas pe afara " + ramasiAfara + " oameni");
            return locuriInBiserica;
        }
        this.oameniPrezenti += numarOameni;
        System.out.println("Au intrat toti " + numarOameni + " oamenii");
        return numarOameni;
    }
}
