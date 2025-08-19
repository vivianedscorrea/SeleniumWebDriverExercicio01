package exercicio01Selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(css  = ".gb_X")
    public WebElement searchGoogle;

    public GooglePO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public String obterTextoInputPesquisaGoogle(){
        return searchGoogle.getText();
    }
    
}
