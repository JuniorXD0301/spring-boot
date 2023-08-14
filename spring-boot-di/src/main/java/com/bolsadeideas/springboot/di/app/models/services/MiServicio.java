package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component("miServicioSimple")
// @Primary
public class MiServicio  implements IServicio{
    
    @Override
    public String operacion() {
        return "Ejecutando algún proceso importante simple...";
    }
}
