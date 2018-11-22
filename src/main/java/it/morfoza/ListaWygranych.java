package it.morfoza;

import java.util.List;

public class ListaWygranych {

    private List<Wygrany> wygrani;

    public void dodajWygranego (Wygrany wygrany){
        this.wygrani.add(wygrany);
    }

    public List<Wygrany> getWygrani() {
        return wygrani;
    }

    public void setWygrani(List<Wygrany> wygrani) {
        this.wygrani = wygrani;
    }
}
