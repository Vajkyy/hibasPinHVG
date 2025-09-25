package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PinModell {
    private String pin = "";
    private int kattDb = 0;
    private final int PIN_HOSSZ = 4;
    private final Path pinFajl = Path.of("pin.txt");

    public void pinHozzaad(int szam) {
        if (kattDb < PIN_HOSSZ) {
            pin += szam;
            kattDb++;
        }
    }

    public boolean pinKeszenVan() {
        return kattDb == PIN_HOSSZ;
    }

    public String getPin() {
        return pin;
    }

    public void resetPin() {
        pin = "";
        kattDb = 0;
    }

    public void mentes() throws IOException {
        Files.writeString(pinFajl, pin);
    }

    
}
