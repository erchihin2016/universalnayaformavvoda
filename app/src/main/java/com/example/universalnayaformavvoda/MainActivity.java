package com.example.universalnayaformavvoda;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

    public void init() {

        final TextView TextVievName = (TextView) findViewById((R.id.TextVievName));
        final TextView EditTextEmail = (TextView) findViewById((R.id.EditTextEmail));
        Button numberone = (Button) findViewById(R.id.numberone);
        final Button numbertwo = (Button) findViewById(R.id.numbertwo);
        final TextView textResult = (TextView) findViewById((R.id.text));
        TextView textResult = (TextView) findViewById((R.id.textViewResult));

        initListeners(final TextView TextVievName,final TextView EditTextEmail,Button numberone,final Button numbertwo,
        final TextView textResult,TextView textResult)
    }

        public void  initListeners(final TextView TextVievName,final TextView EditTextEmail,Button numberone,final Button numbertwo,final TextView textResult,TextView textResult)
            numberone.setOnContextClickListener(new View.OnContextClickListener() {
                @Override
                public void onContextClick(View v) {
                    String text = "Подписка на рассылку успешно оформлена для пользователя";
            EditText textViewResult;
            textViewResult.setText(text);
                }
            }));

             buttontwo.setOnClickListener((new View.OnClickListener))

    @Override
    public void setActionBar(@Nullable Toolbar toolbar) {
        @Override
                public void onClick(View v) {
            textViewResult.setText(" ");
            TextVievName.setText(" ");

    }

    {


        }


    }
}
