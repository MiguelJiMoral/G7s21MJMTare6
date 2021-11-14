package mx.edu.tesoem.isc.g7s21mjmtare6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    TextView txtNombre, txtComida, txtColor, txtNumero;
    EditText txtGson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.nombre);
        txtColor = findViewById(R.id.color);
        txtComida = findViewById(R.id.comida);
        txtNumero = findViewById(R.id.numero);
        txtGson = findViewById(R.id.gson1);

    }
    public void presiona(View v){
        switch (v.getId()){
            case R.id.button: conver();
                break;
        }
    }
    private void conver(){
        Gson gson = new Gson();
        String cgson = txtGson.getText().toString();
        Datos datos = gson.fromJson(cgson, Datos.class);
        txtNombre.setText(datos.getNombre());
        txtColor.setText( datos.getColor());
        txtComida.setText(datos.getComida());
        txtNumero.setText(" " + datos.getNumero());

    }
}