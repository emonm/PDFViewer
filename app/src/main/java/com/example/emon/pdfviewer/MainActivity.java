package com.example.emon.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    private int current_page=0;
    EditText textEdit;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PDFView pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("rub.pdf") .load();
    }
}
