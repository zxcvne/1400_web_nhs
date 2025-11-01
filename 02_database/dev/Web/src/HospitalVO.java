// VO : DB접속용
public class HospitalVO {
	private String hptlNm;	// hptl_nm 
	private String addr;
	private int docNum;
	
	public void setHospitalVO(String name, String addr, int num) {
		this.hptlNm = name;
		this.addr = addr;
		this.docNum = num;
	}
	
	public String getHptlNm() { return hptlNm; }
	public String getAddr() { return addr; }
	public int getDocNum() { return docNum; }
	
	public String toString() {
		return "병원명: "+ hptlNm + " 위치: "+ addr + " 의사수: " + docNum;
	}
}
