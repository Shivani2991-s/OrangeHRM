package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase_O {
	public static WebDriver driver;
	
	public static Properties prop;
	//create constructor to read file in any class
	public TestBase_O(){
		try {
			//create object to read data from file
			FileInputStream inp = new FileInputStream("E:\\btes\\java\\Assignments\\Orange_Maven\\Orange\\src\\test\\java\\Configuration\\configHRM.properties");
			//create and initialize properties class object to load file
			prop = new Properties();
			//then load properties file in memory
			
				prop.load(inp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
	}
	public static void termination() {
		
	}
}
