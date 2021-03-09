package Task2;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_1.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.istqb.org/");
        driver.findElement(By.id("mod-search-searchword")).sendKeys("Foundation Level 2018");
        driver.findElement(By.id("mod-search-searchword")).sendKeys(Keys.RETURN); //Клавиша Enter
        driver.findElement(By.className("search-results")); //Проверка того, что результат не пустой
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Decline"))).click();// мешает окно куки, решил убрать
        driver.findElement(By.linkText("Foundation Level Automotive Software Tester")).click();
        Assert.assertEquals
                ("Foundation Level Automotive Software Tester - ISTQB® International Software Testing Qualifications Board"
                        , driver.getTitle()); //Проверка на то, что перешли на нужную страницу
        driver.quit();
                            }


                        }


