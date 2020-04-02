package L.L.L;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
    public static void main(String[] args) throws InterruptedException {
        //instanciar un objeto WebDriver
        WebDriver driver;

        //Declarar variable
        String baseURL = "http://www.ebay.com";
        //Initial the location of the chromedriver.exe file in the webdriver.chrome.driver property
        //Inicial la locaclizacion del archivo chromedriver.exe en la propiedad webdriver.chrome.driver
        //System.getProperty("user.dir") = C:\..\..\..\Test-1
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        // open browser + Maximize the screen
        //abrir navegador + Maximiza la pantalla
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

        // Click in the search engine + write batteries
        //Click en el buscador + escribir pilas
        driver.findElement(By.id("gh-ac")).sendKeys("Pilas");

        //Sleep
        Thread.sleep(1500);

        // Click search button
        //Click boton buscar
        driver.findElement(By.id("gh-btn")).click();


        // Search by container ID and save the data in the element variable
        //Buscar por ID el contenedor y guardar el dato en la variable element
        WebElement element = driver.findElement(By.id("srp-river-results-SEARCH_PAGINATION_MODEL_V2-w2-button"));
        String text = element.getText();

        // Print the number of items
        //Imprime el numero de items
        System.out.println("Número de ítem: " + text);


         // close the browser
        //cerrar el navegador
        driver.close();





    }

}
