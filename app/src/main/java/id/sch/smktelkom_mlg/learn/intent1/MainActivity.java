package id.sch.smktelkom_mlg.learn.intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAMA = "Nama";
    public static final String UMUR = "Umur";
    EditText etNama;
    EditText etUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Input");
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etUmur = (EditText) findViewById(R.id.editTextUmur);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHasil();
            }
        });
    }

    private void goHasil() {
        String name = etNama.getText().toString();
        String usia = etUmur.getText().toString();

        int umur = usia.isEmpty() ? 0 : Integer.parseInt(usia);

        Intent intent = new Intent(MainActivity.this, HasilActivity.class);
        intent.putExtra(NAMA, name);
        intent.putExtra(UMUR, umur);

        startActivity(intent);

    }
}
