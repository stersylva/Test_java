package SISGR;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Departamento {
	
	private FirefoxDriver driver;
	private DepartamentosPage departamentos;
	
	@Before
	public void inicializa() {
		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
    	//driver =new FirefoxDriver();
		
		this.driver = new FirefoxDriver();
		this.departamentos = new DepartamentosPage(driver);
	}
	
	@Test
	public void deveLogar() {
		departamentos.entrar();
		
	}
	
	@Test
	public void deveAdicionarUmDepartamento() {
		
		departamentos.visita();
		departamentos.novo().cadastra("Departamento teste");
		
		assertTrue(departamentos.existeNaListagem("Departamento teste"));
		
		
	}
	@After
	public void encerra() {
		driver.close();
	}

}
