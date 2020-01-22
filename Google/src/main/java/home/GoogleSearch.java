package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleSearch extends CommonAPI {

    public void search(String keyword) {
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(keyword);
        driver.findElement(By.name("btnK")).click();


    }


}
