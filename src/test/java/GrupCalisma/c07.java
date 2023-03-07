package GrupCalisma;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class c07 extends TestBase {
    //  2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    //  asagidaki testleri yapin
    @Test
    public void test01() {
        driver.get("https://www.bestbuy.com/");

        //  ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin //div[@class='background-container']

        //  ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin (//img[@class='logo'])[1]
       WebElement sayfaBasligi= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));


        //  ○ logoTest => BestBuy logosunun görüntülendigini test edin
        System.out.println("==============1=============");
        WebElement bestBuy=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        if (bestBuy.isDisplayed()){
            System.out.println("Special Offer testi PASSED");
        }else {
            System.out.println("Special Offer testi Failed");
        }
        //  ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        System.out.println("==============2=============");
        WebElement fransizca= driver.findElement(By.xpath("//button[text()='Français']"));

        if (fransizca.isDisplayed()){ //isDisplayed() gorundugunu test eder
            System.out.println("Special Offer testi PASSED");
        }else {
            System.out.println("Special Offer testi Failed");
        }


    }
    @Test
    public void test02(){

        //2) https://www.youtube.com adresine gidin
        driver.get(" https://www.youtube.com");

        //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin

        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
}

        //1. Bir Class olusturalim YanlisEmailTesti
        //2. http://automationpractice.com/index.php sayfasina gidelim
        //3. Sign in butonuna basalim
        //4. Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda “Invalid
        //email address” uyarisi ciktigini test edelim


        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        //2 ) Bir metod olusturun: iframeTest
        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //konsolda yazdirin.
        //- Text Box’a “Merhaba Dunya!” yazin.
        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu dogrulayin ve konsolda yazdirin.


        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        //2) sayfadaki iframe sayısını bulunuz.
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız
    }
