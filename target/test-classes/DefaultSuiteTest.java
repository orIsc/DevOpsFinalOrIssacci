// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void finalProject() {
    driver.get("http://localhost:8082/DevOpsFinalOrIssacci-0.0.1-SNAPSHOT/");
    driver.manage().window().setSize(new Dimension(1384, 1027));
    driver.findElement(By.id("guess-input")).click();
    driver.findElement(By.id("guess-input")).sendKeys("6");
    driver.findElement(By.id("guess-btn")).click();
    {
      String value = driver.findElement(By.id("guess-input")).getAttribute("value");
      assertThat(value, is("6"));
    }
    driver.findElement(By.id("guess-input")).sendKeys("7");
    driver.findElement(By.id("guess-input")).click();
    {
      String value = driver.findElement(By.id("guess-input")).getAttribute("value");
      assertThat(value, is("7"));
    }
    driver.findElement(By.id("guess-btn")).click();
    driver.findElement(By.id("guess-input")).sendKeys("8");
    driver.findElement(By.id("guess-input")).click();
    {
      String value = driver.findElement(By.id("guess-input")).getAttribute("value");
      assertThat(value, is("8"));
    }
    driver.findElement(By.id("guess-btn")).click();
  }
}
