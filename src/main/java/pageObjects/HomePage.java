package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase{
    @FindBy(xpath="//*[@id='menu-item-126']")
    WebElement logOutButton;

    @FindBy(xpath="//*[@class='search-field']")
    WebElement searchBar;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getLogOutButtonText() {
       return logOutButton.getText();
    }



}
