package com.editions.for_loop_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1, button2;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView= findViewById(R.id.textView);

//        Start break=======================================
//        for (int x= 1; x<=100; x++){
//
//            textView.append(" "+x);
//            if (x== 5) break;
//
//        }
////        End break=======================================


////        Start continue=======================================
//
//        for (int x= 1; x<=100; x++){
//
//            if (x== 5) continue;
//            textView.append(" "+x);
//
//        }
//
////        End continue=======================================




// //       Start ++ =======================================
//
//        int num= 1;
//
//        for (int x= 1; x<=100; x++){
//            num = num +x;
//
//        }
//        textView.setText(""+num);
//
// //       End =======================================


////       Start ** =======================================
//        int factorial= 1;
//        for (int x= 1; x<=5; x++){
//
//            factorial= factorial*x;
//        }
//        textView.setText(""+factorial);
//
////       End =======================================





        //       Start  =======================================


        editText1= findViewById(R.id.edText1);
        editText2= findViewById(R.id.edText2);
        button1= findViewById(R.id.btn1);
        button2= findViewById(R.id.btn2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_ed_1= editText1.getText().toString();
                String s_ed_2= editText2.getText().toString();
                if (s_ed_1.isEmpty() && s_ed_2.isEmpty()){
                    editText1.setError("Input Text");
                    editText2.setError("Input Number");
                }else {
                    int i_ed_2= Integer.parseInt(s_ed_2);

                    for (int x=1; x<=i_ed_2; x++){

                        textView.append(s_ed_1+"\n");

                    }

                }







            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");
                editText1.setText("I Love You");
                editText2.setText("10");
                textView.setTextIsSelectable(true);
            }
        });






    }
}