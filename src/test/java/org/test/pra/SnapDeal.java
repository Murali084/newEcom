package org.test.pra;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDeal extends Basecls {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		launchbrowser();
		openurl("https://www.snapdeal.com/");
		Pojo p = new Pojo();
		WebElement a = driver.findElement(By.xpath("//div[@class='accountInner']"));
		act(a);
		clk(p.getLog());
		Thread.sleep(2000);
		frm(0);
		fil(p.getLog1(), data(1, 1));
		clk(p.getBtn1());
		Thread.sleep(2000);
		fil(p.getLog2(), data(1, 2));
		clk(p.getBtn2());
		Thread.sleep(2000);
		fil(p.getSrch(), "Mobiles");
		clk(p.getSrch2());
		clk(p.getPhn());
		wind(1);
		clk(p.getBtn3());
		screen();
	
	}

}

