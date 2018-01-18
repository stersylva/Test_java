package SISGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoDepartamentoPage {
	
	private final WebDriver driver;
	
	public NovoDepartamentoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void cadastra(String nome) {
		
		WebElement txtnome = driver.findElement(By.name("nome"));
		
		txtnome.sendKeys(nome);
		txtnome.submit();
	}

}
