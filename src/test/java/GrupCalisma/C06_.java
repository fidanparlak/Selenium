package GrupCalisma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C06_ extends TestBase {
    @Test
    public void setup(){
        //1- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //2- cizgili alan uzerine sag click yapin ve alerti onaylayin
        driver.findElement(By.id("hot-spot")).click();

        //3- ana sayfade "Context Menu" yazdigini test edin

        //4- ikinci bir sayfada youtub a gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        String ikinciSayfaWHD=driver.getWindowHandle();
        //5- arambolumunde "Java" aratin cikan videolarin baslik kismind a"String" ifadesi bulundugunu testedin
        WebElement youtubeAramaKutusu=driver.findElement(By.xpath("//input[@name='search_query']"));

        //5- arambolumunde "Java" aratin cikan videolarin baslik kismind a"String" ifadesi bulundugunu testedin

        //6-https://demoqa.com/droppable adersine gidin ve Accept boumune tiklayin ve
        //7- accepttable elementini drop here bolume surukleyin ve cikan yazinin "Dropped"! oldugunu test edin
        //8 - youtube don ve ana sayfada youtube amnblemi gozuktugunu test et
        //9- baslangic sayfamiza donup test islemini tamamlayiniz


    }
}
