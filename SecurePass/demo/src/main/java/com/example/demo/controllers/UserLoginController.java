package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest request) {
        String url = request.getUsername();

        String url1 = "http://www.garage-pirenne.be/index.php?option=com_content&view=article&id=70&vsig70_0=15";
        String url2 = "signin.eby.de.zukruygxctzmmqi.civpro.co.za";
        String url3 = "http://www.marketingbyinternet.com/mo/e56508df639f6ce7d55c81ee3fcd5ba8/";
        String url4 = "http://www.sandroecicero.com.br/index.php?option=com_content&view=article&id=1&Itemid=3&vsig1_0=18";
        String url5 = "appieid-enable.com";
        String url6 = "http://apoiojur.com.br/index.php?%2FNoticias%2Fnoticias.html";
        String url7 = "myptccash.com";
        String url8 = "http://www.musimagen.com/lista_socios.php?pagina=15&letra=";
        String url9 = "http://www.trenker-bestattungen.de/index.php?option=com_content&view=article&id=13&Itemid=14";
        String url10 = "retajconsultancy.com";
        String url11 = "signin.eby.de.zukruygxctzmmqi.civpro.co.za";
        String url12 = "http://www.lebensmittel-ueberwachung.de/index.php/aktuelles.1";
        String url13 = "http://www.manganellipalace.it/de/willkommen-bei.html";
        String url14 = "muhanovabeauty.ru";
        String url15 = "http://www.expatsalon.ru/index.php/2009-03-04-07-22-09/category/7-.html?start=20";
        String url16 = "http://sexshop-bg.biz/products?page=shop.browse&category_id=276";
        String url17 = "http://www.school91.kiev.ua/index.php?option=com_content&view=category&layout=blog&id=38&Itemid=57";
        String url18 = "http://www.nubiafarias.com/v1/index.php?option=com_mailto&tmpl=component&link=b9f337d1ca40d09a113ab5ae6426a96e642fb2af";
        String url19 = "info-pages.000webhostapp.com";
        String url20 = "http://www.besztercekk.hu/index.php?option=com_lr&view=stadium&id=1&Itemid=162";

        if (url.equals(url1)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url2)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url3)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url4)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url5)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url6)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url7)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url7)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url8)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url9)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url10)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url11)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url12)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url13)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url14)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url15)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url16)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url17)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url18)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url19)) {
            return "Malicious URL Detected!!!";
        } else if (url.equals(url20)) {
            return "Malicious URL Detected!!!";
        } else {
            return "Malicious URL not detected!! You are Safe!!!";
        }
    }
}

class UserLoginRequest {
    private String url;

    // Getters and setters
    public String geturl() {
        return url;
    }

    public void setUsername(String url) {
        this.url = username;
    }

}
