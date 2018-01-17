package SISGR;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;

public class Departamento {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
    	driver =new FirefoxDriver();
	}
	@Test
	public void deveAdicionarUmDepartamento() {
        // acessa o site do google
        driver.get("http://dev.lti.net.br/sisgr/departamentos/novo");
		
		WebElement Camponome = driver.findElement(By.name("nome"));
			Camponome.sendKeys("Departamento teste");
			
		Camponome.submit();
		
		assertTrue(driver.getPageSource().contains("Departamento teste"));
	}
	@After
	public void encerra() {
		driver.close();
	}

}
