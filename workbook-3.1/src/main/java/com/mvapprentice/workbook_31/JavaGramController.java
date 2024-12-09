package com.mvapprentice.workbook_31;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JavaGramController {

  List<User> users = new ArrayList<User>();

  @GetMapping("/")
  public String getForm(Model model) {
    model.addAttribute("formUser", new User());
    return "sign-up";
  }

  @GetMapping("/result")
  public String getResult() {
    return "result";
  }

  @PostMapping("/submitItem")
  public String handleSubmit(@Valid User user, BindingResult result) {
    if(result.hasErrors()) {
      return "sign-up";
    }
    return "redirect:/result";
  }
}
