package br.com.hallucinations.controllers;

import br.com.hallucinations.math.SimpleMath;
import br.com.hallucinations.converters.NumberConverter;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private static final AtomicLong counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a valid number");
        }
        return math.sum(NumberConverter.convertToDouble(numberOne)
                ,NumberConverter.convertToDouble(numberTwo));
        }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                  @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a valid number");
        }
        return math.subtraction(NumberConverter.convertToDouble(numberOne)
            ,NumberConverter.convertToDouble(numberTwo));
        }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a valid number");
        }
        return math.multiplication(NumberConverter.convertToDouble(numberOne)
                ,NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a valid number");
        }
        return math.division(NumberConverter.convertToDouble(numberOne)
                ,NumberConverter.convertToDouble(numberTwo));
    }
}



