package com.ramazan.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifierCdi")
@ApplicationScoped
public class Calisan {

    //default da çalışacak kod
   // @Inject
   // private PatronInterface patronInterface;
    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    public Calisan(){

        //patronInterface = new Patron1();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
