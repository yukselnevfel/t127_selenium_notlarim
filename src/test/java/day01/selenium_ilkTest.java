package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_ilkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://amozon.com");
    }
}
