package exercicio01Selenium.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import exercicio01Selenium.page.GooglePO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GoogleTest extends BaseTest{

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes(){
        driver.get("https://www.google.com");
        googlePage = new GooglePO(driver);
    }
    
    @Test
    public void inputPesquisaGoogle(){
        String searchGoogle = googlePage.obterTextoInputPesquisaGoogle();
        assertEquals("Gmail", searchGoogle);
    }
}
