package ali.arsalan.linecodingschemes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CommonView extends View {
	private Paint mBorderPaint;
	protected Paint mDashLnPaint;
	private Paint mBoldLnPaint;
	private Paint mBackPaint;
	protected int mWidth;
	protected int mHeight;
	private RectF rForLand;
	private RectF rForPortrait;
	protected Paint mSigPaint;
	protected Paint mTextPaint_Landscape;
	protected Paint mTextPaint_Portrait;
	public static CommonView newInstance(Context context,Scheme currentScheme){
		
		switch(currentScheme){
			case UP_NRZ:
				return new UP_NRZView(context);
				
				
			case P_NRZ:
				return new P_NRZView(context);
			
			case P_RZ:
				return new P_RZView(context);	
			case B_AMI:
				return new B_AMIView(context);
				
			case B_PSEUDO:
				return new B_PseudoView(context);
			case MT_MLT3:
				return new MT_MLT3View(context);
			case P_MANCHESTER:
				return new P_ManchesterView(context);
			case P_DIFF_MANCHESTER:	
				return new P_Diff_ManchesterView(context);
			case ML_2B1Q:
				return new ML_2B1QView(context);
				
			default:
				return new CommonView(context);
		
		}
	}
	
	public CommonView(Context context) {
		super(context);
		setup();
	}
	
	public CommonView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setup();
	}
	public CommonView(Context context, AttributeSet attrs,int defStyle) {
		super(context, attrs, defStyle);
		setup();
	}
	protected void initSigPaint(){
		mSigPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mSigPaint.setColor(Color.RED);
		mSigPaint.setStrokeWidth(2);
		mSigPaint.setStyle(Style.STROKE);
		mTextPaint_Landscape=new Paint(Paint.ANTI_ALIAS_FLAG);
		mTextPaint_Landscape.setTextSize(20);
		
		mTextPaint_Landscape.setTextAlign(Align.CENTER);
		
		mTextPaint_Landscape.setColor(Color.DKGRAY);
		
		
		mTextPaint_Portrait=new Paint(Paint.ANTI_ALIAS_FLAG);
		mTextPaint_Portrait.setTextSize(10);
		
		mTextPaint_Portrait.setTextAlign(Align.CENTER);
		
		mTextPaint_Portrait.setColor(Color.DKGRAY);
	}
	
	
	public void reDraw(){
		invalidate();
	}
	
	private void setup(){
		rForLand=new RectF();
		rForPortrait=new RectF();
		mBorderPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mBorderPaint.setStrokeWidth(2);
		mBorderPaint.setColor(Color.DKGRAY);
		mBorderPaint.setStyle(Style.STROKE);
		CornerPathEffect effect1 = new CornerPathEffect(5);
		mBorderPaint.setPathEffect(effect1);
		
		mBackPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mBackPaint.setColor(Color.rgb(254, 236, 209));
		mBackPaint.setStrokeWidth(2);
		mBackPaint.setStyle(Style.FILL);
		mBackPaint.setPathEffect(effect1);
		
		mDashLnPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mDashLnPaint.setColor(Color.GRAY);
		mDashLnPaint.setStrokeWidth(1);
		mDashLnPaint.setStyle(Style.STROKE);
		DashPathEffect effect2 = new DashPathEffect(new float[]{5,2}, 0);
		mDashLnPaint.setPathEffect(effect2);
		
		mBoldLnPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mBoldLnPaint.setColor(Color.GRAY);
		mBoldLnPaint.setStrokeWidth(2);
		mBoldLnPaint.setStyle(Style.STROKE);
	}
	
	protected void drawBit(Canvas canvas,char bit,int i){
		float yPortrait=(float)(mHeight)/(float)24;
		float yLandscape=(float)(mHeight-2)/(float)8;
		float x=((float)(mWidth-2)/(float)8);
		if(mWidth>mHeight)
			canvas.drawText(bit+"", x*(i+(float)1/(float)2), yLandscape, mTextPaint_Landscape);
		else
			canvas.drawText(bit+"", x*(i+(float)1/(float)2), yPortrait, mTextPaint_Portrait);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		mWidth=getWidth();
		mHeight=getHeight();
		rForLand.set(2, 2, mWidth-2, mHeight-2);
		rForPortrait.set(2, 2, mWidth-2, ((float)mHeight)/(float)3);
		
		if(mWidth>mHeight)
			canvas.drawRect(rForLand, mBackPaint);
		else
			canvas.drawRect(rForPortrait, mBackPaint);
		
		if(mWidth>mHeight)
			canvas.drawLine(2, (float)(mHeight-2)/(float)2, mWidth-2, (float)(mHeight-2)/(float)2, mBoldLnPaint);
		else
			canvas.drawLine(2, ((float)mHeight)/(float)6, mWidth-2, ((float)mHeight)/(float)6, mBoldLnPaint);
		
		for(int i=1;i<8;i++){
			if(mWidth>mHeight)
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, 2, ((float)(mWidth-2)/(float)8)*i, mHeight-2, mDashLnPaint);
			else
				canvas.drawLine(((float)(mWidth-2)/(float)8)*i, 2, ((float)(mWidth-2)/(float)8)*i, ((float)mHeight)/(float)3, mDashLnPaint);
			
		}

		if(mWidth>mHeight)
			canvas.drawRect(rForLand, mBorderPaint);
		else
			canvas.drawRect(rForPortrait, mBorderPaint);
	}

}
