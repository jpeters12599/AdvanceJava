package edu.wgu.d387_sample_code;

import java.util.Locale;
import java.util.ResourceBundle;

public class Welcome implements Runnable{
    Locale locale;
    public Welcome(Locale locale) {
        this.locale = locale;
    }
    public String getWelcome() {
        ResourceBundle bundle = ResourceBundle.getBundle("Welcome", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {

    }
}


