package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class customerLoginPage {
    private WebDriver driver;
//    @FindBy (xpath = "//*[@id=\"userSelect\"]/option[3]")
//    WebElement userSelect;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement loginBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[1]/strong/span")
    WebElement account;

    public customerLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseYourName(String userSelect){
        List<WebElement> listCustomerYourName = driver.findElements(By.tagName("option"));
        for(WebElement e : listCustomerYourName){
            if (e.getText().equalsIgnoreCase(userSelect)){
                e.click();
                break;
            }
        }
    }

    public void clickLogBtn() throws InterruptedException {
        Thread.sleep(3000);
        loginBtn.click();
    }

    public void checkAccount() throws InterruptedException {
        Thread.sleep(3000);
        if (account.getText().equalsIgnoreCase("Harry Potter")){
            System.out.println("Test Account Pass!");
        }
        else {
            System.out.println("Test Account Fail!");
        }
    }
}
