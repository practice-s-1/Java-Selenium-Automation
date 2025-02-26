package pageObjectTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import utils.TestBase;

import java.util.logging.Logger;

public class SearchBarTests extends TestBase {

    static Logger log = Logger.getLogger(String.valueOf(SearchBarTests.class));

    @Test
    public void SearchBarDefaultValue(){
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/");

        WebElement searchBar = driver.findElement(By.xpath("//*[@class='search-field']"));

        log.info("Asserting that the default value is 'Search …'");
        String searchBarValue = searchBar.getAttribute("placeholder");

        Assert.assertEquals("The default value is not correct","Search …", searchBarValue );

    }




}
