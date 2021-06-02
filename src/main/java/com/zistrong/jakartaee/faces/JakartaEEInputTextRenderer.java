package com.zistrong.jakartaee.faces;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import org.primefaces.component.inputtext.InputTextRenderer;

public class JakartaEEInputTextRenderer extends InputTextRenderer {
    @Override
    public void decode(FacesContext context, UIComponent component) {
        System.out.println("input render.....");
        super.decode(context, component);
    }
}
