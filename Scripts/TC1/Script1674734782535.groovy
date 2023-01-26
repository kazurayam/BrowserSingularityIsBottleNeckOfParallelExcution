import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")
WebUI.setViewPortSize(800,600)
WebDriver driver = DriverFactory.getWebDriver()
driver.manage().window().setPosition(new Point(0,0))

WebUI.navigateToUrl("https://www.yahoo.co.jp/")

WebUI.delay(5)
WebUI.closeBrowser()
