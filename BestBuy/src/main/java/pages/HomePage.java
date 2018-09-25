package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    public void Account() {
        driver.findElement(By.cssSelector("#hf_accountMenuLink")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void ShoppingHistory() {
        driver.findElement(By.cssSelector("#hf_historyMenuLink")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void OrderStatus() {
        driver.findElement(By.cssSelector("#hf_orderStatusMenuLink")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void SavedItems() {
        driver.findElement(By.cssSelector("#hf_listsMenuLink")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void search() {
        driver.findElement(By.cssSelector("[placeholder='Search Best Buy']")).sendKeys("smart tv", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void title(){
        System.out.println(driver.getTitle());
    }
}
