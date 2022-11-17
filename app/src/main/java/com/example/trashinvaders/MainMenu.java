package com.example.trashinvaders;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainMenu extends Activity implements OnClickListener {
    private Button btn_start; // name of this button object must be the same as the name @+id in the xml
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Hide Title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Hide Top Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.mainmenu);
        //will use layout>mainmenu.xml to be the view/page/screen to show on the screen
        //Button is on the view ond we create the view from the mainmenu.xml and to know which button,fand from the view by id. in this case is btn_start
        btn_start = (Button)findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);
        //Hwo do we know the button is clcked.: OnClickListener
    }

    @Override
    //invok a callback event  in the view
    //we need to know if btn_startis pressed what to do
    //so when the btn_start is pressed eg.it will go from splash page to main menu
    //Scene transition
    public void onClick(View v){
        //Intent = action to be performed
        //Intent is an object provides runtime binding
        //You need to create a new intance of this object to use
        Intent intent = new Intent();
        if (v==btn_start)
        {
            intent.setClass(this,SplashScreen.class);
        }
        else if(v==btn_back)
        {
            intent.setClass(this,MainMenu.class);
        }
        startActivity(intent);
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
