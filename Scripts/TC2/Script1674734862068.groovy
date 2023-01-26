import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")
WebUI.setViewPortSize(800,600)
WebDriver driver = DriverFactory.getWebDriver()
driver.manage().window().setPosition(new Point(200,100))

WebUI.navigateToUrl("https://abcnews.go.com/")

WebUI.delay(5)
WebUI.closeBrowser()

