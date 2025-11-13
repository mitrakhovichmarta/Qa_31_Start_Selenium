import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkMarta {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
        wd.manage().window().maximize();


    }
    @Test
    public void locators() {
        //by tagName
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el5 = wd.findElement(By.cssSelector(".login_login__3EHKB"));


        //by id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));
        WebElement el14 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement el8 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el9 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement xp = wd.findElement(By.xpath("//*[@href = '/about']"));

        WebElement name = wd.findElement(By.name("email"));
        WebElement name1 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement name2 = wd.findElement(By.xpath("//*[@name='email']"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement el10 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement attr = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement attr2 = wd.findElement(By.xpath("//*//placeholder"));
        //start
        WebElement el11 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement attr4 = wd.findElement(By.xpath("//*[starts-with(@placeholder='Em')]"));


        //end
        WebElement el12 = wd.findElement(By.cssSelector("[placeholder $='il']"));

        //contains
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement atr1 = wd.findElement(By.xpath("//*[contains(@placeholder='ma')]"));


        WebElement password = wd.findElement(By.cssSelector("[placeholder='Password]"));
        WebElement password_xP = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement password1 = wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        WebElement password_xP1 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));

        WebElement password2 = wd.findElement(By.cssSelector("[placeholder *= 'ss']"));
        WebElement password_xP2 = wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));

        WebElement password3 = wd.findElement(By.cssSelector("[placeholder $= 'rd]"));
        WebElement password_xP3 = wd.findElement(By.xpath("//*[contains(@placeholder,'rd')]"));

    }


    @Test
    public void classwork() {
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));


        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::*"));
        WebElement el8 = wd.findElement(By.xpath("//a[3]/preceding-sibling::a[1]"));
    }

    @Test
    public void classwork1() {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("**************************************");
        System.out.println(textForm);


        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("**************************************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--->"+br.getText());
    }

}
