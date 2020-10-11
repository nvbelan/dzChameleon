package com.aplana.chameleon.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends WebElementFacade {

    public Button(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    public void click(){
        if(!getWrappedElement().isDisplayed()) {
            getDriver().executeScript("return arguments[0].scrollIntoView(true)", getWrappedElement());
        }
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(getWrappedElement())).click();
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
