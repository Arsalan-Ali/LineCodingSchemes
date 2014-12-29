package ali.arsalan.linecodingschemes;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class P_RZView extends CommonView{
private DataCentre Data;
	
	public P_RZView(Context context) {
		super(context);
		initSigPaint();
	}
	
	public P_RZView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initSigPaint();
	}
	public P_RZView(Context context, AttributeSet attrs,int defStyle) {
		super(context, attrs, defStyle);
		initSigPaint();
	}
	
	private void sigForOne(Canvas canvas,int i){
		if(i==0)
			
			
			if(mWidth>mHeight){
				canvas.drawLine(3, (float)(mHeight-2)/(float)2, 3, (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(2, (float)(mHeight-2)/(float)4, ((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8), (float)(mHeight-2)/(float)2, mSigPaint);
			}
			else{
				canvas.drawLine(3, ((float)mHeight)/(float)6, 3, ((float)mHeight)/(float)12, mSigPaint);
				canvas.drawLine(2, (float)(mHeight)/(float)12, ((float)(mWidth-2)/(float)16), (float)(mHeight)/(float)12, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)16), ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)16), ((float)mHeight)/(float)12, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8), (float)(mHeight)/(float)6, mSigPaint);
				
			}
		else
			if(mWidth>mHeight){
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)4, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)4, mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight-2)/(float)2, mSigPaint);
			}
			else{
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)12, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight)/(float)12, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight)/(float)12, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), ((float)mHeight)/(float)12, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight)/(float)6, mSigPaint);
			}
	}
	private void sigForZero(Canvas canvas,int i){
		if(i==0)
			
			
			if(mWidth>mHeight){
				canvas.drawLine(3, (float)(mHeight-2)/(float)2, 3, (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(2, (float)(mHeight-2)*((float)3/(float)4), ((float)(mWidth-2)/(float)16), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)16), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8), (float)(mHeight-2)/(float)2, mSigPaint);
			}
			else{
				canvas.drawLine(3, ((float)mHeight)/(float)6, 3, ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(2, ((float)mHeight)/(float)4, ((float)(mWidth-2)/(float)16), ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)16), ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)16), ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)16), (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8), (float)(mHeight)/(float)6, mSigPaint);
				
			}
		else
			if(mWidth>mHeight){
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, (float)(mHeight-2)*((float)3/(float)4), ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)*((float)3/(float)4), mSigPaint);
				
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight-2)/(float)2, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight-2)/(float)2, mSigPaint);
			}
			else{
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)4, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), ((float)mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), ((float)mHeight)/(float)4, mSigPaint);
				canvas.drawLine(((float)(mWidth-2)/(float)8)*(i+((float)1/(float)2)), (float)(mHeight)/(float)6, ((float)(mWidth-2)/(float)8)*(i+1), (float)(mHeight)/(float)6, mSigPaint);
			}
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
				sigForZero(canvas,i);
				drawBit(canvas,'0',i);
			}
			else if(Data.getBits().charAt(i)=='1'){
				sigForOne(canvas,i);
				drawBit(canvas,'1',i);
				
			}
			
		}
		
		
	}


}
