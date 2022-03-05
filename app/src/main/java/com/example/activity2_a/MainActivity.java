package com.example.activity2_a;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel Untuk Button
    Button btnlogin;

    //Deklarasi Variabel Untuk EditText
    EditText edemail, edpassword;

    //Deklarasi Variabel Untuk Menyimpan Email dan Password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnlogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();
                //Menyimpan input user di edittext password kedalam variabel nama dan password
                password = edpassword.getText().toString();
                //Membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan password anda: "+password+"", Toast.LENGTH_LONG);
                //Menampilkan Toast
                t.show();
            }
        });

    }
}