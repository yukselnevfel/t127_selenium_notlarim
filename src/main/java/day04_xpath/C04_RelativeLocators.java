package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_RelativeLocators {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrom.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com/relativeLocators");
        driver.findElement(By.id("pic7_thumb")).click();

        WebElement urunElementi= driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));

        String  actualUrunIsmi=urunElementi.getText();
        String expectedUrunIsmi="DSLR Camera";

        if (expectedUrunIsmi.equals(actualUrunIsmi)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }
    }
}
