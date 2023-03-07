package day07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {
    @Test
    public void test01(){
        //user.home
        //C:\Users\parla\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\jbr\bin\seleniumTeam108\seleniumTeam108\src\test\java\day07_actionsClass_fileTestleri\text.txt
       //"C:\Users\parla\OneDrive\Masaüstü\Java Team108.pdf"
        // icinde bulundugumuz projenin temel dosya yolu user.dir

        String dosyaYolu="C:/Users/parla/OneDrive/Masaüstü/Java Team108.pdf";
        boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);

        // bilgisayarimizin temel dosya yolu user.home
        // /Users/ahmetbulutluoz/Desktop/Thedelta.docx
        //C:\Users\FURKAN\Desktop\TheDelta.docx"
        //C:\Users\Lenovo\Desktop\TheDelta.docx
        // /Users/ahmetbulutluoz/Downloads


        //    /Users/ahmetbulutluoz/IdeaProjects/seleniumTeam108
        //   /Users/ahmetbulutluoz/IdeaProjects/seleniumTeam108/src/test/java/day07_actionsClass_fileTestleri/text.txt
        // C:\Users\Zafer\Desktop\gitHubTeam108\com.wisequarter1\src\test\java\day07_fileTests\text
        // C:\Users\sevil\IdeaProjects\seleniumTeam108\src\test\java\day07_actionClass_fileTest\text.txt

        String dosyaYolu1="/Users/ahmetbulutluoz/Desktop/Thedelta.docx";
        boolean sonuc1 = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */
        System.out.println(System.getProperty("user.home"));
        dosyaYolu="/Users/ahmetbulutluoz/Desktop/Thedelta.docx";
        dosyaYolu= System.getProperty("user.home") + "/Desktop/Thedelta.docx";
        System.out.println(System.getProperty("user.dir"));// src den oncesini verdi

    }
}
