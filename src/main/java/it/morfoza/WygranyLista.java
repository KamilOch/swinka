package it.morfoza;

public class WygranyLista {

    private String imie;
    private int punkty;

    public WygranyLista (String imie, int punkty){
        this.imie = imie;
        this.punkty = punkty;
    }

    public String getImie() {
        return imie;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }
}
