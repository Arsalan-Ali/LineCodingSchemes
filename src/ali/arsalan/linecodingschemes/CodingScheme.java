package ali.arsalan.linecodingschemes;

public class CodingScheme {
	
	private Scheme[] mSchemes;

	
	public CodingScheme() {
		mSchemes=new Scheme[9];
		mSchemes[0]=Scheme.UP_NRZ;
		mSchemes[1]=Scheme.P_NRZ;
		mSchemes[2]=Scheme.P_RZ;
		mSchemes[3]=Scheme.P_MANCHESTER;
		mSchemes[4]=Scheme.P_DIFF_MANCHESTER;
		mSchemes[5]=Scheme.B_AMI;
		mSchemes[6]=Scheme.B_PSEUDO;
		mSchemes[7]=Scheme.ML_2B1Q;
		mSchemes[8]=Scheme.MT_MLT3;
	}
	
	public Scheme getSchemeAtIndex(int pos) {
		return mSchemes[pos];
	}

	
	

}
