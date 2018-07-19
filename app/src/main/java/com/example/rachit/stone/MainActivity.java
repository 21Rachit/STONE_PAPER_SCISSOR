package com.example.rachit.stone;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button button,button2,button3;
    TextView textView5,textView6,textView7;
    ImageView imageView,imageView2,imageView3,imageView5;
    TextView editText;
    TextView textView;
    Random r;
    int res;
    int k1=0,k2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        r=new Random();
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView5=(ImageView)findViewById(R.id.imageView5);
        editText=(TextView) findViewById(R.id.editText);
        textView=(TextView)findViewById(R.id.textView) ;
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("ROCK");
                res=r.nextInt(3)+1;
                imageView2.setImageResource(R.drawable.rock);
                if(res==1){
                RotateAnimation rotate=new RotateAnimation(0,90+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    imageView.setVisibility(View.GONE);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                imageView3.startAnimation(rotate);

                    editText.setText("PAPER");
                    Toast.makeText(getApplicationContext(),"AWW!! YOU LOSE",Toast.LENGTH_SHORT).show();
                    textView6.setText(++k2+" ");
                    imageView.setImageResource(R.drawable.paper);
                result();}

                if(res==2){
                    RotateAnimation rotate=new RotateAnimation(0,180+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("SCISSOR");
                    Toast.makeText(getApplicationContext(),"BABY!! YOU WON",Toast.LENGTH_SHORT).show();
                    textView5.setText(++k1+" ");
                    imageView.setImageResource(R.drawable.scissor);
                    result();}

                if(res==3){
                    RotateAnimation rotate=new RotateAnimation(0,320+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("ROCK");
                    Toast.makeText(getApplicationContext(),"OH!! IT'S A TIE",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.rock); result();}
                imageView.setVisibility(View.VISIBLE);



            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("PAPER");
                res=r.nextInt(3)+1;
                imageView2.setImageResource(R.drawable.paper);
                if(res==1){
                    RotateAnimation rotate=new RotateAnimation(0,90+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);

                    rotate.setFillAfter(true);
                    imageView.setVisibility(View.GONE);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("PAPER");
                    Toast.makeText(getApplicationContext(),"OH!! IT'S A TIE",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.paper); result();}

                if(res==2){
                    RotateAnimation rotate=new RotateAnimation(0,180+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("SCISSOR");
                    Toast.makeText(getApplicationContext(),"AWW!! YOU LOSE",Toast.LENGTH_SHORT).show();
                    textView6.setText(++k2+" ");
                    imageView.setImageResource(R.drawable.scissor); result();}

                if(res==3){
                    RotateAnimation rotate=new RotateAnimation(0,320+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("ROCK");
                    Toast.makeText(getApplicationContext(),"BABY!! YOU WON",Toast.LENGTH_SHORT).show();
                    textView5.setText(++k1+" ");
                    imageView.setImageResource(R.drawable.rock); result();}
                imageView.setVisibility(View.VISIBLE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("SCISSOR");
                res=r.nextInt(3)+1;
                imageView2.setImageResource(R.drawable.scissor);
                if(res==1){
                    RotateAnimation rotate=new RotateAnimation(0,90+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);

                    rotate.setFillAfter(true);
                    imageView.setVisibility(View.GONE);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("PAPER");
                    Toast.makeText(getApplicationContext(),"BABY!! YOU WON",Toast.LENGTH_SHORT).show();
                    textView5.setText(++k1+" ");
                    imageView.setImageResource(R.drawable.paper); result();}

                if(res==2){
                    RotateAnimation rotate=new RotateAnimation(0,180+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("SCISSOR");
                    Toast.makeText(getApplicationContext(),"OH!! IT'S A TIE",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.scissor); result();}

                if(res==3){
                    RotateAnimation rotate=new RotateAnimation(0,320+(360*7),RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                    rotate.setDuration(500);
                    rotate.setFillAfter(true);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    imageView3.startAnimation(rotate);
                    editText.setText("ROCK");
                    Toast.makeText(getApplicationContext(),"AWW!! YOU LOSE",Toast.LENGTH_SHORT).show();
                    textView6.setText(++k2+" ");
                    imageView.setImageResource(R.drawable.rock); result();}
                imageView.setVisibility(View.VISIBLE);

            }
        });
    }
    public void result()
    {
        if(k1==5)
        {
            Toast.makeText(getApplicationContext(),"PLAYER WINS THE CHAMPIONSHIP",Toast.LENGTH_LONG).show();
            k1=0;
            k2=0;
            textView5.setText(k1+" ");
            textView6.setText(k2+" ");

        }
        if(k2==5)
        {
            Toast.makeText(getApplicationContext(),"COMPUTER WINS THE CHAMPIONSHIP",Toast.LENGTH_LONG).show();
            k1=0;
            k2=0;
            textView5.setText(k1+" ");
            textView6.setText(k2+" ");
        }
    }
}
