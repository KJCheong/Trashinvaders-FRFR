package com.example.trashinvaders;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceView;

public class RenderBackground implements EntityBase{

    private Bitmap bmp = null;
    private boolean isDone=false;
    private float xPos =0,yPos=0;
    int ScreenWidth, ScreenHeight;

    private Bitmap scaledbmp = null; //will be a scaled version of the bmp based on the screenwitdh and height

    public boolean IsDone(){
        return isDone;
    }
    public void SetIsDone(boolean _isDone){
        isDone=_isDone;
    }
    public void Init(SurfaceView _view){ //indicate what image you want to use, load the image
        bmp= BitmapFactory.decodeResource(_view.getResources(), R.drawable.gamescene);
        //get screensize
        DisplayMetrics metrics = _view.getResources().getDisplayMetrics();
        ScreenWidth = metrics.widthPixels;
        ScreenHeight =metrics.heightPixels;

        scaledbmp=Bitmap.createScaledBitmap(bmp,ScreenWidth,ScreenHeight,true);
    }
    public void Update(float _dt){

    }
    public void Render(Canvas _canvas){

    }
    public boolean IsInit(){
        return bmp !=null;
    }
    public int GetRenderLayer(){
        return LayerConstants.BACKGROUND_LAYER;
    }
    public void SetRenderLayer(int _newLayer){
        return;
    }
    public ENTITY_TYPE GetEntityType(){
        return ENTITY_TYPE.ENT_DEFAULT;
    }
}
