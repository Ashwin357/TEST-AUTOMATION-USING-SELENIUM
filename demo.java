package selenium_projectdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\exe\\chrome-win64 (1)\\c\\chromedriver.exe"); // Update the path

        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        // Finding username and setting it
        WebElement txtbx_username = driver.findElement(By.name("user_login"));
        txtbx_username.sendKeys("username"); 

        // Password is set
        driver.findElement(By.name("user_password")).sendKeys("password"); 

        driver.findElement(By.name("submit")).click();
        String expected_title = "Zero - Account Summary"; 
        String actual_title = driver.getTitle();

        // Check point
        if (expected_title.equals(actual_title)) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
        }

        // Close the driver
        driver.quit();
    }
}
