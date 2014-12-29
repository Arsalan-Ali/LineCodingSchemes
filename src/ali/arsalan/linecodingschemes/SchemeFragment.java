package ali.arsalan.linecodingschemes;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SchemeFragment extends Fragment {

	private EditText mInputBits;
	private DataCentre mData;
	private CommonView mView;
	public static final String CURRENTSCHEME_KEY="CURRENTSCHEME_KEY";
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        
		Scheme currentScheme =(Scheme)getArguments().getSerializable(CURRENTSCHEME_KEY);
        mView=CommonView.newInstance(getActivity(),currentScheme);
       
        
      
        mData=DataCentre.getInstance();
        mInputBits=(EditText)getActivity().findViewById(R.id.databits);
		mInputBits.setText(mData.getBits());
		
		mInputBits.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                mData.setBits(c.toString());
                mView.reDraw();
                	
                
            }

            public void beforeTextChanged(CharSequence c, int start, int count, int after) {
                // this space intentionally left blank
            }

            public void afterTextChanged(Editable c) {
      
            	for(int i=0;i<c.length();i++)
		            if(c.charAt(i)!='0' && c.charAt(i)!='1'){
		               	c.delete(i, i+1);
		               	
		            }
            	  if(c.length()>8){
		               	c.delete(8, c.length());
		               	
		          }
            }
		});
        return mView;
	}
	 public static SchemeFragment newInstance(Scheme currentScheme) {
	        Bundle args = new Bundle();
	        args.putSerializable(CURRENTSCHEME_KEY, currentScheme);

	        SchemeFragment fragment = new SchemeFragment();
	        fragment.setArguments(args);

	        return fragment;
	    }
}
