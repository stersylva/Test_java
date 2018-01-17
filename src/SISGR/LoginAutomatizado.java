package SISGR;


	import static org.junit.Assert.assertTrue;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class LoginAutomatizado {
		@Test
	    public void deveFazerLogin() {
	        // abre firefox
	    	WebDriver driver;
	    	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
	    	driver =new FirefoxDriver();

	        // acessa o site do google
	        driver.get("http://dev.lti.net.br/sisgr/auth/login");

	        // digita no campo com nome "q" do google
	        WebElement campoNome = driver.findElement(By.name("login"));
	        WebElement campoSenha = driver.findElement(By.name("password"));
	        campoNome.sendKeys("ADMIN");
	        campoSenha.sendKeys("lti1990");

	        // submete o form
	        WebElement botaoEntrar = driver.findElement(By.name("submit"));
	        	botaoEntrar.click();
	        	
	        //verificar se o o usuario logado é realmente o ADMIN
	        boolean achouNome = driver.getPageSource().contains("ADMIN");
	        
	        assertTrue(achouNome);
	        
	        
	        driver.close();

	    }
	}

