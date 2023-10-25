package com.ramazan.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@BenimStereoType
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SteretypeBean {
    private Long id;
    private String name="Merhabalar";
    private String trade;
}
