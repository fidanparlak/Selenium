package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
    public static void main(String[] args) {
        // Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe"); // Bu satirda sisteme driver'imizi tanitiyoruz
        // Driver'imizin yolunu gosteriyoruz
        // Create chrome driver

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Bu adimda hangi tarayici da calistiracagimizi belirliyoruz, Cross testingde ihtiyacimiz olacak


        // Maximize the window


        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com"); // Ilk etapta navigate mi get mi nasil karar veriyoruz?

        // Get metodu daha hizli calisir, navigate ise daha cok bagimli senaryolarda tercih edilir
        // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com"); // navigate ise daha cok bagimli senaryolarda tercih edilir

        // Navigate back to google
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.quit(); // Close bulunulan son sayfayi , Quit ise tum sayfalari kapatir

        // And last step : print "All Ok" on console
        System.out.println("All OK");

}
}
