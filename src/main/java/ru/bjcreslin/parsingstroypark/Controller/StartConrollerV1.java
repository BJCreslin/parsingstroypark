package ru.bjcreslin.parsingstroypark.Controller;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/command/")
public class StartConrollerV1 {


    @RequestMapping(value = "",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @SneakyThrows
    public ResponseEntity<String>getRun(){
    String adress="https://stroypark.su/catalog/injenernyie-sistemyi-i-oborudovanie/sistemyi-vodosnabjeniya-i-kanalizatsii/nasosnoe-oborudovanie";

        Document document;

        document=Jsoup.connect(adress).
                userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36").
                get();

        String textOUT=document.title();

       return new ResponseEntity(textOUT, HttpStatus.OK);
    }
}
