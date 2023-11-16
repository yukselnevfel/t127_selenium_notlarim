package PRACTISE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_ilkSeleniumTesti {

    public static void main(String[] args) {

        /*
         .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
 Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de” adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/” adresine gidip
9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
  */

        System.setProperty("Webdriver.chrome.driver","kurulumDosyaları/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://www.otto.de");

        //-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoUrl=  driver.getCurrentUrl();
        String ottoTitle=   driver.getTitle();
        if (ottoTitle.contains("0TT0") && ottoUrl.contains("0TT0")){
            System.out.println("Title and Url Test PASSED");
        }else {
            System.out.println("Title and Url Test FAİLED");
        }
        System.out.println("-----------Test tamamlandı:)--------------");
        System.out.println("");
       driver.get("https://wisequarter.com");

        String wqTitle=driver.getTitle();
        boolean kelime=wqTitle.contains("Quarter");
        if (kelime){
            System.out.println("Wise Quarter Test PASSED");
        }else {
            System.out.println("Wise Quarter Test FAİLED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.println("------------Test tamamlandı:)-------------");







        driver.quit();













    }
}
