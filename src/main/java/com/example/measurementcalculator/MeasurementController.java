package com.example.measurementcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeasurementController {

    private Calculator calc = new Calculator();

    @RequestMapping("/gram")
    public double ounceToGram(
            @RequestParam double ounce
    ) {
        return calc.ounce(ounce);
    }

    @RequestMapping("/kilogram")
    public double stoneToKilogram(
            @RequestParam double stone
    ) {
        return calc.stone(stone);
    }

    @RequestMapping("/")
    public String start() {
        return "Welcome to the Measurement Calculator!" + "<br>" +
                "This service converts imperial values to metric ones. " + "<br>" + "<br>" +
                "The following options are available:" + "<br>" +
                "/gram?ounce=X -> To convert X ounces in gram" + "<br>" +
                "/kilogram?stone=X -> To convert X stones in kilogram";
    }

}
