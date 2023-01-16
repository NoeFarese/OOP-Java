package ch.css.tannenbaum;

public class Tanne {

    private int stammbreite;
    private int stammhoehe;
    private int kronenhoehe;
    private String zeichnung;

    public int getStammhoehe() {
        return stammhoehe;
    }

    public void setStammhoehe(int stammhoehe) {
        this.stammhoehe = stammhoehe;
    }

    public int getStammbreite() {
        return stammbreite;
    }

    public void setStammbreite(int stammbreite) {
        this.stammbreite = stammbreite;
    }

    public int getKronenhoehe() {
        return kronenhoehe;
    }

    public void setKronenhoehe(int kronenhoehe) {
        this.kronenhoehe = kronenhoehe;
    }
    //-----------------------------------------------------------------------------------------

    public String getZeichnung() {
        return zeichnung;
    }

    public void setZeichnung(String zeichnung) {
        this.zeichnung = zeichnung;
    }

    public Tanne(int stammbreite, int stammhoehe, int kronenhoehe) {
        this.stammbreite = stammbreite;
        this.stammhoehe = stammhoehe;
        this.kronenhoehe = kronenhoehe;
    }

    public void zeichne() {
        zeichnung = "";
        zeichneKrone();
        zeichneStamm();
    }

     private void zeichneKrone() {
        for (int i = 1; i <= kronenhoehe; ++i)
            zeichneZeile(kronenhoehe - i, 2 * i - 1);
    }

    private void zeichneStamm() {
        for (int i = 1; i <= stammhoehe; ++i)
            zeichneZeile(kronenhoehe - stammbreite / 2 - 1, stammbreite);
    }

    private void zeichneZeile(int start, int breite) {
        int i;
        for (i = 1; i <= start; ++i)
            zeichnung += " ";

        for (i = 1; i <= breite; ++i)
            zeichnung += "*";

        zeichnung += "\n";
    }

   /* private void zeichneStamm(){
        for (int i = 0; i < stammhoehe; i++) {
            int leerZeichen = kronenhoehe -(int)Math.ceil((stammbreite)/2);

            zeileZeichnen(leerZeichen, stammbreite);
        }
    }

    private void zeichneKrone(){
        for (int i = 0; i < kronenhoehe; i++) {
            zeileZeichnen(kronenhoehe - i, 2 * i -1);
        }
    }

    private void zeileZeichnen(int anzahlLeerzeichen, int anzahlSterne){
        System.out.println(" ");

        for (int i = -1; i < anzahlLeerzeichen; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < anzahlSterne; i++) {
            System.out.print("*");
        }
    } */
}
