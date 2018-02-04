package ui.pageobject;

import org.openqa.selenium.support.PageFactory;
import ui.driver.Driver;

public class BasePO  {

   public BasePO(){
       PageFactory.initElements(Driver.getDriver(), this);
   }
}
