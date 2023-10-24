package com.ramazan.cdi;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Named(value="namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData="Merhaba insan evladı";
}
