package com.kosmo.exam;

import java.util.ArrayList;




public interface BoardServie {

	public abstract ArrayList<BoardVO> boardList(int bseq,Object pbvo);
	public  ArrayList<BoardVO> boardList();
	public int boardInsert(int bseq, String title);
	
	public int replyUpdate(int bseq, int rseq);
	public BoardVO boardViewVO(int bseq);
	
}
	
	
