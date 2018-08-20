package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.KakeiboDTO;

public class KakeiboDAO {
	public static ArrayList<KakeiboDTO> disp_kakeibo(){	//テーブル表示
		ArrayList<KakeiboDTO> resultList = new ArrayList<KakeiboDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
					"root",
					"Mochi1206");

			String sql = "SELECT * FROM syusihyou";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()){
				int id = rs.getInt("id");
				String naiyou = rs.getString("naiyou");
				int money = rs.getInt("money");
				String hantei = rs.getString("hantei");
				int month = rs.getInt("month");
				int day = rs.getInt("day");
				resultList.add(new KakeiboDTO(id,naiyou,money,hantei,month,day));

			}
		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return resultList;

	}
	public static KakeiboDTO syusi_disp(String key){	//一旦保留
		KakeiboDTO result = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
					"root",
					"Mochi1206");
//↓この辺
			String sql = "SELECT * FROM syusihyou where naiyou = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, key);

			rs = pstmt.executeQuery();
//↑この辺

			rs.next();

			int id = rs.getInt("id");
			String naiyou = rs.getString("naiyou");
			int money = rs.getInt("money");
			String hantei = rs.getString("hantei");
			int month = rs.getInt("month");
			int day = rs.getInt("day");
			result = new KakeiboDTO(id,naiyou,money,hantei,month,day);


		} catch (SQLException e){
			System.out.println("アクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}


		return result;
	}

	public static KakeiboDTO touroku(int id, String naiyou, int money, String hantei, int month, int day){//【】内にカラム5個、MainFrameの呼び出しメソッドにも
		KakeiboDTO result = null;		//とーろく
		Connection con = null;
		PreparedStatement pstmt = null;


		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
					"root",
					"Mochi1206");

		String sql = "INSERT INTO syusihyou VALUES(?,?,?,?,?,?)";


		pstmt = con.prepareStatement(sql);

		pstmt.setInt(1, id);
		pstmt.setString(2, naiyou);
		pstmt.setInt(3, money);
		pstmt.setString(4, hantei);
		pstmt.setInt(5, month);
		pstmt.setInt(6, day);

		pstmt.executeUpdate();

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}


		return result;


	}

	public static KakeiboDTO delete(String key){
		KakeiboDTO result = null;

		Connection con = null;
		PreparedStatement pstmt = null;


		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
					"root",
					"Mochi1206");

			String sql = "DELETE FROM syusihyou WHERE naiyou = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, key);

			pstmt.executeUpdate();


		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;

	}

}



