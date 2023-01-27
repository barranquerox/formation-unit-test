import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

  @Test
  void testChrome() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.fr");

    WebElement barre_recherche = driver.findElement(By.id("twotabsearchtextbox"));
    barre_recherche.sendKeys("import");
    barre_recherche.sendKeys(Keys.ENTER);

    driver.quit();
  }
}
