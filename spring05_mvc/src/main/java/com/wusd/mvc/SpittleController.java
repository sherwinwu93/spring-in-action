package com.wusd.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String spittles(Model model) {
        //将spittle添加到模型中
        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        //返回视图名
        return "spittles";
    }

    @RequestMapping(value = "/spittlesWithQueryParams", method = RequestMethod.GET)
    public List<Spittle> spittlesWithQueryParams(
            @RequestParam(value = "max", defaultValue = "0x7fffffffffffffffL") long max,
            @RequestParam("count") int count
    ) {
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping("/spittle/{id}")
    public String spittle(@PathVariable("id") long id,
                           Model model) {
        model.addAttribute("spittle", spittleRepository.findOne(id));
        return "spittle";
    }
}
