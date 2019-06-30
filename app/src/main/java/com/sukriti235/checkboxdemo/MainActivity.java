package com.sukriti235.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CheckBox checkBox1;
    CheckBox checkBox2;

    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                // Check which checkbox was clicked
                if (checked){
                    Toast.makeText(MainActivity.this, "Pizza is Selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.pizza);
                }
                else{
                    Toast.makeText(MainActivity.this, "Pizza is Removed", Toast.LENGTH_SHORT).show();
                    //imageView1
                }
            }
        });
        
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                // Check which checkbox was clicked
                if (checked){
                    Toast.makeText(MainActivity.this, "Burger is Selected", Toast.LENGTH_SHORT).show();
                    imageView2.setImageResource(R.drawable.burger);
                }
                else{
                    Toast.makeText(MainActivity.this, "Burger is Removed", Toast.LENGTH_SHORT).show();
                    //imageView2.
                }
            }
        });

    }
}
