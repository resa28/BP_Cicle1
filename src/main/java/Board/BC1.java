package Board;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BC1 {
    @Test
    public void Test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://staging.cicle.app/signin");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button[1]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("identifierId")).sendKeys("zzxxahmad92@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("resacantikk");
        driver.findElement(By.xpath("//*[@id=\"c3\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
    }
}