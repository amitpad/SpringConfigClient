package com.equifax.configserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

  @Value("${lucky-word:Ganesha}") String luckyWord;

  @RequestMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: "; //+ luckyWord;
  }
}
