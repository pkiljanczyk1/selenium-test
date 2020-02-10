import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.get("https://facebook.com");
        driver.navigate().back();
        driver.findElement(By.name("q"));
        driver.close();
        driver.quit();
    }
}
