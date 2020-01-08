package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class customerDepositPage {

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[2]")
    WebElement depositTopBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement amount;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/button")
    WebElement depositBottomBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/span")
    WebElement amountLabel;

    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        depositTopBtn.click();
    }

    public void inputAmountDep(String numberDep) throws InterruptedException {
        Thread.sleep(3000);
        amount.sendKeys(numberDep);
    }

    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        depositBottomBtn.click();
    }

    public void checkInputAmountDep() throws InterruptedException {
        Thread.sleep(3000);
        if (amountLabel.getText().equalsIgnoreCase("Deposit Successful")){
            System.out.println("Test Input Deposit Pass!");
        }
        else {
            System.out.println("Test Input Deposit Fail!");
        }
    }
}
