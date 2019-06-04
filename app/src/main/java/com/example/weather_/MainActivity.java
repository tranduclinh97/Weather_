package com.example.weather_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editSearch;
    Button btnSearch, btnChangeActivity;
    TextView txtName, txtTemp, txtStatus, txtHumidity, txtCloud, txtWind, txtDay;
    ImageView imgIcon;
    String city = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhSangCuaDang();
    }

    private void AnhSangCuaDang() {
        editSearch = (EditText) findViewById(R.id.edittextSearch);
        btnSearch = (Button) findViewById(R.id.buttonSearch);
        btnChangeActivity = (Button) findViewById(R.id.buttonChangeActivity);
        txtTemp = (TextView) findViewById(R.id.textviewTemp);
        txtStatus = (TextView) findViewById(R.id.textviewStatus);
        txtHumidity = (TextView) findViewById(R.id.textviewHumidity);
        txtCloud = (TextView) findViewById(R.id.textviewCloud);
        txtWind = (TextView) findViewById(R.id.textviewWind);
        txtDay = (TextView) findViewById(R.id.textviewDay);
        txtName = (TextView) findViewById(R.id.textviewName);
        imgIcon = (ImageView) findViewById(R.id.imageIcon);
    }
}
