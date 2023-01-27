import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
public class ChromeTest {

    @Test
    void testChrome() {

        WebDriver webDriver = new ChromeDriver();
        // webDriver.get("https://chromedriver.chromium.orgooaoa/"); // org.openqa.selenium.WebDriverException: unknown error: net::ERR_NAME_NOT_RESOLVED
        // https://www.amcgrupo.eu/en/

//        webDriver.get("https://chromedriver.chromium.orgooaoa/");

//        webDriver.get("https://www.amazon.fr/");
        webDriver.get("https://www.sony.fr/");

        By by = By.id("twotabsearchtextbox");

        WebElement barreRecherche = webDriver.findElement(by);

        barreRecherche.sendKeys("import");
        barreRecherche.sendKeys(Keys.ENTER);


//        webDriver.quit();

    }

}
