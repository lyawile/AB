package org.mysysdev.yuchu;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView myImage = findViewById(R.id.imageToShow);
        final int[] imagesList = new int[]{
                R.drawable.rose_flower,
                R.drawable.car,
                R.drawable.tree
        };
        Button btnNext =  findViewById(R.id.btnNext);
                btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentImage =imagesList[2];
                myImage.setImageResource(currentImage);
                System.out.println(R.drawable.rose_flower);
                System.out.println(Arrays.toString(imagesList));
            }
        });

    }
}
