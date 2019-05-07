package app.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    double number1=0;
    double number2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button suma=findViewById(R.id.SUMA);
        final Button resta=findViewById(R.id.RESTA);
        final Button divicion=findViewById(R.id.DIVICION);
        final Button multiplicar=findViewById(R.id.MULTIPLICAR);
        final Button porcentaje=findViewById(R.id.PORCENTAJE);
        final Button potencia=findViewById(R.id.POTENCIA);

        final EditText numero1=findViewById(R.id.Numero1);
        final EditText numero2=findViewById(R.id.Numero2);
        final TextView resultado=findViewById(R.id.Resultado);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              double x=0;
              number1=Double.parseDouble(numero1.getText().toString());
              number2=Double.parseDouble(numero2.getText().toString());
              x=getOperaciones(number1,number2,"suma");
              resultado.setText(" "+x);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                number1=Double.parseDouble(numero1.getText().toString());
                number2=Double.parseDouble(numero2.getText().toString());
                x=getOperaciones(number1,number2,"resta");
                resultado.setText(" "+x);
            }
        });

        divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                number1=Double.parseDouble(numero1.getText().toString());
                number2=Double.parseDouble(numero2.getText().toString());
                x=getOperaciones(number1,number2,"divicion");
                resultado.setText(" "+x);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                number1=Double.parseDouble(numero1.getText().toString());
                number2=Double.parseDouble(numero2.getText().toString());
                x=getOperaciones(number1,number2,"multiplicacion");
                resultado.setText(" "+x);
            }
        });

        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                number1=Double.parseDouble(numero1.getText().toString());
                number2=Double.parseDouble(numero2.getText().toString());
                x=getOperaciones(number1,number2,"porcentaje");
                resultado.setText(" "+x);
            }
        });

        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                number1=Double.parseDouble(numero1.getText().toString());
                number2=Double.parseDouble(numero2.getText().toString());
                x=getOperaciones(number1,number2,"potencia");
                resultado.setText(" "+x);
            }
        });


    }
    public double getOperaciones(double number1,double number2,String opcion){
        double result=0;

        switch(opcion){

            case "suma":
            result=number1+number2;
            break;

            case  "resta":
            result=number1-number2;
            break;

            case  "divicion":
            result=number1/number2;
            break;

            case "multiplicacion":
            result=number1*number2;
            break;

            case "porcentaje":
            result=number1*number2/100;
            break;

            case "potencia":
                result=Math.pow(number1,number2);
            break;



         }


        return result;
     }

}


