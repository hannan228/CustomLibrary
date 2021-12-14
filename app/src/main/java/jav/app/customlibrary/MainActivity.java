package jav.app.customlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import jav.app.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity implements Toaster.AdditionResutl {

    Toaster.AdditionResutl additionResutl = this::additionResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addition(View view) {
//        startActivity(new Intent(this, Toaster.class));
        Toaster.sum(additionResutl,6,3);
    }

    @Override
    public void additionResult(int result) {
        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();

    }
}