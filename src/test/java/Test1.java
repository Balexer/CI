import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;

    @Test
    public void openChromePage() {
        System.out.println("");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();

    }
}
