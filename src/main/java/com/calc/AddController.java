package com.calc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam(value = "add", required = false) String add,
                                  @RequestParam(value = "subtract", required = false) String subtract,@RequestParam(value = "multiple", required = false) String multiple,@RequestParam(value = "division", required = false) String division) {
        ModelAndView modelAndView = new ModelAndView("calculatorResult");
        
        if (add != null) {
            int sum = num1 + num2;
            modelAndView.addObject("result", "Sum: " + sum);
        } else if (subtract != null) {
            int difference = num1 - num2;
            modelAndView.addObject("result", "Difference: " + difference);
        } else if (multiple != null) {
            int mul = num1 * num2;
            modelAndView.addObject("result", "Multiple: " + mul);
        } else if (division != null) {
            int div = num1 / num2;
            modelAndView.addObject("result", "Division: " + div);
        }
        
        return modelAndView;
    }
}

