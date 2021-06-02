package com.zistrong.jakartaee.faces;

import jakarta.faces.component.html.HtmlInputText;
import org.primefaces.component.inputtext.InputText;

public class JakartaEEInputText extends InputText {
    @Override
    public String getAutocomplete() {
        return (java.lang.String) getStateHelper().eval(HtmlInputText.PropertyKeys.autocomplete, "off");
    }
}
