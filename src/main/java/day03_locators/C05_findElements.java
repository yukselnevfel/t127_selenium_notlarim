package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_findElements {
    public static void main(String[] args) throws InterruptedException {

      //  gerekli ayarlamalari yapın

        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");

       // shoes linkine tıklayın
        driver.findElement(By.partialLinkText("hoes")).click();
        Thread.sleep(2000);
        //cıkan ürünlerden 3. ürüne tıklayın
        List<WebElement>urunElementleriListesi=driver.findElements(By.className("prod-img"));

        urunElementleriListesi.get(2).click();
        Thread.sleep(2000);
       // urun kısa acıklamalarında case sensitive olmadan shoe gectiğini test edin.

    }
}
