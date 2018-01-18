package SISGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoLoginPage {

private final WebDriver driver;
	
	public NovoLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logar(String login, String password) {
		
		WebElement txtLogin = driver.findElement(By.name("login"));
        WebElement txtSenha = driver.findElement(By.name("password"));
		
		txtLogin.sendKeys(login);
		txtSenha.sendKeys(password);
		txtLogin.submit();
	}

}
