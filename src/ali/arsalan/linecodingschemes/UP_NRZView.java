package ali.arsalan.linecodingschemes;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class UP_NRZView extends CommonView {
	private DataCentre Data;
	
	public UP_NRZView(Context context) {
		super(context);
		initSigPaint();
	}
	
	public UP_NRZView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initSigPaint();
	}
	public UP_NRZView(Context context, AttributeSet attrs,int defStyle) {
		super(context, attrs, defStyle);
		initSigPaint();
	}
	
	private void vertLn(Canvas canvas,int i){
		if(mWidth>mHeight)
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)4, mSigPaint);
		else
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)12, mSigPaint);
	}
	private void horLn(Canvas canvas,int i){
		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2, (float)(mHeight-2)/(float)4, ((float)(mWidth-2)/(float)8), (float)(mHeight-2)/(float)4, mSigPaint);
			else
				canvas.drawLine(2, (float)(mHeight)/(float)12, ((float)(mWidth-2)/(float)8), (float)(mHeight)/(float)12, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)4, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight-2)/(float)4, mSigPaint);
			else
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight)/(float)12, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight)/(float)12, mSigPaint);
	}
	private void HorLnAtZero(Canvas canvas,int i){
		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8), (float)(mHeight-2)/(float)2, mSigPaint);
			else
				canvas.drawLine(2, (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8), (float)(mHeight)/(float)6, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight-2)/(float)2, mSigPaint);
			else
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight)/(float)6, mSigPaint);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		Data=DataCentre.getInstance();
		mWidth=getWidth();
		mHeight=getHeight();
		for(int i=0;i<Data.getBits().length();i++)
		{
			
			if(Data.getBits().charAt(i)=='0'){
				HorLnAtZero(canvas,i);
				if(Data.getBits().length()>(i+1))
					if(Data.getBits().charAt(i+1)=='1'){
						vertLn(canvas,i+1);
					}
				drawBit(canvas,'0',i);
			}
			else if(Data.getBits().charAt(i)=='1'){
				horLn(canvas,i);
				if(Data.getBits().length()>(i+1))
					if(Data.getBits().charAt(i+1)=='0'){
						vertLn(canvas,i+1);
					}
				drawBit(canvas,'1',i);
			}
			
		}
		
		
	}

}
