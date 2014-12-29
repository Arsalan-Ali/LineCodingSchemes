package ali.arsalan.linecodingschemes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;

public class ML_2B1QView extends CommonView{
private DataCentre Data;
private float mPrevHeight_Portrait;	
private float mPrevHeight_Landscape;
private float mCurrentHeight_Portrait;	
private float mCurrentHeight_Landscape;
	public ML_2B1QView(Context context) {
		super(context);
		initSigPaint();

	}
	
	public ML_2B1QView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initSigPaint();
	}
	public ML_2B1QView(Context context, AttributeSet attrs,int defStyle) {
		super(context, attrs, defStyle);
		initSigPaint();
	}
	private void vertLn(Canvas canvas,int i){
		float width= ((float)(mWidth-2)/(float)4);
		if(i!=0)
			if(mWidth>mHeight){
				canvas.drawLine(width*i, mPrevHeight_Landscape, width*i, mCurrentHeight_Landscape, mSigPaint);
			}
			else{
				canvas.drawLine(width*i, mPrevHeight_Portrait, width*i, mCurrentHeight_Portrait, mSigPaint);
			}
	}
	
	private void sigAtPos1(Canvas canvas,int i){
			mPrevHeight_Portrait=mCurrentHeight_Portrait;
			mPrevHeight_Landscape=mCurrentHeight_Landscape;
		
		
		float heightPortrait=((float)mHeight)/(float)8;
		float heightLanscape=(float)(mHeight-2)*((float)3/(float)8);
		float widthPortrait= ((float)(mWidth-2)/(float)4);
		float widthLanscape=((float)(mWidth-2)/(float)4);
		mCurrentHeight_Portrait=heightPortrait;
		mCurrentHeight_Landscape=heightLanscape;
		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2,heightLanscape ,widthLanscape , heightLanscape, mSigPaint);
			else
				canvas.drawLine(2, heightPortrait,widthPortrait, heightPortrait, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(widthLanscape*i, heightLanscape, widthLanscape*(i+1), heightLanscape, mSigPaint);
			else
				canvas.drawLine(widthPortrait*i, heightPortrait, widthPortrait*(i+1), heightPortrait, mSigPaint);
	}

	
	private void drawDashLn(Canvas canvas){
		for(int i=1;i<8;i++){
			if(mWidth>mHeight)
				canvas.drawLine(((float)(mWidth-2)/(float)4)*i, 2, ((float)(mWidth-2)/(float)4)*i, mHeight-2, mDashLnPaint);
			else
				canvas.drawLine(((float)(mWidth-2)/(float)4)*i, 2, ((float)(mWidth-2)/(float)4)*i, ((float)mHeight)/(float)3, mDashLnPaint);
			
		}
	}
	
	private void sigAtNeg1(Canvas canvas,int i){
			mPrevHeight_Portrait=mCurrentHeight_Portrait;
			mPrevHeight_Landscape=mCurrentHeight_Landscape;
		
		float heightPortrait=((float)mHeight)*((float)5/(float)24);
		float heightLanscape=(float)(mHeight-2)*((float)5/(float)8);
		float widthPortrait= ((float)(mWidth-2)/(float)4);
		float widthLanscape=((float)(mWidth-2)/(float)4);
		mCurrentHeight_Portrait=heightPortrait;
		mCurrentHeight_Landscape=heightLanscape;

		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2,heightLanscape , widthLanscape, heightLanscape, mSigPaint);
			else
				canvas.drawLine(2,heightPortrait ,widthPortrait, heightPortrait, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(widthLanscape*i, heightLanscape, widthLanscape*(i+1), heightLanscape, mSigPaint);
			else
				canvas.drawLine(widthPortrait*i, heightPortrait, widthPortrait*(i+1), heightPortrait, mSigPaint);
	}
	
	private void sigAtPos3(Canvas canvas,int i){
			mPrevHeight_Portrait=mCurrentHeight_Portrait;
			mPrevHeight_Landscape=mCurrentHeight_Landscape;
		
		float heightPortrait=(float)(mHeight)/(float)16;
		float heightLanscape=(float)(mHeight-2)*((float)3/(float)16);
		float widthPortrait=((float)(mWidth-2)/(float)4);
		float widthLanscape=((float)(mWidth-2)/(float)4);
		mCurrentHeight_Portrait=heightPortrait;
		mCurrentHeight_Landscape=heightLanscape;

		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2,heightLanscape ,widthLanscape , heightLanscape, mSigPaint);
			else
				canvas.drawLine(2,heightPortrait ,widthPortrait , heightPortrait, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(widthLanscape*i, heightLanscape, widthLanscape*(i+1), heightLanscape, mSigPaint);
			else
				canvas.drawLine(widthPortrait*i, heightPortrait, widthPortrait*(i+1), heightPortrait, mSigPaint);
		
	}
	
	private void sigAtNeg3(Canvas canvas,int i){
			mPrevHeight_Portrait=mCurrentHeight_Portrait;
			mPrevHeight_Landscape=mCurrentHeight_Landscape;
		
		float heightPortrait=(float)(mHeight)*((float)13/(float)48);
		float heightLanscape=(float)(mHeight-2)*((float)13/(float)16);
		float widthPortrait=((float)(mWidth-2)/(float)4);
		float widthLanscape=((float)(mWidth-2)/(float)4);
		mCurrentHeight_Portrait=heightPortrait;
		mCurrentHeight_Landscape=heightLanscape;

		
		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2,heightLanscape ,widthLanscape , heightLanscape, mSigPaint);
			else
				canvas.drawLine(2,heightPortrait ,widthPortrait , heightPortrait, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(widthLanscape*i, heightLanscape, widthLanscape*(i+1), heightLanscape, mSigPaint);
			else
				canvas.drawLine(widthPortrait*i,heightPortrait, widthPortrait*(i+1), heightPortrait, mSigPaint);
	}
	
	protected void drawBit(Canvas canvas,String bits,int i){
		float yPortrait=(float)(mHeight)/(float)24;
		float yLandscape=(float)(mHeight-2)/(float)8;
		float x=((float)(mWidth-2)/(float)4);
		if(mWidth>mHeight)
			canvas.drawText(bits, x*(i+(float)1/(float)2), yLandscape, mTextPaint_Landscape);
		else
			canvas.drawText(bits, x*(i+(float)1/(float)2), yPortrait, mTextPaint_Portrait);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		mDashLnPaint.setColor(Color.TRANSPARENT);
		super.onDraw(canvas);
		mDashLnPaint.setColor(Color.GRAY);
		drawDashLn(canvas);
		Data=DataCentre.getInstance();
		mWidth=getWidth();
		mHeight=getHeight();
		String chgData=Data.getBits();
		boolean prevPositive=true;
		
		if(Data.getBits().length()%2!=0)
			chgData='0'+chgData;
		
		for(int i=0,j=0;i<Data.getBits().length();i+=2,j++)
		{
			
			if(chgData.substring(i, i+2).equals("00")){
				if(prevPositive){
					sigAtPos1(canvas,j);
					
					
				}
				else{
					sigAtNeg1(canvas,j);
					
				}
				vertLn(canvas,j);
				drawBit(canvas,"0 0",j);
			}
			else if(chgData.substring(i, i+2).equals("01")){
				if(prevPositive){
					sigAtPos3(canvas,j);
					
				}
				else{
					sigAtNeg3(canvas,j);
					
				}
				vertLn(canvas,j);
				drawBit(canvas,"0 1",j);
			}
			else if(chgData.substring(i, i+2).equals("10")){
				if(prevPositive){
					sigAtNeg1(canvas,j);
					prevPositive=false;
				}
				else{
					sigAtPos1(canvas,j);
					prevPositive=true;
				}
				vertLn(canvas,j);
				drawBit(canvas,"1 0",j);
			}
			else if(chgData.substring(i, i+2).equals("11")){
				if(prevPositive){
					sigAtNeg3(canvas,j);
					prevPositive=false;
				}
				else{
					sigAtPos3(canvas,j);
					prevPositive=true;
				}
				vertLn(canvas,j);
				drawBit(canvas,"1 1",j);
			}
		}
		
	}
	
}
