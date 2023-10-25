package com.ramazan.qualifier;

import lombok.Builder;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Default data "+data;
    }
}
