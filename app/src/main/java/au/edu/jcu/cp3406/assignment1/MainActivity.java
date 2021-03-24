package au.edu.jcu.cp3406.assignment1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://developer.android.com/guide/topics/ui/controls/spinner
        // Where i took/learned the code for the Spinner
        Spinner fromSpinner = (Spinner) findViewById(R.id.convert_from);
        Spinner toSpinner = (Spinner) findViewById(R.id.convert_to);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.units, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
    }
    //Getting the Button to work and to use the math we made in Converter.java
    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromText, toText;

        fromSpinner = (Spinner) findViewById(R.id.convert_from);
        toSpinner = (Spinner) findViewById(R.id.convert_to);
        fromText = (EditText) findViewById(R.id.text_From);
        toText = (EditText) findViewById(R.id.text_To);


        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.parseDouble(fromText.getText().toString());

//        *THIS IS NOT RELEVANT, JUST PLAYING WITH IT*
//        Weight fromUnit = Converter.Unit.fromString(fromString);
//        Weight toUnit = Converter.Unit.fromString(toString);
//
//
//        Converter converter = new Converter(fromUnit, toUnit);
//        double result = converter.convert(input);
//        toEditText.setText(String.valueOf(result));
    }
}