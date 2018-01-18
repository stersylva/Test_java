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
    	driver.get("http://dev.lti.net.br/sisgr/departamentos/novo");
	}
	@Test
	public void deveAdicionarUmDepartamento() {
        
		departamentos.novo().cadastra("Departamento teste");
		
		assertTrue(departamentos.existeNaListagem("Departamento teste"));
		
		//WebElement Camponome = driver.findElement(By.name("nome"));
		//WebElement btnSalvar = driver.findElement(By.className("btn btn-primary"));
		
			//Camponome.sendKeys("Departamento teste");
			
		//btnSalvar.click();
		
	
		 //boolean achouNome = driver.getPageSource().contains("Departamento teste");
		 //assertTrue(achouNome);
		
		
	}
	@After
	public void encerra() {
		driver.close();
	}

}
