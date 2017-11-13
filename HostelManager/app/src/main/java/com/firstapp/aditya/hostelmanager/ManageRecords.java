package com.firstapp.aditya.hostelmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ManageRecords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_records);
    }
    public void onManageRecords(View view)
    {
        boolean checked=((RadioButton) view).isChecked();
        ((RadioButton) view).setChecked(false);
        switch(view.getId()) {
            case R.id.Addnewrec:
                if (checked) {
                    Intent intent = new Intent(this,AddStudent.class);
                    startActivity(intent);
                }
                break;


            case R.id.Updaterec:
                if (checked) {
                    Intent intent = new Intent(this, UpdateStudent.class);
                    startActivity(intent);
                }
                break;

            case R.id.Deleterec:
                if (checked) {
                    Intent intent = new Intent(this, DeleteStudent.class);
                    startActivity(intent);
                }
                break;

            case R.id.Viewdatabase:
                if (checked) {
                    Intent intent = new Intent(this,ViewStudent.class);
                    startActivity(intent);
                }
                break;
        }

    }
}
