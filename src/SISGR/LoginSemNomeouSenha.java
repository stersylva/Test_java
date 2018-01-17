package SISGR;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSemNomeouSenha {
	@Test
	public void NaoDeveLogarSemNomeouSenha() {
		WebDriver driver;
    	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
    	driver =new FirefoxDriver();

        // acessa o site do google
        driver.get("http://dev.lti.net.br/sisgr/auth/login");
        
        WebElement campoNome = driver.findElement(By.name("login"));
        campoNome.submit();
        
        assertTrue(driver.getPageSource().contains("O campo Login é obrigatorio."));
        assertTrue(driver.getPageSource().contains("Please enter your password"));
        
        driver.close();

	}

}
