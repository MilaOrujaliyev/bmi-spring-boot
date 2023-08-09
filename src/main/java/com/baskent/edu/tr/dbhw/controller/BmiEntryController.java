package com.baskent.edu.tr.dbhw.controller;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResult;
import com.baskent.edu.tr.dbhw.entity.User;
import com.baskent.edu.tr.dbhw.exception.UserNotFoundException;
import com.baskent.edu.tr.dbhw.service.BmiEntryResultService;
import com.baskent.edu.tr.dbhw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/bmiEntry")
public class BmiEntryController {

    private final BmiEntryResultService bmiEntryResultService;

    @Autowired
    private UserService userService;

    public BmiEntryController(BmiEntryResultService bmiEntryResultService) {
        this.bmiEntryResultService = bmiEntryResultService;
    }

    @GetMapping("/form")
    public String showBmiEntryForm(Model model) {
        model.addAttribute("bmiEntryResult", new BmiEntryResult());
        return "bmi_entry";
    }

    @PostMapping("/save")
    public String saveBmiEntry(@ModelAttribute("bmiEntryResult") BmiEntryResult bmiEntryResult) {
        bmiEntryResult.setCreateDate(new Date());
        bmiEntryResultService.saveBmiEntryResult(bmiEntryResult);
        return "redirect:/bmiEntry/success";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "bmi_entry_success";
    }

    @GetMapping("/bmiEntry")
    public String showBmiEntryForm(@RequestParam("userId") int userId, Model model) throws UserNotFoundException {
        // Kullanıcıyı veri tabanından alın
        User user = userService.getUserById(userId);

        // Model'e kullanıcıyı ekleyin
        model.addAttribute("user", user);

        return "bmi_entry";
    }

}
