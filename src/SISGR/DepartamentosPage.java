package SISGR;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;

import org.openqa.selenium.By;

class DepartamentosPage{
	private WebDriver driver;
	
public DepartamentosPage(WebDriver driver) {
	this.driver = driver;
	
}

	public void entra() {
		driver.get("http://dev.lti.net.br/sisgr/auth/login");
	}
	
	public NovoLoginPage entrar() {
		driver.findElement(By.name("subnit")).click();
		return new NovoLoginPage(driver);
	}
	
	
	public void visita() {
		
		driver.get("http://dev.lti.net.br/sisgr/departamentos");
	}
	

	
	public NovoDepartamentoPage novo() {
		driver.findElement(By.linkText("Departamento")).click();
		return new NovoDepartamentoPage(driver);
	}
	
	public boolean existeNaListagem(String nome) {
		return driver.getPageSource().contains(nome);
	}

}

