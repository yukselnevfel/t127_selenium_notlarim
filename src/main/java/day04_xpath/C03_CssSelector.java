package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomsyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        //Electronics linkine tıklayın
driver.findElement(By.xpath("(//a[text()=‘Electronics’])[3]")).click();
        //Kenarda bulunan fiyat lisesinde min 10 max 200 yazarak filtreleme yapın.


        WebElement minKutu= driver.findElement(By.cssSelector("input[.form-control minPrice"));
        WebElement maxKutu= driver.findElement(By.cssSelector(".form-control maxPrice"));


        //arama sonucunda urun bulunabildiğini test edin.
    }
}
