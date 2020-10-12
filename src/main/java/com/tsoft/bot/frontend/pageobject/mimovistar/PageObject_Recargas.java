package com.tsoft.bot.frontend.pageobject.mimovistar;

import org.openqa.selenium.By;


public class PageObject_Recargas {

    public static By TXT_NUMERO_MOVISTAR                = By.id("input_celular"); //id
    public static By TXT_MONTO                          = By.id("input_monto"); //id
    public static By BTN_CONTINUAR                      = By.id("button_recargar"); //id
    public static By BTN_FINAL                          = By.xpath("/html/body/app-root/app-confirm/div/div/div[2]/button");
    public static By TXT_CORREO2                        = By.id("mat-input-0");
    public static By BTN_CONTINUAR22                    = By.xpath("/html/body/app-root/app-checkout/div/div[2]/button");
    public static By TXT_NUM_TARJETA                    = By.id("cardNumber");
    public static By TXT_CVV2                           = By.id("csc");
    public static By BTN_PAGAR2                         = By.id("bConfirmPaymentButton");
    public static By BTN_PAGAR3                         = By.id("button margin-v");
    public static By CHCKB_GUARDAR_TARJETA              = By.xpath("/html/body/div/div/div[3]/form/div/div/div[19]/div/div[1]/span/input");
    public static By LBL_CODIGO_E                       = By.xpath("/html/body/app-root/app-confirmation/div/div[1]/div[6]/span");
    public static By LBL_CODIGO_C                       = By.xpath("/html/body/app-root/app-confirm/div/div/div[1]/div[6]/p[2]");
    public static By LBL_MONTO_5                        = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[1]/div");
    public static By LBL_MONTO_7                        = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[2]/div");
    public static By LBL_MONTO_10                       = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[3]/div");
    public static By LBL_MONTO_15                       = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[4]/div");
    public static By LBL_MONTO_20                       = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[5]/div");
    public static By LBL_MONTO_30                       = By.xpath("/html/body/app-root/app-recarga-home/div/div[3]/div/div[6]/div");
}
