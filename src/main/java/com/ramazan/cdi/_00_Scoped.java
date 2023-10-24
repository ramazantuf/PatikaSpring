package com.ramazan.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

@Named
//@ApplicationScoped Bütün uygulama boyunca çalışır bütün kullanıcılar için
//@RequestScoped 1 istek boyunca
//@SessionScoped 1 kullanıcı için yaşar ancak logout da atta
//@Dependent //bukelemon
//@ConversationScoped//Belli istek boyunca yaşar
public class _00_Scoped {
}
