package com.pitang.StepDefinitions;

import io.cucumber.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreStepsDefs {

    @Dado("ˆque carrego a pagina da Book Store")
    public void carregarBookStore() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
        Asserttru



    }
}
