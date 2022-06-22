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

}
