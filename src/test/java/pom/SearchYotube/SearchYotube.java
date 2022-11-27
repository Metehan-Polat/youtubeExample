package pom.SearchYotube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pom.js.JScr;

public class SearchYotube {

    JScr jScr=new JScr();
    public void searchClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//input[@id='search']")).click();
    }
    public void searchWrite(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='search']"));
        element.sendKeys("most watched video in the search");
    }
    public void enter(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    }
    public void firstVideoClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
    }
    public void firstcommentlook(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//div[@id='header-author']"));
        jScr.jsScrollElement(driver,element);

    }
}
