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

class DepartamentosLista{
	private WebDriver driver;
	
public DepartamentosLista(WebDriver driver) {
	this.driver = driver;
	
}
	public void visita() {
		
		driver.get("http://dev.lti.net.br/sisgr/departamentos");
	}
	
	public void novo() {
		driver.findElement(By.linkText("Departamento")).click();
	}
	
	public boolean exixteNaListagem(String nome) {
		return driver.getPageSource().contains(nome);
	}

}

