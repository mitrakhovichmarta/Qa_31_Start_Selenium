import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/mitra/Downloads/21.index.html");

    }
    @Test
    public void tableTest(){

        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");

    }


    @Test
    public void cssLocators() {
        //by tagName
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement el3 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        WebElement el2 = list.get(2);
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //by class
        WebElement divContainer =wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));

        List <WebElement>navList = wd.findElements(By.className("nav-item"));
        List <WebElement>navList1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        WebElement form = wd.findElement(By.id("form1"));
        WebElement form1 = wd.findElement(By.cssSelector("#form1"));


        //[href='#item3']

        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href='#item3']"));
        //start
        WebElement a4 = wd.findElement(By.cssSelector("[placeholder ^= 'Type']"));
        //end
        WebElement a5 = wd.findElement(By.cssSelector("[placeholder $='name']"));
        //contains
        WebElement a6 = wd.findElement(By.cssSelector("[placeholder *='your']"));


        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name = 'surename']"));
        WebElement inputS1 = wd.findElement(By.name("surename"));


        WebElement a = wd.findElement(By.linkText("Item 2"));
        WebElement a1 = wd.findElement(By.partialLinkText("m 2"));






    }
}
