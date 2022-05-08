package lesson11_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    void loginError(){
        System.setProperty("geckodriver", "C:\\Users\\anduser\\IdeaProjects\\Andersen_AQA_lesson11\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru/user/registration");

        WebElement loginField = driver.findElement(By.id("signupform-username"));
        loginField.sendKeys("123");
        WebElement passwordField = driver.findElement(By.id("signupform-email"));
        passwordField.sendKeys("123@123.com");
        WebElement signButton = driver.findElement(By.id("signup_btn"));
        signButton.click();
        WebElement loginMessage = driver.findElement(By.xpath("//*[@id=\"registration_form\"]/div[1]/p"));
        if (loginMessage.isDisplayed()){
            System.out.println("Pass");
        }
    }
}
