import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondAutomatedTest {

    private WebDriver driver;

    @BeforeMethod
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver","C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void mySecondTest() {
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/actions/Catalog.action");
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("pkiljanczyk1");
        driver.findElement(By.name("password")).sendKeys("Qwerty123");
        driver.findElement(By.name("signon")).click();
        if (driver.findElement(By.className("messages")).isDisplayed());
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.name("username")).sendKeys("pkiljanczyk1");
        driver.findElement(By.name("password")).sendKeys("Qwerty123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Qwerty123");
        driver.findElement(By.name("account.firstName")).sendKeys("Piotr");
        driver.findElement(By.name("account.lastName")).sendKeys("Kiljańczyk");
        driver.findElement(By.name("account.email")).sendKeys("aa@wp.pl");
        driver.findElement(By.name("account.phone")).sendKeys("111222333");
        driver.findElement(By.name("account.address1")).sendKeys("Obok2");
        driver.findElement(By.name("account.city")).sendKeys("Warszawa");
        driver.findElement(By.name("account.state")).sendKeys("Mazowieckie");
        driver.findElement(By.name("account.zip")).sendKeys("1112");
        driver.findElement(By.name("account.country")).sendKeys("Poland");
        driver.findElement(By.name("newAccount")).click();

    }

}