package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Display UI (R = resources class )
    }

    public void displayName(View v){   //View(class) - refers to any UI components
        TextView textViewName;
        EditText et;
        EditText et2;
        //Link UI to variable
        textViewName = (TextView)findViewById(R.id.tv);   //Link tv to textViewName
        et = (EditText)findViewById(R.id.editTextName);
        et2 = (EditText)findViewById(R.id.editTextAge);
        int age = Integer.parseInt(et2.getText().toString());
        textViewName.setText(getString(R.string.greeting) + " " + et.getText() + getString(R.string.greeting2)+ " " + (age+1) + " " + getString(R.string.greeting3));
    }


}
