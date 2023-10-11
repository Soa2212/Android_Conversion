package com.example.android_conversion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.android_conversion.models.Celsius;
import com.example.android_conversion.models.Farenheit;
import com.example.android_conversion.models.Kelvin;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero = findViewById(R.id.editTextNumero);
        TextView botonC = findViewById(R.id.C);
        TextView botonK = findViewById(R.id.K);
        TextView botonF = findViewById(R.id.F);

        Spinner spinnerTemperatura = findViewById(R.id.spinnerTemperatura);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipos_temperatura, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTemperatura.setAdapter(adapter);

        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroIngresadoTexto = editTextNumero.getText().toString();
                String opcionSeleccionada = spinnerTemperatura.getSelectedItem().toString();
                if ("Celsius".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Celsius celsiusGrado = new Celsius(numeroIngresado);
                    editTextNumero.setText(String.valueOf(celsiusGrado.getValor()));

                }
                else if ("Fahrenheit".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Farenheit fahrenheitGrado = new Farenheit(numeroIngresado);
                    Celsius celsiusGrado = new Celsius(0.0);
                    celsiusGrado = celsiusGrado.parse(fahrenheitGrado);
                    editTextNumero.setText(String.valueOf(celsiusGrado.getValor()));
                }
                else if ("Kelvin".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Kelvin grado = new Kelvin(numeroIngresado);
                    Celsius celsius = new Celsius(0.0);
                    celsius = celsius.parse(grado);
                    editTextNumero.setText(String.valueOf(celsius.getValor()));
                }

            }
        });
        botonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroIngresadoTexto = editTextNumero.getText().toString();
                String opcionSeleccionada = spinnerTemperatura.getSelectedItem().toString();
                if ("Celsius".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Celsius grado = new Celsius(numeroIngresado);
                    Kelvin kelvin = new Kelvin(0.0);
                    kelvin = kelvin.parse(grado);
                    editTextNumero.setText(String.valueOf(kelvin.getValor()));
                }
                else if ("Fahrenheit".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Farenheit grado = new Farenheit(numeroIngresado);
                    Kelvin kelvin = new Kelvin(0.0);
                    kelvin = kelvin.parse(grado);
                    editTextNumero.setText(String.valueOf(kelvin.getValor()));
                }
                else if ("Kelvin".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Kelvin grado = new Kelvin(numeroIngresado);
                    editTextNumero.setText(String.valueOf(grado.getValor()));
                }

            }
        });
        botonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroIngresadoTexto = editTextNumero.getText().toString();
                String opcionSeleccionada = spinnerTemperatura.getSelectedItem().toString();
                if ("Celsius".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Celsius grado = new Celsius(numeroIngresado);
                    Farenheit farenheit = new Farenheit(0.0);
                    farenheit = farenheit.parse(grado);
                    editTextNumero.setText(String.valueOf(farenheit.getValor()));
                }
                else if ("Fahrenheit".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Farenheit grado = new Farenheit(numeroIngresado);
                    editTextNumero.setText(String.valueOf(grado.getValor()));
                }
                else if ("Kelvin".equals(opcionSeleccionada)) {
                    double numeroIngresado = Double.parseDouble(numeroIngresadoTexto);
                    Kelvin grado = new Kelvin(numeroIngresado);
                    Farenheit farenheit = new Farenheit(0.0);
                    farenheit = farenheit.parse(grado);
                    editTextNumero.setText(String.valueOf(farenheit.getValor()));
                }

            }
        });

    }


}
