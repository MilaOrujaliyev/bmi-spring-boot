package com.baskent.edu.tr.dbhw.controller;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResultView;
import com.baskent.edu.tr.dbhw.service.BmiEntryResultViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BmiEntryResultViewController {


    private  final BmiEntryResultViewService service;

    @Autowired
    public BmiEntryResultViewController(BmiEntryResultViewService service) {
        this.service = service;
    }

    @GetMapping("/bmiResults")
    public String showBmiResults(Model model) {
        List<BmiEntryResultView> bmiResults = service.getAllBmiEntryResults();
        model.addAttribute("bmiResults", bmiResults);
        return "bmi_results";
    }

}
