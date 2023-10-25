package com.ramazan.qualifier2;

@QualifierMultiple(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "ENUM BRINCI "+data;
    }
}
