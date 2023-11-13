package Package_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_1 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.printf(title,url);
		FileInputStream fi = new FileInputStream("C:\\Users\\geram\\OneDrive\\Documents\\Book1.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet page = wb.getSheet("Sheet1");
		Row row = page.getRow(1);
		Cell cell = row.getCell(0);
		String uname = cell.getStringCellValue();
		Cell cell1 = row.getCell(1);
		String pword = cell1.getStringCellValue();
		
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("pass");
		CellStyle style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.index);
		cell2.setCellStyle(style);
		FileOutputStream fo = new FileOutputStream("C:\\\\Users\\\\geram\\\\OneDrive\\\\Documents\\\\Book1.xlsx");
		wb.write(fo);
		wb.close();
		
	}
	

}
