package com.example.palindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    TextView textViewPal;
    EditText editTextPal;
    Button buttonPal;

    private static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString().toLowerCase();
        return word.toLowerCase().equals(reversed) && !word.isEmpty() ? true : false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPal = findViewById(R.id.textView_pal);
        editTextPal = findViewById(R.id.editText_pal);
        buttonPal = findViewById(R.id.button_pal);

        buttonPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean res = isPalindrome(editTextPal.getText().toString());
                if (res) {
                    textViewPal.setText("Is Palindrome");
                } else {
                    textViewPal.setText("Not a Palindrome");
                }
            }
        });
    }
}