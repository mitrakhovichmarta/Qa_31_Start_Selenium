import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorkMarta {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
        wd.manage().window().maximize();


    }
    @Test
    public void locators () {
        //by tagName
        //WebElement buttonSubmit = wd.findElement(By.tagName("login"));
        WebElement buttonSubmit1 = wd.findElement(By.cssSelector("[name= 'login']"));

        //by class
        WebElement classContainer1 = wd.findElement(By.cssSelector(".container"));

        //by id
        WebElement root = wd.findElement(By.cssSelector("#root"));


        //by attribute
        WebElement home = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement about = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));

        // one of elements find by - start - end -contains
        //start
        WebElement email = wd.findElement(By.cssSelector("[placeholder ^= 'Email']"));
        //end
        WebElement password = wd.findElement(By.cssSelector("[placeholder $='Password']"));
        //contains
        WebElement password1 = wd.findElement(By.cssSelector("[placeholder *='Password']"));

       wd.quit();

    }

}
