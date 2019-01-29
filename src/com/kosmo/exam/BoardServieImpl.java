package com.kosmo.exam;

import java.sql.*;
import java.util.ArrayList;


public class BoardServieImpl implements BoardServie{

	public ArrayList<BoardVO> boardList(int bseq, Object pbvo) {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardMana db= new BoardMana();
		Connection conn=db.dbConn();
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		try {
			String sql="select * from board where "+ bseq +"=?";	
			pstmt=conn.prepareStatement(sql);
			pstmt.setObject(1, pbvo);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				BoardVO bvo= new BoardVO();
				bvo.setBseq(rs.getInt("bseq"));
				bvo.setRegdate(rs.getString("regdate"));
				bvo.setRegid(rs.getString("regid"));
				bvo.setTitle(rs.getString("title"));
				list.add(bvo);
				}
		}	
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	


	@Override
	public ArrayList<BoardVO> boardList() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardMana db= new BoardMana();
		Connection conn=db.dbConn();
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		try {
			String sql="select * from board";	
			pstmt=conn.prepareStatement(sql);
			pstmt.executeQuery();
			rs= pstmt.executeQuery();
			while(rs.next()) {
				BoardVO bvo= new BoardVO();
				bvo.setBseq(rs.getInt("bseq"));
				bvo.setRegdate(rs.getString("regdate"));
				bvo.setRegid(rs.getString("regid"));
				bvo.setTitle(rs.getString("title"));
				list.add(bvo);
				}
		}	
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int boardInsert(int bseq, String title) {
		BoardMana db= new BoardMana();
		Connection conn=db.dbConn();
		PreparedStatement pstmt= null;
		int res=0;
		try {String sql="insert into board(bseq,title) values (?,?) ";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, bseq);
		pstmt.setString(2, title);
		res= pstmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {	
			db.dbClose(pstmt, conn);
		}
		return res;
		
	}

	@Override
	public int replyUpdate(int bseq, int rseq) {
		BoardMana db= new BoardMana();
		Connection conn=db.dbConn();
		PreparedStatement pstmt= null;
		int res=0;
		try {String sql="insert into board_reply(bseq,rseq) values (?,?) ";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, bseq);
		pstmt.setInt(2, rseq);
		res= pstmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {	
			db.dbClose(pstmt, conn);
		}
		return res;
		
	}



//	@Override
	public BoardVO boardViewVO(int bseq) {
//		BoardMana db= new BoardMana();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Connection conn=db.dbConn();
//		BoardVO bvo = new BoardVO();
//		try {
//			
//			
//			String sql = "select b.*, r.* " + 
//					"from board b, board_reply r " + 
//					"where b.bseq = r.bseq(+) " + 
//					"and b.bseq=?";
//			System.out.println(sql);
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, bseq);
//			rs = pstmt.executeQuery();
//			ArrayList<BoardRVO> rlist = new ArrayList<BoardRVO>();
//			while(rs.next()) {
//				bvo.setBseq(rs.getInt("bseq"));
//				bvo.setTitle(rs.getString("title"));
//				bvo.setRegid(rs.getString("regid"));
//				bvo.setRegdate(rs.getString("regdate"));
//				
//					BoardRVO rvo = new BoardRVO();
//					rvo.setRseq(rs.getInt("rseq"));
//					rvo.setReply(rs.getString("reply"));
//					rlist.add(rvo);	
//			}
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			db.dbClose(rs, pstmt, conn);
//		}
		return null;
//		
	}

}
