package com.ramazan.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Sürüm "+data;
    }
}
