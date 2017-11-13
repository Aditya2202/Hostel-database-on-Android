package com.firstapp.aditya.hostelmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();
        ((RadioButton) view).setChecked(false);
                switch(view.getId()) {
                    case R.id.radioButton:
                        if (checked) {
                            Intent intent = new Intent(this, ManageRecords.class);
                            startActivity(intent);
                        }
                        break;


                    case R.id.radioButton1:
                        if (checked) {
                            Intent intent = new Intent(this, ComplaintBoard.class);
                            startActivity(intent);
                        }
                        break;

                    case R.id.radioButton2:
                        if (checked) {
                            Intent intent = new Intent(this, BookRecord.class);
                            startActivity(intent);
                        }
                        break;
                }

    }
}
