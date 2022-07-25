package ru.liga.translator.service;

import org.springframework.stereotype.Service;

import static ru.liga.translator.constant.RulesMap.I_RULE;
import static ru.liga.translator.constant.RulesMap.ER_RULE;
import static ru.liga.translator.constant.RulesMap.FITA_RULE;
import static ru.liga.translator.constant.RulesMap.YAT_RULE;

@Service
public class TranslateService {

    public String translate(String text) {
        final String[] result = {text};
        I_RULE.keySet().forEach((key) -> result[0] = result[0].replaceAll(key, I_RULE.get(key)));
        ER_RULE.keySet().forEach((key) -> result[0] = result[0].replaceAll(key, ER_RULE.get(key)));
        FITA_RULE.keySet().forEach((key) -> result[0] = result[0].replaceAll(key, FITA_RULE.get(key)));
        YAT_RULE.keySet().forEach((key) -> result[0] = result[0].replaceAll(key, YAT_RULE.get(key)));

        return result[0];
    }
}
