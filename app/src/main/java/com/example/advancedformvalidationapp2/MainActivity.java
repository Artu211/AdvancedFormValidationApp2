package com.example.advancedformvalidationapp2;


import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText surname1;
    private EditText phone;
    private EditText pass;
    private EditText pass2;
    private Button wyslij;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name1);
        surname1 = findViewById(R.id.surname);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email1);
        pass = findViewById(R.id.pass);
        pass2 = findViewById(R.id.pass2);
        wyslij = findViewById(R.id.wyslij);

        wyslij.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name1 = name.getText().toString().trim();
                String surname = surname1.getText().toString().trim();
                String email1 = email.getText().toString().trim();
                String phone_value = phone.getText().toString().trim();
                String pass1_value = pass.getText().toString().trim();
                String pass2_value = pass2.getText().toString().trim();
                if(name1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać imię",Toast.LENGTH_SHORT).show();
                }
                else if(surname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać nazwisko",Toast.LENGTH_SHORT).show();
                }
                else if(email1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać email",Toast.LENGTH_SHORT).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email1).matches()){
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email",Toast.LENGTH_SHORT).show();
                }
                else if(phone_value.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Podaj Nr.Telefonu",Toast.LENGTH_SHORT).show();
                }
                else if(phone_value.length() < 9 ){
                    Toast.makeText(MainActivity.this, "Zbyt krótki Nr.Telefonu",Toast.LENGTH_SHORT).show();
                }
                else if(pass1_value.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Podaj hasło",Toast.LENGTH_SHORT).show();
                }
                else if(pass1_value.length() < 6 ){
                    Toast.makeText(MainActivity.this, "Zbyt krótkie hasło",Toast.LENGTH_SHORT).show();
                }
                else if(pass2_value.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Potwierdź hasło",Toast.LENGTH_SHORT).show();
                }
                else if(!pass1_value.equals(pass2_value)){
                    Toast.makeText(MainActivity.this, "Powtórzone hasło jest inne niż pierwsze",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
