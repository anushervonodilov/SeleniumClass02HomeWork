package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Anush");
        driver.findElement(By.id("customer.lastName")).sendKeys("Odilov");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Main Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Philadelphia");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19115");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-2303-73");
        driver.findElement(By.id("customer.username")).sendKeys("anush2000");
        driver.findElement(By.id("customer.password")).sendKeys("anush2000@321");
        driver.findElement(By.id("repeatedPassword")).sendKeys("anush2000@321");
        driver.findElement(By.className("button")).click();

        driver.quit();



    }
}
