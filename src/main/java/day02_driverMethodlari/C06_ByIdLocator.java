package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ByIdLocator {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //test otomasyonuna gidin

        driver.get("https://www.testotomasyonu.com");

        //arama kutusuna phone yazdir

        WebElement aramaKutusu =driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        Thread.sleep(10000);
        driver.quit();

    }
}
