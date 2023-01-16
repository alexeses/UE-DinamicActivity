package com.github.alexeses;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // UI elements and other variables
    private LinearLayout llButtons;
    private Button btnCreateButtons;
    private Button btnProgressBar;
    private int counter;
    private ProgressDialog progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llButtons = findViewById(R.id.llButtons);
        btnCreateButtons = findViewById(R.id.btnCreateButton);
        btnProgressBar = findViewById(R.id.btnLoadBar);

        btnCreateButtons.setOnClickListener(v -> {
            Button btn = new Button(this);
            btn.setText("Button " + counter);
            Toast.makeText(this, "Button " + counter + " created", Toast.LENGTH_SHORT).show();
            llButtons.addView(btn);


            btn.setOnClickListener(v1 -> {
                Toast.makeText(this, "Button " + counter + " clicked", Toast.LENGTH_SHORT).show();
            });

            btn.setOnLongClickListener(v12 -> {
                llButtons.removeView(btn);
                Toast.makeText(this, "Button " + counter + " removed", Toast.LENGTH_SHORT).show();
                counter--;
                return true;
            });

            counter++;
        });

        btnProgressBar.setOnClickListener(v -> {
            progress = new ProgressDialog(this);
            progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progress.setTitle("Loading");
            progress.setMessage("Wait while loading...");
            progress.setCancelable(false);
            progress.setIndeterminate(false);
            progress.setProgress(0);
            progress.setMax(100);
            progress.show();

            final Thread thread = new Thread(() -> {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        progress.setProgress(i);
                    }
                    progress.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread.start();

        });

    }
}