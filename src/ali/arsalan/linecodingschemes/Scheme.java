package ali.arsalan.linecodingschemes;

public enum Scheme{
	UP_NRZ("NRZ Unipolar Scheme",0),
	P_NRZ("NRZ Polar Scheme",1),
	P_RZ("RZ Polar Scheme",2),
	P_MANCHESTER("Manchester Polar Scheme",3),
	P_DIFF_MANCHESTER("Differential Manchester Polar Scheme",4),
	B_AMI("AMI Bipolar Scheme",5),
	B_PSEUDO("Pseudoternary Bipolar Scheme",6),
	ML_2B1Q("2B1Q Multilevel Scheme",7),
	MT_MLT3("MLT_3 Multitransition Scheme",8);
	private int intValue;
	private String stringValue;
	static final public int sfmSize=9;  
	
	private Scheme(String stringValue,int intValue){
		this.intValue=intValue;
		this.stringValue=stringValue;
	}
	
	@Override
	public String toString(){
		return stringValue;
	}
	public int intValue(){
		return intValue;
	}
	
	
}
