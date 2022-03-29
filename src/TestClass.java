import org.openqa.selenium.By;
//this is to verify changes in github
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class TestClass {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
// This is for google
//        driver.get("https://google.com");
//        String Title = driver.getTitle();
//        System.out.println("Title of the page is "+ Title);
//                if (Title.contentEquals("Google"))
//                {
//                    System.out.println("Page title test pass");
//                }
//                else{
//                    System.out.println("Page title test Fail");
//                }
//        if (driver.getPageSource().contains("Google Search")) {
//            System.out.println("Pass Google Search is written");
//        } else {
//            System.out.println("Fail");
//        }
//        if (driver.getPageSource().contains("Pakistan")) {
//            System.out.println("Pass Pakistan is written");
//        } else {
//            System.out.println("Fail");
//        }
//        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
//            System.out.println("Pass I'm Feeling Lucky is written");
//        } else {
//            System.out.println("Fail");
//        }
//
//        if (driver.getPageSource().contains("I'm feeling lucky")) {
//            System.out.println("Pass I'm Feeling Lucky is written");
//        } else {
//            System.out.println("Fail");
//        }
        // For facebook

//
//        driver.get("http://www.facebook.com");
//
//        WebElement Title;
//        Title = driver.findElement(By.id("email"));
//        Title.sendKeys("daniyal.afzal1");
//        WebElement pass;
//        pass = driver.findElement(By.id("pass"));
//        pass.sendKeys("Monster111");
//
//        driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();

        //Switching between frame
//        driver.get("http://demo.guru99.com/selenium/deprecated.html");
//        driver.switchTo().frame("classFrame");
//        driver.findElement(By.linkText("Deprecated")).click();
//        //Thread.sleep(10000);
//        driver.findElement(By.linkText("Help")).click();




        // Test practice
//        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2,1));
//        WebElement web = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='cookieChoiceDismiss']")));
//        web.click();
//
//
//        WebElement Firstname;
//        Firstname = driver.findElement(By.name("firstname"));
//        Firstname.sendKeys("Danial Afzal");
//        WebElement Lastname;
//        Lastname = driver.findElement(By.name("lastname"));
//        Lastname.sendKeys("Janjua");
//        driver.findElement(By.id("sex-0")).click();
//        driver.findElement(By.id("exp-0")).click();
//        WebElement date;
//        date=driver.findElement(By.id("datepicker"));
//        date.sendKeys("21/2/2022");
//        driver.findElement(By.id("profession-1")).click();
//        driver.findElement(By.id("tool-2")).click();
//        WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
//        //continent.click();
//        Select sel = new Select(continent);
//        sel.selectByVisibleText("Europe");
//        WebElement commands = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
//        Select se_com = new Select(commands);
//        se_com.selectByVisibleText("Wait Commands");
//        WebElement photo = driver.findElement(By.xpath("//input[@id='photo']"));
//        photo.sendKeys("/home/vend/Pictures/1122.png");


       //driver.quit();






        // OLX search
//        driver.get("https://www.olx.com.pk/");
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10,1));
//        WebElement web = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Don't Allow\"]")));
//        driver.findElement(By.xpath("//button[text()=\"Don't Allow\"]")).click();
//        WebElement select = driver.findElement(By.xpath("//input[@class=\"fc60720d\"]"));
//        select.click();
//
//        select.sendKeys(Keys.CONTROL+"a");
//        select.sendKeys(Keys.DELETE);
//        select.sendKeys("Karachi");
//        driver.findElement(By.linkText("Karachi,Sindh")).click();



        //Daraz.com
        driver.manage().window().maximize();
        driver.get("https://www.daraz.pk/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2,1));
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[@class='airship-btn airship-btn-deny']"));
//        WebElement deny = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='airship-btn airship-btn-deny']")));
//        deny.click();
//        WebElement branch1 = driver.findElement(By.xpath("//li[@id=\"Level_1_Category_No1\"]"));
//        branch1.click();
//        WebElement branch2 = driver.findElement(By.xpath("//a[@class=\"hover\"]"));
//        branch2.click();
    }



        //tagName[@attribute='attributeValue']
}
