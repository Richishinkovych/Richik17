package Tests;

import Methods.IssuePage;
import Methods.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class IssueTest  extends BaseTest {

    @Test
    public void bcreateIssue() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.id("user_email")).sendKeys("qwe@qwe.qwe");
        driver.findElement(By.id("user_password")).sendKeys("qweqweqwe");
        driver.findElement(By.name("commit")).click();
        System.out.print("molodec");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='head_menu']/ul/li[1]/a")).click();
        Thread.sleep(500);
        System.out.print("My org page are opened");
        //Robit wse
    //        driver.findElement(By.xpath("//*[@id='my_organization']/div[1]/a")).click();
    //        System.out.print("Create org window are opened");
    //        Thread.sleep(2000);
    //        driver.findElement(By.id("organization_title")).sendKeys("GoogleChotinadsit1");
    //        driver.findElement(By.name("commit")).click();
    //        System.out.print("Chetko");
    //        Thread.sleep(2000);
    //         driver.findElement(By.linkText("GoogleChotinadsit1"));
    //        System.out.print("Organizatsia Isnue");
        // robit wse
//        driver.findElement(By.linkText("Add project")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Choose your organization")).click();
//        Thread.sleep(2000);
        //        gavno ne clickae na organizatsiu
        //        driver.findElement(By.id("//*[@id='organization']/ul/li[4]/")).click();
        //         suk pzdc
        //        driver.findElement(By.name("project[title]")).sendKeys("GoogleChotinadsit+1");
        //        driver.findElement(By.name("commit")).click();
        //        System.out.print("Povezlo");
        driver.findElement(By.linkText("My Projects")).click();
        System.out.print("My org projects are opened");
        Thread.sleep(500);
        driver.findElement(By.linkText("GoogleChotinadsit+1")).click();
        Thread.sleep(500);
        System.out.print("Projects are opened");
        driver.findElement(By.id("SvgjsSvg1044")).click();
        System.out.print("Test plan activities are opened");
        Thread.sleep(500);
        driver.findElement(By.linkText("Test plans")).click();
        Thread.sleep(500);
        driver.findElement(By.linkText("New test plan")).click();
        Thread.sleep(500);
        System.out.print("add test plan are opened");
        driver.findElement(By.id("test_plan_title")).sendKeys("ChetkiiTestplan");
        driver.findElement(By.name("commit")).click();
        System.out.print("test plan are created");
        Thread.sleep(1000);
//        ne robit
//        driver.findElement(By.linkText("Import")).click();
//        Thread.sleep(5000);
        driver.findElement(By.linkText("Add module")).click();
        Thread.sleep(500);
        driver.findElement(By.id("test_module_title")).sendKeys("Pfkegf");
        driver.findElement(By.name("commit")).click();
        System.out.print("Module created");
        driver.findElement(By.linkText("Add case")).click();
        Thread.sleep(500);
        driver.findElement(By.id("test_case_title")).sendKeys("Chetkii");
        driver.findElement(By.id("section")).click();
        Thread.sleep(500);
        driver.findElement(By.linkText("Pfkegf")).click();
        driver.findElement(By.name("commit")).click();
        Thread.sleep(100);
        System.out.print("test plan created");
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Test plan")).click();
        Thread.sleep(150);
        driver.findElement(By.linkText("Choose test plan")).click();
        driver.findElement(By.linkText("ChetkiiTestplan")).click();
        Thread.sleep(150);
        driver.findElement(By.id("report-button")).click();
        System.out.print("Ololosha supper");
//        WebElement isPresent = driver.findElement(By.linkText("Preview report"));
//                System.out.print(isPresent+"isPresent");
//        Thread.sleep(100500);

    }
}
