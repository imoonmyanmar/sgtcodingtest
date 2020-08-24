package main.com.singtel.atwo.b;

import java.util.HashMap;

public class Chicken extends Bird {

    Chicken ()
    {
        this.gender=Gender.F;
    }

    public static HashMap<String, String> languageTranslator = new HashMap<String, String>();

    public void setLanguageTranslator(HashMap<String, String> t){
        Chicken.languageTranslator = t;
    }

    public void singInNativeTongue(String Language){

        if(this.gender.equals(Gender.M))
            System.out.println(languageTranslator.get(Language));
        else
           System.out.println("Cluck, cluck");

    }

    @Override
    public void sing() {
        if(this.gender.equals(Gender.M))
            System.out.println("Cock-a-doodle-doo");
        else
            System.out.println("Cluck, cluck");
    }
}
