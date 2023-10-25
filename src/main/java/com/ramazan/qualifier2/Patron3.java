package com.ramazan.qualifier2;

@QualifierMultiple(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "ENUM IKINCI "+data;
    }
}
