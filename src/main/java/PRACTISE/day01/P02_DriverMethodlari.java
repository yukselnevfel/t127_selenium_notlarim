package PRACTISE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethodlari {
    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
}
