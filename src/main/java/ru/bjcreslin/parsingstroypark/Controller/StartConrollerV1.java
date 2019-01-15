package Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.bjcreslin.parsingstroypark.model.Product;

import java.awt.*;

@RestController
@RequestMapping("/command/")
public class StartConrollerV1 {


    @RequestMapping(value = "",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String>getRun(){
       return new ResponseEntity("Hello");
    }
}
