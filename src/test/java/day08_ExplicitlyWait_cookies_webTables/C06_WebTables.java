package day08_ExplicitlyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {
    @Test
    public void test01() {

        //1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");


        // 2. Headers da bulunan basliklari yazdirin //div[@class='rt-thead -header']

        String basliklar = driver.findElement(By.xpath("//div[@class='rt-thead -header']")).getText();
        System.out.println("Data basliklar : " + "\n" + basliklar);
        System.out.println("==================");


        // 3. 2.sutunun basligini yazdiri

        String ucuncuSutunBaslik = driver.findElement(By.xpath("//div[text()='Last Name']")).getText();
        System.out.println("2. sutun baslik : " + ucuncuSutunBaslik);
        System.out.println("==================");

        // 4. Tablodaki tum datalari yazdirin
        //   List<WebElement>tumDataListesi=driver.findElements(By.xpath("//div[@class='ReactTable -striped -highlight']"));
        List<WebElement> tumDatalar = driver.findElements(By.xpath(" //div[@class='rt-td']"));

        int siraNo = 1;
        for (WebElement eachHead : tumDatalar) {
            System.out.println(siraNo + " : " + eachHead.getText());
            siraNo++;
        }
        //  int dataNo=1;
        // for (WebElement eachtumDatalar:tumDataListesi
        //   ) {
        // System.out.println("Data Listesi : \n"+dataNo+" - "+eachtumDatalar.getText());
        //  dataNo++;


        System.out.println("=========Bos olmayan data========");

        // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin

        List<WebElement> doluDataListesi = driver.findElements(By.xpath("//div[@class='ReactTable -striped -highlight']"));

        int dataListeNo = 1;

        for (WebElement eachDatalar : doluDataListesi
        ) {
            if (!doluDataListesi.contains(" ")) {
                System.out.println("Data Listesi : " + dataListeNo + " - " + eachDatalar.getText());
                dataListeNo++;
            }
        }
        // 6. Tablodaki satir sayisini yazdirin

        List<WebElement> satirlarListesi = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        int satirNo = 1;
        for (WebElement eachSatir : satirlarListesi
        ) {
            System.out.println("Satirlar Listesi : \n" + satirNo + "- " + eachSatir.getText());
            satirNo++;
        }
        System.out.println("=============================");


        // 7. Tablodaki sutun sayisini yazdirin

        List<WebElement> sutunlar = driver.findElements(By.xpath(" //div[@class='rt-resizable-header-content']"));
        int sutunSayisi = sutunlar.size();

        System.out.println("Tablodaki Sutun sayisi: " + sutunSayisi);
        System.out.println("============3.Sutun=================");

        // 8. Tablodaki 3.kolonu yazdirin
        List<WebElement> ucuncusutunListesi = driver.findElements(By.xpath("//div[@class='rt-td'][3]"));
        int ucuncusutunNo = 1;
        for (WebElement eachucuncuSutun : ucuncusutunListesi
        ) {
            System.out.println("3. sutun listesi : \n" + ucuncusutunNo + "- " + eachucuncuSutun.getText());
            ucuncusutunNo++;
        }
        System.out.println("=============================");

        // 9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
        String kierraSalary = driver.findElement(By.xpath("//div[text()='2000']")).getText();
        System.out.println("Kierra salary : " + kierraSalary);


        //10. Bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
    }
          public String getData(int satirNo, int sutunNo){

          String dataXpath= "//tbody/tr[1]/td[3]";
          String istenenData = driver.findElement(By.xpath(dataXpath)).getText();
          return istenenData;


    }


}