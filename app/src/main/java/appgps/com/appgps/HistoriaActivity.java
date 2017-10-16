package appgps.com.appgps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;

public class HistoriaActivity extends AppCompatActivity {
    public ArrayList<String> recordDataLista = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        Button btn2 = (Button) findViewById(R.id.botonSalir);
        Spinner historial = (Spinner) findViewById(R.id.spinnerHistorial);
        recordDataLista = getIntent().getStringArrayListExtra("historial");

        ArrayAdapter adaptador = new ArrayAdapter(HistoriaActivity.this, android.R.layout.simple_spinner_dropdown_item);
        for (int c = 0 ; c < recordDataLista.size();c++)
        {
            adaptador.add(recordDataLista.get(c) + "\n");
        }
        historial.setAdapter(adaptador);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                finish();
            }
        });

    }
}
