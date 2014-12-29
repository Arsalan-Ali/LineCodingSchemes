package ali.arsalan.linecodingschemes;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class SchemeActivity extends FragmentActivity {
	
	private final String ABOUT_DIALOG_TAG="ali.arsalan.linecodingschemes.ABOUT_DIALOG_TAG";	
	private final String HOW_TO_DIALOG_TAG="ali.arsalan.linecodingschemes.HOW_TO_DIALOG_TAG";
	private CodingScheme mScheme;
	private ViewPager mPager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheme);
		mScheme=new CodingScheme();
		setTitle(mScheme.getSchemeAtIndex(0).toString());
		
		mPager=(ViewPager)findViewById(R.id.pager);
		FragmentManager fm = getSupportFragmentManager();
	    mPager.setAdapter(new FragmentStatePagerAdapter(fm) {
	           @Override
	           public int getCount() {
	               return Scheme.sfmSize;
	           }
	           @Override
	           public Fragment getItem(int pos) {
	        	   
	               return SchemeFragment.newInstance(mScheme.getSchemeAtIndex(pos));
	           }
	       }); 
	    mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
	    	public void onPageScrollStateChanged(int state) { }
	    	public void onPageScrolled(int pos, float posOffset, int posOffsetPixels) { }
	    	public void onPageSelected(int pos){ 
	    	
	    	
	    		
	    		setTitle(mScheme.getSchemeAtIndex(pos).toString());
	    		
	    	}
	    	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scheme, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.about) {
			AboutDialogFragment aboutDialogFragment=new AboutDialogFragment();
			aboutDialogFragment.show(getSupportFragmentManager(), ABOUT_DIALOG_TAG);
			return true;
		}
		else if (id == R.id.how_to_use) {
			HowToDialogFragment howToDialogFragment=new HowToDialogFragment();
			howToDialogFragment.show(getSupportFragmentManager(), HOW_TO_DIALOG_TAG);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
