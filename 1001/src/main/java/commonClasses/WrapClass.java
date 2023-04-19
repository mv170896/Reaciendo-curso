package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {

	// poner donde se hara el click, en este caso sera un WebElement de nombre webE,
	// luego declaramos la accion en webE
	public static void click(WebElement webE) {
		webE.click();
	}

	// Podemos repetir webE ya que es local para cada metodo, en este caso se
	// declara el web element y el tipo de dato que necesitara el metodo
	public static void sendKeys(WebElement webE, String textTosend) {
		webE.sendKeys(textTosend);
	}

	// Este no es void porque queremos que nos retorne un string
	public static String getText(WebElement webE) {
		return webE.getText();
	}

	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		// Toma pantallazo
		File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

		// Establecer la ruta donde se fuarda el screenshot / CurrentTimeMillis agrega
		// los milisegundos a la hora de ejecutar el caso
		// sirve para evitar que se sobreextriban los pantallazos pero puede que
		// tengamos muchas carpetas
		String screenshotPath = "./test-output/ExecutionResults" + System.currentTimeMillis();

		// Crear directorio en caso que no exista "ExecutionResults"
		FileHandler.createDir(new File(screenshotPath));
		// Es necesario ingresar un Try/Catch para que el programa intente ingresar el
		// archovo donde se solicito y en caso contrario de una excepcion
		try {
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getJsonValue(String jsonFileObj, String jsonKey) {

		try {
			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.DATA_PATH + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = jsonObject.getJSONObject(jsonFileObj).getString(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String getCellData(String excelName, int row, int column) {
		// Reading Data
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.DATA_PATH + excelName + ".xlsx");

			// Construir un objeto de excel
			try {
				Workbook wb = new XSSFWorkbook(fis);
				//importar el ss en Sheet 
				Sheet sheet = wb.getSheetAt(0);
				Row rowObj = sheet.getRow(row);
				Cell cell = rowObj.getCell(column);
				String value = cell.getStringCellValue();
				return value;
						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
	}
}
