package PRACTISE.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        /*
     ...Exercise3...
     Navigate to  https://testpages.herokuapp.com/styled/index.html
     Click on  Calculater under Micro Apps
     Type any number in the first input
     Type any number in the second input
     Click on Calculate
     Get the result
     Print the result

         */

     System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Thread.sleep(2000);

        driver.findElement(By.id("calculatetest")).click();

        driver.findElement(By.id("number1")).sendKeys("136");
        //
        // driver.findElement().
        driver.quit();

        //sorun hallolmuş oldu
        // kolay gelsin



    }

}
