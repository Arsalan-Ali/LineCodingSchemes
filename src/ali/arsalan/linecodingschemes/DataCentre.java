package ali.arsalan.linecodingschemes;

public class DataCentre {
	static private DataCentre sData;
	private String mBits;
	private DataCentre(){
		mBits="";
	}
	public String getBits() {
		return mBits;
	}
	public void setBits(String bits) {
		mBits = bits;
	}
	static public DataCentre getInstance(){
		if(null==sData){
			sData=new DataCentre();
		}
		return sData;
	}
}
