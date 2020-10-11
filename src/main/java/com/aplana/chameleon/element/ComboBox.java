package com.aplana.chameleon.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComboBox extends WebElementFacade {
    public ComboBox(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    public void type(String value){
        getWrappedElement().click();
        WebElement select = getWrappedElement() .findElement(By.xpath(".//*[contains(text(), '" + value + "')]"));
       select.click();
    }
    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
