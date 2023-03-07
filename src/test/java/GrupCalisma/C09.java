package GrupCalisma;

public class C09 {
    //from selenium import webdriver
    //
    //# Driver'ı yükleyin ve siteye gidin
    //driver = webdriver.Chrome()
    //driver.get("https://www.w3schools.com/html/html_tables.asp")
    //
    //# Tabloyu tanımlayın
    //table = driver.find_element_by_id("customers")
    //
    //# "Country" sütununu tanımlayın ve tüm satırlardaki verileri alın
    //country_column = table.find_elements_by_xpath(".//tr/td[3]")
    //
    //# Verileri bir liste olarak toplayın
    //countries = [row.text for row in country_column]
    //
    //# Liste çıktısını yazdırın
    //print(countries)
    //
    //# Driver'ı kapatın
    //driver.quit()
    //Bu kod, "customers" ID'sine sahip tabloyu bulur, "Country" sütununu tanımlar ve daha sonra tüm satırlardaki verileri alarak bir liste olarak toplar. Son olarak, bu liste çıktısını yazdırır ve sürücüyü kapatır.




    //Tablo manipülasyonu, çerez işlemleri ve Selenium'un bunları nasıl ele alabileceği hakkında bir örnek soru verebilirim:
    //
    //Soru: Bir web sitesinde, bir tablodan veri almak ve daha sonra bir çerez ayarlamak istiyorum. Verileri almak için tablo manipülasyonunu, çerez ayarlamak için ise Selenium'un "Cookies" modülünü kullanarak nasıl bir kod yazabilirim?
    //
    //Cevap:
    //
    //python
    //Copy code
    //from selenium import webdriver
    //
    //# Driver'ı yükleyin ve siteye gidin
    //driver = webdriver.Chrome()
    //driver.get("https://example.com")
    //
    //# Tabloyu tanımlayın ve tüm satırları alın
    //table = driver.find_element_by_id("myTable")
    //rows = table.find_elements_by_tag_name("tr")
    //
    //# Tüm satırlar için veri alın
    //for row in rows:
    //    # Satırdaki tüm sütunları alın
    //    cols = row.find_elements_by_tag_name("td")
    //    # Her sütun için değeri yazdırın
    //    for col in cols:
    //        print(col.text)
    //
    //# Çerez ayarlayın
    //cookie = {'name': 'example_cookie', 'value': 'example_value'}
    //driver.add_cookie(cookie)
    //
    //# Sürücüyü kapatın
    //driver.quit()
}
