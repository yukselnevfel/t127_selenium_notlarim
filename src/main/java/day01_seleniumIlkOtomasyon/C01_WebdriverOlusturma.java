package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebdriverOlusturma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyaları/chromedriver.exe");
        // Bu satir olusturacagımız webdriver'in ozelliklerini set ediyor.
        // webdriver otomasyon sirasinda bizim elimiz, gozumuz, herseyimizdir

        WebDriver driver = new ChromeDriver();

        driver.get("https://testotomasyonu.com");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.close();
        driver.quit();

    }
}