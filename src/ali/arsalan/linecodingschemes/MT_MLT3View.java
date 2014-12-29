package ali.arsalan.linecodingschemes;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class MT_MLT3View extends CommonView {

private DataCentre Data;
	
	public MT_MLT3View(Context context) {
		super(context);
		initSigPaint();
	}
	
	public MT_MLT3View(Context context, AttributeSet attrs) {
		super(context, attrs);
		initSigPaint();
	}
	public MT_MLT3View(Context context, AttributeSet attrs,int defStyle) {
		super(context, attrs, defStyle);
		initSigPaint();
	}
	
	private void vertLnUp(Canvas canvas,int i){
		if(mWidth>mHeight)
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)4, mSigPaint);
		else
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)12, mSigPaint);
	}
	private void horLnUp(Canvas canvas,int i){
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
	private void horLnDown(Canvas canvas,int i){
		if(i==0)
			if(mWidth>mHeight)
				canvas.drawLine(2, (float)(mHeight-2)*((float)3/(float)4), ((float)(mWidth-2)/(float)8), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
			else
				canvas.drawLine(2, (float)(mHeight)/(float)4, ((float)(mWidth-2)/(float)8), (float)(mHeight)/(float)4, mSigPaint);
		else
			if(mWidth>mHeight)
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)*((float)3/(float)4), ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
			else
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight)/(float)4, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight)/(float)4, mSigPaint);
	}
	
	private void vertLnDown(Canvas canvas,int i){
		if(mWidth>mHeight)
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
		else
			canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)4, mSigPaint);
	}
	@Override
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		Data=DataCentre.getInstance();
		mWidth=getWidth();
		mHeight=getHeight();
		boolean prevPositive=false;
		int prevLevel=0;
		
		for(int i=0;i<Data.getBits().length();i++)
		{
			
			if(Data.getBits().charAt(i)=='1'){
				if(prevLevel==0)
				{
					if(prevPositive){
						horLnDown(canvas,i);						
						prevPositive=false;
						prevLevel=-1;
						if(i!=0)
							vertLnDown(canvas,i);
					}
					else{
						horLnUp(canvas,i);
						prevPositive=true;
						prevLevel=1;
						if(i!=0)
							vertLnUp(canvas,i);
							
					}
					
				}
				else if(prevLevel>0)
				{
					
					HorLnAtZero(canvas,i);
					prevLevel=0;
					if(i!=0)
						vertLnUp(canvas,i);
					
				}
				else{
					prevLevel=0;
					HorLnAtZero(canvas,i);
					if(i!=0)
						vertLnDown(canvas,i);
					
				}
				drawBit(canvas,'1',i);
			}
			else if(Data.getBits().charAt(i)=='0'){
				if(prevLevel==0)
				{
					HorLnAtZero(canvas,i);
				}
				else if(prevLevel>0)
				{
					
					horLnUp(canvas,i);
					
				}
				else{
					
					horLnDown(canvas,i);
					
				}
				
				drawBit(canvas,'0',i);
			}
			
		}
		
		
	}

}

