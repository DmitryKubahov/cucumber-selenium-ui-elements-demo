package de.kubakhov.ui.demo.config;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;

import java.time.Duration;

@Configuration
public class CommonConfiguration {

    @Bean
    @ScenarioScope(proxyMode = ScopedProxyMode.NO)
    public WebDriver webDriver() {
        final var chromeDriver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://blocks.primeng.org/#/application/signin");
        return chromeDriver;
    }


    @Bean
    @ScenarioScope(proxyMode = ScopedProxyMode.NO)
    public WebDriverWait webDriverWait(final WebDriver webDriver) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }
}
