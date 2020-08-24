package main.com.singtel.atwo.b;

import java.util.HashMap;
import main.com.singtel.atwo.b.Animal.Gender;


public class SolutionTestDiffLangSound {

    public static void main(String[] args) {
        Chicken c = new Chicken();
        //c.setGender(Gender.M);
        c.setGender(Gender.M);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Myanmar", "Katu katu Katu");
        Chicken.languageTranslator = map;

        System.out.println("Native language is Myanmar");
        c.singInNativeTongue("Myanmar");
    }
}
