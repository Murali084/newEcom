package org.test.pra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basecls {


	static WebDriver driver;

	public static void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Projects\\SampleEcom\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void openurl(String url) {
		driver.get(url);

	}

	public static void fil(WebElement loc, String val) {
		loc.sendKeys(val);
	

	}
	public static void screen () throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Selenium\\Projects\\SampleEcom\\Screen\\iphone 7.png");
		FileUtils.copyFile(src, des);
	}
	public static void wind (int num) {
		
		driver.getWindowHandle();
		Set<String> alwin=driver.getWindowHandles();
		List<String>list=new ArrayList<>();
		list.addAll(alwin);
		driver.switchTo().window(list.get(num));
	}
	public static void gt() {

		driver.getTitle();
	}
		
	public static void clk(WebElement loc) {
		loc.click();
	}
	
	public static String data(int rowno, int colno) throws IOException {
		
		String value = null;
		File loc = new File("E:\\Selenium\\Projects\\SampleEcom\\TestData\\sample.xlsx");
		FileInputStream fs = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fs);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(rowno);
		Cell c =r.getCell(colno);
		int type = c.getCellType();
	    
	    if(type==1)
	    {
	    	value=c.getStringCellValue();
	    }
		return value;
	    

	    }
	
		
	public static void act (WebElement a) {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(a).perform();
		
	}
	
	public static void frm(int index) {
		driver.switchTo().frame(index);
	}
	public static void closebrow() {
		driver.close();
	}
	
	
}

