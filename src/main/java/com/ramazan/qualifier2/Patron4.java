package com.ramazan.qualifier2;

@QualifierMultiple(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "ENUM UCUNCU "+data;
    }
}
