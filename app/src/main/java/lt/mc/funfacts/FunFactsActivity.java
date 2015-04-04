package lt.mc.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Nustatome variables (TextView)- tai kintamojo tipas
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById((R.id.relativeLayout));
        //onClickListener sukuria nauja objektą. View prieš reiškia kintamojo tipą. Ojektas sukuria naują metodą.
        View.OnClickListener listener = new View.OnClickListener() {
            // Šis kodas pasileis tik tuomet kai gaus žinią kad kažkas paspaudė mygtuką.
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);
            }
        };
        // mygtukas + funkcija kuri kazka daro
        showFactButton.setOnClickListener(listener);

        /*
        //iššokanti žinutė, čia yra pilnas variantas
        String message = "Yay, our activity was created";
        Toast welcomeToast = Toast.makeText(this,message, Toast.LENGTH_LONG);
        welcomeToast.show(); */

       // padarytas refactoring'as, čia yra trumpesnis aprašymas.
        Toast.makeText(this,getString(R.string.minde_sukure), Toast.LENGTH_LONG).show();

        Log.d(TAG,"Debuginu programą, kad pasižiūrėti, kaip vyksta procesai, šiuo atveju, reiškia kad FunFacts activity pasileido");
    }



}
