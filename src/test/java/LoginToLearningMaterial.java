import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginToLearningMaterial {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() throws InterruptedException {
        //driver = new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void verifyHomePageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void enterEmail() {
        driver.findElement(By.id("login-email")).sendKeys("Yinhla@gmail.com");
    }

    @Test(priority = 4)
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("Yinhla@1234");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void verifyLearningMaterialsPageIsDisplayed() {
        driver.findElement(By.id("practice-heading")).isDisplayed();
    }

    @Test(priority = 6)
    public void openWebAutomationForm() throws InterruptedException {
        // Click "Web Automation" tab
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(3000);


    }

    @Test(priority = 7)
    public void fillName() throws InterruptedException {
        // Fill out form name field
        driver.findElement(By.id("name")).sendKeys("Ntshuxekani Zitha");
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void fillEmail() throws InterruptedException {
        // Fill out form email field
        driver.findElement(By.id("email")).sendKeys("ntshuxekanizitha@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void fillAge() throws InterruptedException {
        // Fill out form age field
        driver.findElement(By.id("age")).sendKeys("22");
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void fillGender() throws InterruptedException {
// Fill out form gender field
        driver.findElement(By.id("gender")).sendKeys("Female");
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void fillCountry() throws InterruptedException {
        // Fill out form country field
        driver.findElement(By.id("country")).sendKeys("South Africa");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void experience() throws InterruptedException {
        // Fill out form experience field
        driver.findElement(By.id("experience")).sendKeys("Beginner");
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void skills() throws InterruptedException {
        // Tick checkboxes for skills
        driver.findElement(By.id("skill-testing")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void addComments() throws InterruptedException {
        // Add comments
        driver.findElement(By.id("comments")).sendKeys("Excited to learn automation testing with Ndosi!");
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void checkTermsAndConditions() throws InterruptedException {
        // Tick newsletter and terms
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void submit() throws InterruptedException {
        // Click Submit
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(3000);

    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
