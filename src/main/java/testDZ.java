// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static java.lang.Thread.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class testDZ {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Qautotest() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-outline-white")).click();
        driver.findElement(By.cssSelector(".btn-link:nth-child(1)")).click();
        driver.findElement(By.id("signupName")).sendKeys("User");
        driver.findElement(By.id("signupLastName")).sendKeys("UserLast");
        driver.findElement(By.id("signupEmail")).sendKeys("userauto@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Password123");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Password123");
        driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Profile")).click();
        assertThat(driver.findElement(By.cssSelector(".profile_name")).getText(), is("User UserLast"));
        driver.findElement(By.linkText("Garage")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("addCarMileage")).sendKeys("100");
        driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();
        driver.findElement(By.linkText("Fuel expenses")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("150");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("56");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("72");
        driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
        driver.findElement(By.id("userNavDropdown")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".btn-danger")).click();



    }
}

