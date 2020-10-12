package com.tsoft.bot.frontend.steps.mimovistar;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pageobject.mimovistar.PageObject_Recargas.*;
import static org.openqa.selenium.By.*;

public class MiMovistar_Recargas {

    private static final String EXCEL_WEB = "excel/MiMovistar_Recargas.xlsx";
    private static final String RECARGAS_WEB = "Recargas";
    private static final String COLUMNA_URL = "URL";
    private static final String COLUMNA_TELEFONO = "TELEFONO";
    private static final String COLUMNA_MONTO = "MONTO";
    private static final String COLUMNA_CORREO = "CORREO";
    private static final String COLUMNA_NUMTARJETA = "NUM_TARJETA";
    private static final String COLUMNA_FV_MES = "FV_MES";
    private static final String COLUMNA_FV_ANIO = "FV_ANIO";
    private static final String COLUMNA_COD_CVV = "COD_CVV";
    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public MiMovistar_Recargas() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, RECARGAS_WEB);
    }

    @Given("^se ingresa en la URL el token generado \"([^\"]*)\"$")
    public void seIngresaEnLaURLElTokenGenerado(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String url = getData().get(recargas).get(COLUMNA_URL);
            driver.get(url);
            Sleeper.Sleep(3500);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página Mi Movistar con el token");
            generateWord.sendText("Se inició correctamente la página Mi Movistar con el token");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se ingresa el numero celular \"([^\"]*)\"$")
    public void seIngresaElNumeroCelular(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            driver.findElement(TXT_NUMERO_MOVISTAR).clear();
            String telefono = getData().get(recargas).get(COLUMNA_TELEFONO);
            driver.findElement(TXT_NUMERO_MOVISTAR).sendKeys(telefono);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó el telefono : " + telefono);
           // generateWord.sendText("Se ingresó el telefono :" + telefono);
           // generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }

    }

    @And("^monto a recargar \"([^\"]*)\"$")
    public void montoARecargar(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            driver.findElement(TXT_MONTO).clear();
            String monto = getData().get(recargas).get(COLUMNA_MONTO);
            driver.findElement(TXT_MONTO).sendKeys(monto);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó el monto en soles : " + monto);
            //generateWord.sendText("Se ingresó el monto en soles: " + monto);
            //generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }

    }



    @And("^se da click en el boton Continuar$")
    public void seDaClickEnElBotonContinuar() throws Throwable {
        try {

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic en el botón Continuar");
            generateWord.sendText("Se dió clic en el botón Continuar ");
            generateWord.addImageToWord(driver);
            driver.findElement(BTN_CONTINUAR).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }


    @When("^se ingresa el email \"([^\"]*)\" y se da click en continuar$")
    public void seIngresaElEmailYSeDaClickEnContinuar(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String correo = getData().get(recargas).get(COLUMNA_CORREO);
            Thread.sleep(8000);
            driver.switchTo().frame(0);
            driver.findElement(TXT_CORREO2).clear();
            driver.findElement(TXT_CORREO2).sendKeys(correo);

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa el correo: " + correo + "Se da clic en continuar");
            generateWord.sendText("Se ingresa el correo: " + correo + "Se da clic en continuar");
            generateWord.addImageToWord(driver);
            //ExtentReportUtil.INSTANCE.stepPass(driver, "Se dió clic en el botón Contiuar2");
            //generateWord.sendText("Se dió clic en el botón Continuar 2");
            //generateWord.addImageToWord(driver);
            driver.findElement(BTN_CONTINUAR22).click();
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }

    }

    @And("^se ingresa el numero de tarjeta \"([^\"]*)\"$")
    public void seIngresaElNumeroDeTarjeta(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String tarjeta = getData().get(recargas).get(COLUMNA_NUMTARJETA);
            Thread.sleep(15000);
            driver.switchTo().frame(0);
            driver.findElement(TXT_NUM_TARJETA).sendKeys(tarjeta);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó la tarjeta de crédito : "+tarjeta);
            generateWord.sendText("Se ingresó la tarjeta de crédito : 4919148107859067");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se ingresa el mes de vencimiento \"([^\"]*)\"$")
    public void seIngresaElMesDeVencimiento(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String mes = getData().get(recargas).get(COLUMNA_FV_MES);
            Select select = new Select(driver.findElement(By.id("expiryDateMonthInput")));
            select.selectByValue(mes);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó el mes: "+mes);
           // generateWord.sendText("Se ingresó el mes : 03");
            //generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se ingresa el anio de vencimiento \"([^\"]*)\"$")
    public void seIngresaElAnioDeVencimiento(String casoDePrueba) throws Throwable {
        try {
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String anio = getData().get(recargas).get(COLUMNA_FV_ANIO);
            Select select = new Select(driver.findElement(By.id("expiryDateYearInput")));
            select.selectByVisibleText(anio);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó el año: "+anio);
            //generateWord.sendText("Se ingresó el año: 2020");
            //generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se ingresa el codigo de verificacion \"([^\"]*)\"$")
    public void seIngresaElCodigoDeVerificacion(String casoDePrueba) throws Throwable {
        try{
            int recargas = Integer.parseInt(casoDePrueba) - 1;
            String cvv = getData().get(recargas).get(COLUMNA_COD_CVV);
            driver.findElement(TXT_CVV2).sendKeys(cvv);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó EL CÓDIGO CVV: "+cvv);
            //generateWord.sendText("Se ingresó EL CÓDIGO CVV: " + cvv);
            //generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se selecciona la opción guardar tarjeta \"([^\"]*)\"$")
    public void seSeleccionaLaOpciónGuardarTarjeta(String arg0) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona la opción guardar tarjeta");
            generateWord.sendText("Se selecciona la opción guardar tarjeta" );
            generateWord.addImageToWord(driver);
            driver.findElement(CHCKB_GUARDAR_TARJETA).click();
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }

    @And("^se da click en el boton Pagar$")
    public void seDaClickEnElBotonPagar() throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresaron los datos de la tarjeta, se da clic en pagar");
            generateWord.sendText("Se realizara la recarga con los datos de la tarjeta completos " );
            generateWord.addImageToWord(driver);
            driver.findElement(BTN_PAGAR2).click();
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }
    @And("^se selecciona la opción pagar con tarjeta guardada \"([^\"]*)\"$")
    public void seSeleccionaLaOpciónPagarConTarjetaGuardada(String arg0) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona pagar con tarjeta guardada");
            generateWord.sendText("Se selecciona pagar con tarjeta guardada" );
            generateWord.addImageToWord(driver);
            driver.findElement(BTN_PAGAR3).click();
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);


    }
}
    @Then("^se verifica que se hizo la recarga correcta\\.$")
    public void seVerificaQueSeHizoLaRecargaCorrecta() throws Exception {
            Thread.sleep(20000);
            try{
                String codigo2 = driver.findElement(LBL_CODIGO_C).getText();
                ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "PASS");
                ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, codigo2);
                ExtentReportUtil.INSTANCE.stepWarning(driver, "Verificar Imagen Flujo");
                ExtentReportUtil.INSTANCE.stepWarning(driver, "Se extrae los siguientes datos: "+codigo2);
                generateWord.sendText("Finalizo la recarga correctamente con el ID de Pedido: " + codigo2);
                generateWord.addImageToWord(driver);
                driver.findElement(BTN_FINAL).click();
            }catch(Exception e){
                 String codigo1 = driver.findElement(LBL_CODIGO_C).getText();
                 ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "PASS");
                ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 10, codigo1);
                 ExtentReportUtil.INSTANCE.stepWarning(driver, "Verificar Imagen Flujo");
                 ExtentReportUtil.INSTANCE.stepWarning(driver, "Se extrae los siguientes datos: "+codigo1);
                 generateWord.sendText("Recarga Fallida, Id Generado es: " + codigo1);
                 generateWord.addImageToWord(driver);
                 driver.findElement(BTN_FINAL).click();
            }

    }

    @Given("^se genera la URL mediante el API_TEST_recargas$")
    public void seGeneraLaURLMedianteElAPI_TEST_recargas() {
        CallerJSON_MiMovistarRecarga.API_API_TEST_recargas();
    }

    @And("^se selecciona la opcion de S/(\\d+)$")
    public void seSeleccionaLaOpcionDeS(int arg0) throws Exception {
        try {
            driver.findElement(LBL_MONTO_5).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se seleccionó el monto en soles : S/5");
            generateWord.sendText("Se ingresó el monto en soles: S/5 ");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, RECARGAS_WEB, 1, 9, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }
}


