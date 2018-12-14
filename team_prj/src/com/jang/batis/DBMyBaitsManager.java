package com.jang.batis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jang.member.MemberVO;


public class DBMyBaitsManager {
	public SqlSession mybatisConn() {
		String path = "config/mybatis/config-mybatis.xml";
		Reader reader;
		SqlSessionFactory factory = null;
		SqlSession conn = null;
		try {
			reader = Resources.getResourceAsReader(path);
			factory = new SqlSessionFactoryBuilder().build(reader);
			if(factory == null)
				System.err.println("factory build Err");
			else
				System.out.println("factory build ok");

			conn = factory.openSession();
			MemberVO vo = new MemberVO();
			vo.setM_NICKNAME("admin");
			MemberVO res = conn.selectOne("userNameSpace.login", vo);
			System.out.println(res.getM_NICKNAME());
//			conn.insert(arg0,arg1);
//			conn.update(arg0,arg1);
//			conn.selectList(arg0, arg1);
//			conn.commit();
//			conn.rollback();
			MemberVO lvo=new MemberVO();
			lvo.setSearchGubun("userid");
			lvo.setSearchStr("lee");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void mybatisClose(SqlSession conn) {
		System.out.println("close");
		if(conn != null) conn.close();
	}

	public static void main(String[] args) {
		DBMyBaitsManager db = new DBMyBaitsManager();
		SqlSession conn =db.mybatisConn();
		if(conn==null)
			System.out.println("conn null");
		else
			System.out.println("conn ok");

		db.mybatisClose(conn);



		//DI Call Test
		//		GenericXmlApplicationContext ctx
		//		 = new GenericXmlApplicationContext("classpath:test.xml");
		//		TestDAO dao = (TestDAO)ctx.getBean("aaaa");
		//		ArrayList<BoardVO> list = dao.boardList(1, 10);
		//		System.out.println(list.size() + "건 출력");
		
	}

}
