package jav.app.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Toaster extends AppCompatActivity {
    private static AdditionResutl additionResutl1;
    private static Context context;
    private static Toaster toaster;


    private EditText number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_toaster);
        number1 = findViewById(R.id.firstNumber);
        number2 = findViewById(R.id.secondNumber);
    }

    public void addition(View view) {
        String num1 = String.valueOf(number1.getText());
        String num2 = String.valueOf(number2.getText());

        int a = 0;
        int b = 0;
        if (!num1.equals("")){
            a = Integer.parseInt(num1);
        }
        if (!num2.equals("")){
            b = Integer.parseInt(num2);
        }
//        sum(additionResutl,a,b);
        finish();
    }

    public static void sum(AdditionResutl additionResutl,int a,int b){
        additionResutl1 = additionResutl;
        additionResutl1.additionResult(a+b);

    }

   public interface AdditionResutl{
         void additionResult(int result);
    }

    public void addition(){

    }

}