package com.ramazan.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    //default da çalışacak kod
    //@Inject
    //private PatronInterface patronInterface;
    @Inject
    @QualifierMultiple(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;

    public Calisan(){

        //patronInterface = new Patron1();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
