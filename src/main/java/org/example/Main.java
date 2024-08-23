package org.example;

import com.google.common.cache.CacheBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        static WebDriver createInstance(String browserName) throws IOException {
                WebDriver driver = null;
                if (browserName.equalsIgnoreCase(
                        "chrome"
                ))
                {
                        if(System.
                                getProperty
                                        (
                                                "webdriver.chrome.driver"
                                        )==null){
                                String chromeExe =
                                        "C:/Users/Priya Jha/IdeaProjects/Selenium_check/src/main/resources/chromedriver3.exe"
                                        ;// set the path to chromedriver for Windows systems
                                System.
                                        setProperty
                                                (
                                                        "webdriver.chrome.driver"
                                                        , chromeExe);
                        }
                        System.
                                setProperty
                                        (
                                                "webdriver.chrome.silentOutput"
                                                ,
                                                "true"
                                        );
 DesiredCapabilities capabilities = new DesiredCapabilities("chrome","125.0.6422.113", Platform.ANY);
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments(
                                "--disable-setuid-sandbox"
                        );
                        options.addArguments(
                                "--disable-notifications"
                        );
                        options.setExperimentalOption(
                                "useAutomationExtension"
                                , false);
                        options.addArguments(
                                "start-maximized"
                        ); //
                        https://stackoverflow.com/a/26283818/1689770
                        options.addArguments(
                                "enable-automation"
                        ); //
                        https://stackoverflow.com/a/43840128/1689770
                        options.addArguments(
                                "--no-sandbox"
                        ); //
                        https://stackoverflow.com/a/50725918/1689770
                        options.addArguments(
                                "--disable-infobars"
                        ); //
                        https://stackoverflow.com/a/43840128/1689770
                        options.addArguments(
                                "--disable-dev-shm-usage"
                        ); //
                        https://stackoverflow.com/a/50725918/1689770
                        options.addArguments(
                                "--disable-browser-side-navigation"
                        ); //
                        https://stackoverflow.com/a/49123152/1689770
                        options.addArguments(
                                "--disable-gpu"
                        ); //
                        https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
                        options.setPageLoadStrategy(PageLoadStrategy.
                                NONE
                        );//
                        https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html

// options.addArguments("--window-size=1580,1280");
                        capabilities.setCapability(ChromeOptions.
                                        CAPABILITY
                                , options);
// Way to manually setup the webdriver-------------------
                        ChromeDriverService service = new ChromeDriverService.Builder()
                                .usingAnyFreePort().build();
                        service.start();
                        try
                        {
                                driver = new RemoteWebDriver(service.getUrl(), capabilities);
                                System.
                                        out
                                        .println(
                                                "Driver Intialised Successfully"
                                        );
                        }catch (Exception e)
                        {
                                System.
                                        out
                                        .println(
                                                "Error while setting up Remote Driver"
                                        );
                                e.printStackTrace();
                                throw e;
                        }
// another way to automatically setup webdriver using Boni Garcia's webdrvier
// manager---------------------------------------
//driver = WebDriverManager.chromedriver().capabilities(options).create();
                }
                return driver;
        }
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = createInstance("Chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("priya.jha@mtilex.com.mtifull");
        driver.findElement(By.id("password")).sendKeys("Welcome@12345");
        driver.findElement(By.id("Login")).click();
        /*Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("alert message is" + alertText);
        alert.accept();*/
        Thread.sleep(5000);
        WebElement lead = driver.findElement(By.xpath("//span[@class='slds-truncate'][normalize-space()='Leads']"));
        //Actions action = new Actions(driver);
        //action.moveToElement(web).click().perform();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click()",lead);




    }
}




