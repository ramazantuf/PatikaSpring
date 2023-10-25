package com.ramazan.iocli;

public class Patron implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Sürüm "+data;
    }
}
