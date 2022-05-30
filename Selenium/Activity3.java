import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String args[]) throws InterruptedException{
        //declare and initialize the webdriver
        WebDriver driver = new FirefoxDriver();
        //open the url
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page title is : "+title);
        driver.findElement(By.id("firstName")).sendKeys("Suchismita");
        driver.findElement(By.id("lastName")).sendKeys("Roy");
        driver.findElement(By.id("email")).sendKeys("Suchismita.Roy1@ibm.com");
        driver.findElement(By.id("number")).sendKeys("9830112922");
        driver.findElement(By.className("green")).click();
        Thread.sleep(3000);
        //close the driver
        driver.quit();
    }
}
