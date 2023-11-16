package PRACTISE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GetNavigate {
    public static void main(String[] args) throws InterruptedException {

    /*
            Create a new class with main method
        Set Path
        Create a chrome driver
        Maximize window
        Open google home page https://www.google.com
        On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        Wait about 4 sn
        Navigate forward to amazon
        Refresh page
        Close/quit the browser
        And Last step print "All is well" on console

    */
        // Set Path
        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
    // Create a chrome driver
    //        Maximize window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open google home page https://www.google.com
        driver.get("https://www.google.com");


        // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google

        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(4000);

        driver.navigate().forward();

        Thread.sleep(5000);

        //Refresh page
        driver.navigate().refresh();

        //  Close/quit the browser
        driver.quit();

        // And Last step print "All is well" on console
        System.out.println("All is Well");
    }
}
