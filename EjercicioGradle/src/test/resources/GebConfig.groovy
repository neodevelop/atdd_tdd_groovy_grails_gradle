import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import com.gargoylesoftware.htmlunit.BrowserVersion

waiting {
  timeout = 20
}

environments {

  htmlunit{
    driver = {
      def driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6)
      driver.javascriptEnabled = true
      driver
    }
  }

  // run via “./gradlew chromeTest”
  // See: http://code.google.com/p/selenium/wiki/ChromeDriver
  chrome {
    driver = { new ChromeDriver() }
  }

  // run via “./gradlew firefoxTest”
  // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
  firefox {
    driver = { new FirefoxDriver() }
  }

}

// To run the tests with all browsers just run “./gradlew test”