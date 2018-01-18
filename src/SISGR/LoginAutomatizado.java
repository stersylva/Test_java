package SISGR;


	import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class LoginAutomatizado {
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
		@After
		public void encerra() {
			driver.close();
		}
	}
		
		
		
		
		
		
	   // public void deveFazerLogin() {
	        // abre firefox
	    	//WebDriver driver;
	    	//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
	    	//driver =new FirefoxDriver();
	    	
	    	
	    	//WebDriver driver = new FirefoxDriver();


	        // acessa o site do google
	        //driver.get("http://dev.lti.net.br/sisgr/auth/login");

	        // digita no campo com nome "q" do google
	        //WebElement campoNome = driver.findElement(By.name("login"));
	        //WebElement campoSenha = driver.findElement(By.name("password"));
	        //campoNome.sendKeys("ADMIN");
	        //campoSenha.sendKeys("lti1990");

	        // submete o form
	        //WebElement botaoEntrar = driver.findElement(By.name("submit"));
	        	//botaoEntrar.click();
	        	
	        //verificar se o o usuario logado é realmente o ADMIN
	        //boolean achouNome = driver.getPageSource().contains("Departamentos");
	        
	        //assertTrue(achouNome);
	        
	        
	        //WebElement botaoDepartamentos = driver.findElement(By.linkText("Departamentos"));
	       // botaoDepartamentos.click();
	        
	        
	        
	        //driver.close();

	    //}
	//}

