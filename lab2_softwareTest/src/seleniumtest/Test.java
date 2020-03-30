package seleniumtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String...strings) throws IOException{
		//1. ����FireFox���������
		String driverPath = System.getProperty("user.dir") + "/src/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		
		//2������Ҫ���ʵ���ַ
        String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";				
        
        //3�����ʸ�������ַ
        driver.get(baseUrl);        
        
        //4.����
        InputStream s = new FileInputStream(System.getProperty("user.dir")+"/Selenium+Lab2020.xlsx");
		Workbook wb = new XSSFWorkbook(s);
		Sheet sheet = wb.getSheetAt(0);       
		int all = 0;
		int pass = 0;		
		for (Row row : sheet) {
            String username = row.getCell(1).toString();
            String password = row.getCell(2).toString();            
            if(username == null || username == "") 
            	break;
            driver.findElement(By.name("user_number")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input")).click();
    		String Error = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[4]/code")).getText();
    		all = all + 1;
    		if(Error.equals("")) 
    			pass = pass + 1;
    		else {
    			System.out.println("the password of " + username + " is wrong");
    		}
        }		
		if(all==pass)
			System.out.println("All match!");
		else
			System.out.println("There are " + (all-pass) + " mismatches!");		
		
		//5.�ر�����
		//driver.close();
     
        
    }
	
}
