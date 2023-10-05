import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class setup {
    WebDriver driver;

    @BeforeClass
    public void initalization() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
//        driver = new FirefoxDriver();
//        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/?hl=ar");
    }

    @Test()
    public void firsttest() {
        boolean q = driver.findElement(By.name("q")).isDisplayed();
        Assert.assertTrue(q);
        System.out.print(q);
    }
    @Test
    public void sectest() {
        boolean q = driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnI']")).isDisplayed();
        driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnI']")).click();
        Assert.assertTrue(q);
        System.out.print(q);
        driver.navigate().back();
    }
    @Test
    public void secctest() {
        boolean q = driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).isDisplayed();
        Assert.assertTrue(q);
        System.out.print(q);
        driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnI']")).click();

//        driver.navigate().back();
    }

    @Test
    public void thirdtest() {
        driver.findElement(By.name("q")).sendKeys("koora" + Keys.ENTER);
        boolean dd =driver.findElement(By.id("slim_appbar")).isDisplayed();
        Assert.assertTrue(dd);
    }

    @AfterClass
    public void ending() {
//        System.out.print("end");
//        driver.quit();
    }
}
