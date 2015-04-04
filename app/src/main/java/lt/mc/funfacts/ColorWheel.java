package lt.mc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by MC on 2015.03.22.
 */
public class ColorWheel {

    //Member variables
    public String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
             };
    //Method (things, abilities that the object can do)
    public int getColor() {


        // mygtukas buvo paspaustas, vadinasi dabar reikia updatinti factLabel nauja reikšme
        String color ="";
        // randomly select the fact
        Random randomGenerator = new Random(); // Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mColor.length); // 3 - reiškia kad bus galima rinktis tik iš trijų

        /*fact = randomNumber +"";// +"" - reiškia kad prie skaičiaus pridedam String ir jis automatiškai tampa ne int o String*/
        //Update the label with the dynamic fact
        color = mColor[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }
}
