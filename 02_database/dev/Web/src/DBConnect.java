import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {
	// SQL 연결
	Connection conn = null;
	// 비어있는 양식
	Statement stmt = null; // literal SQL // 하루에 수행횟수가 적으면
	// 준비된 양식
	PreparedStatement pstmt = null; // 하루에 수행횟수가 많으면
	// 결과
	ResultSet rs = null;
	
	DBConnect(){
		// DB연동하면 예외처리를 반드시 해주어야 함
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:9933/web",
					"root",
					"1234"
					);
			if(conn != null) {
				System.out.println(conn);
				System.out.println("Congratulations!! Connect OK😎");
			}
		}
		catch(Exception e) {	
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnect dbConn = new DBConnect();
		dbConn.test();
		dbConn.select1("인천", "의원").forEach(System.out::println);
		System.out.println();
		dbConn.select2("대전", "상급종합").forEach(System.out::println);
	}// main
	
	public void test() {
		String sql = "select 'hi' as ans from dual";
		// DB, file ..은 전부 throw exception
		// 필수
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("DB responded");
				System.out.println("Response : " + rs.getString("ans"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	} // test
	// Statement
	public ArrayList<HospitalVO> select1(String region, String typ){
		ArrayList<HospitalVO> arr = new ArrayList();	
		// select * from hptl_mast_bak 
		// where sido_cd_nm = '서울' and typ_cd_nm = '상급종합'
		String sql = "";
		sql += "select * from hptl_mast ";
		sql += "where sido_cd_nm = '" + region + "' " ;
		sql += "and typ_cd_nm = '" + typ + "' " ;
		sql += "limit 10";
		System.out.println(sql);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				HospitalVO vo = new HospitalVO();
				String name = rs.getString("hptl_nm");
				String addr = rs.getString("addr");
				int num = rs.getInt("doc_num");
				vo.setHospitalVO(name, addr, num);
				arr.add(vo);
			}
		}catch(Exception e) { }
		return arr;
	}
	// PreparedStatment
	public ArrayList<HospitalVO> select2(String region, String typ){
		ArrayList<HospitalVO> arr = new ArrayList();
		// select * from hptl_mast_bak 
		// where sido_cd_nm = '서울' and typ_cd_nm = '상급종합'
		// PreparedStatement는 변수 부분을 ?로 작성
		String sql = "";
		sql += "select * from hptl_mast ";
		sql += "where sido_cd_nm = ? "  ;
		sql += "and typ_cd_nm = ? "  ;
		sql += "limit 10";
		System.out.println(sql);
		// preparedStatement의 유일한 단점 : (비정상적인) 수행 SQL의
		// 파라미터를 알아내기가 복잡 -> 수행회수가 매우 많은 경우 사용 (하루 1000번이상)
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, region);
			pstmt.setString(2, typ);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				HospitalVO vo = new HospitalVO();
				String name = rs.getString("hptl_nm");
				String addr = rs.getString("addr");
				int num = rs.getInt("doc_num");
				vo.setHospitalVO(name, addr, num);
				arr.add(vo);
			}
		}catch(Exception e) {  }
		return arr;
	}
}

