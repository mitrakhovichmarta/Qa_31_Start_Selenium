package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsRadioButtonPage() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        //WebElement radioButtonYes = driver.findElement(By.cssSelector("label[for = 'yesRadio']"));
        //radioButtonYes.click();
        WebElement radioButtonYes1 = driver.findElement(By.xpath("//label[@for = 'yesRadio']"));
        radioButtonYes1.click();
        pause(3);
        WebElement radioButtonImpressive = driver.findElement(By.xpath("//*[@for = 'impressiveRadio']"));
        radioButtonImpressive.click();
        pause(3);
        WebElement btnTextBox = driver.findElement(By.xpath("//span[text()= 'Text Box']"));
        btnTextBox.click();
        pause(3);

        WebElement fieldFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fieldFullName.sendKeys("Sveta");
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        fieldEmail.sendKeys("sveta123@gmail.com");
        pause(3);

        WebElement textArea = driver.findElement(By.xpath("//*[text()='Current Address']/../..//textarea"));
        textArea.sendKeys("street 1");
        pause(3);
        WebElement textareaPerAddress = driver.findElement(By.xpath("//div[@id='permanentAddress']"));
        textareaPerAddress.sendKeys("avenue 1");

        WebElement btnSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
        btnSubmit.click();


        driver.quit();



    }

    public void pause(int time) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

