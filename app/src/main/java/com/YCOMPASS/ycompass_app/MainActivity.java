package com.YCOMPASS.ycompass_app;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtPrelim, txtMidTerm, txtPreFinals, txtFinals;
    Button btnCalculate, btnCancel;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtPrelim = findViewById(R.id.txtPrelim);
        txtMidTerm = findViewById(R.id.txtMidTerm);
        txtPreFinals = findViewById(R.id.txtPreFinals);
        txtFinals = findViewById(R.id.txtFinals);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCancel = findViewById(R.id.btnCancel);
        txtResult = findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double prelim = Double.parseDouble(txtPrelim.getText().toString());
                double midterm = Double.parseDouble(txtMidTerm.getText().toString());
                double prefinals = Double.parseDouble(txtPreFinals.getText().toString());
                double finals = Double.parseDouble(txtFinals.getText().toString());

                double gwa = (prelim * 0.20) + (midterm * 0.20) + (prefinals * 0.20) + (finals * 0.40);

                txtResult.setText("GWA: " + gwa);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPrelim.setText("");
                txtMidTerm.setText("");
                txtPreFinals.setText("");
                txtFinals.setText("");
                txtResult.setText("");
            }
        });
    }
}