package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Alex");
        driver.findElement(By.name("lastname")).sendKeys("Costa");
        driver.findElement(By.name("reg_email__")).sendKeys("alexcosta894775@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("alexcosta894775@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Alexc@$#!osta894775");
        driver.findElement(By.name("birthday_year")).click();
        driver.findElement(By.id("year")).sendKeys("2010");
        driver.findElement(By.className("_8esa")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_q_9_9L")).click();

        driver.close();

    }
}
