package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

 
        String filePath = "screenshots/" + testName + "_" + timestamp + ".png";

        try {
            
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            
            File destFile = new File(filePath);
            destFile.getParentFile().mkdirs();

            
            FileHandler.copy(src, destFile);

            System.out.println("Screenshot saved at: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath; 
    }
}