package com.example.umerfarooqactivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Paint;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Bitmap bg;
    Button Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8;
    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniTtialize();
        performaction();

    }

    private void performaction() {
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Rectangle",420,150,paint);
                canvas.drawRect(400,200,650,700,paint);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Circle",420,150,paint);
                canvas.drawCircle(200,350,150,paint);

            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Square",420,150,paint);
                canvas.drawRect(50,850,520,1150,paint);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Line",420,150,paint);
                canvas.drawLine(520,820,520,1150,paint);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Rectangle",420,150,paint);
                canvas.drawRect(200,400,650,700,paint);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"cannot rotate",Toast.LENGTH_SHORT).show();

            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"cannot rotate",Toast.LENGTH_SHORT).show();

            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
                im1=findViewById(R.id.im1);
                im1.setImageBitmap(bg);
                Canvas canvas =new Canvas(bg);
                Paint paint= new Paint();
                paint.setColor(Color.RED);
                paint.setTextSize(50);
                canvas.drawText("Line",420,150,paint);
                canvas.drawLine(820,520,1150,520,paint);

            }
        });


    }

    private void IniTtialize() {
        Button1=(Button)findViewById(R.id.Buton1);
        Button2=(Button) findViewById(R.id.Button2);
        Button3=(Button) findViewById(R.id.Button3);
        Button4=(Button) findViewById(R.id.Button4);
        Button5=(Button) findViewById(R.id.b5);
        Button6=(Button) findViewById(R.id.b6);
        Button7=(Button) findViewById(R.id.b7);
        Button8=(Button) findViewById(R.id.b8);
    }


}