package com.kosmo.exam;

import java.io.Serializable;

public class BoardRVO implements Serializable{
	int rseq;
	String reply;
	String regid;
	String regdate;
	int bseq;
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}

}
