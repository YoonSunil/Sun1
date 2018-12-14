package com.jang.member;

import com.jang.order.OrderVO;

public class MemberVO {
	private int mseq;
	public String mnickname;
	public String mfrom;
	public String memail;
	public String maccountnumber;
	public String mbank;
	public String  mphone;
	public String mregdate;
	public String maddress;
	public double mlat;
	public double mlng;
	public boolean mdeleteyn;
	public String mgubun;
	public boolean mpush;
	public String mzipcode;
	
	public OrderVO orderVO;
	

	
	public OrderVO getOrderVO() {
		return orderVO;
	}
	public void setOrderVO(OrderVO orderVO) {
		this.orderVO = orderVO;
	}
	public int getMseq() {
		return mseq;
	}
	public void setMseq(int mseq) {
		this.mseq = mseq;
	}
	public String getMnickname() {
		return mnickname;
	}
	public void setMnickname(String mnickname) {
		this.mnickname = mnickname;
	}
	public String getMfrom() {
		return mfrom;
	}
	public void setMfrom(String mfrom) {
		this.mfrom = mfrom;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMaccountnumber() {
		return maccountnumber;
	}
	public void setMaccountnumber(String maccountnumber) {
		this.maccountnumber = maccountnumber;
	}
	public String getMbank() {
		return mbank;
	}
	public void setMbank(String mbank) {
		this.mbank = mbank;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMregdate() {
		return mregdate;
	}
	public void setMregdate(String mregdate) {
		this.mregdate = mregdate;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public double getMlat() {
		return mlat;
	}
	public void setMlat(double mlat) {
		this.mlat = mlat;
	}
	public double getMlng() {
		return mlng;
	}
	public void setMlng(double mlng) {
		this.mlng = mlng;
	}
	public boolean isMdeleteyn() {
		return mdeleteyn;
	}
	public void setMdeleteyn(boolean mdeleteyn) {
		this.mdeleteyn = mdeleteyn;
	}
	public String getMgubun() {
		return mgubun;
	}
	public void setMgubun(String mgubun) {
		this.mgubun = mgubun;
	}
	public boolean isMpush() {
		return mpush;
	}
	public void setMpush(boolean mpush) {
		this.mpush = mpush;
	}
	public String getMzipcode() {
		return mzipcode;
	}
	public void setMzipcode(String mzipcode) {
		this.mzipcode = mzipcode;
	}
	public String getMaddressdetail() {
		return maddressdetail;
	}
	public void setMaddressdetail(String maddressdetail) {
		this.maddressdetail = maddressdetail;
	}
	public String getMaccountholder() {
		return maccountholder;
	}
	public void setMaccountholder(String maccountholder) {
		this.maccountholder = maccountholder;
	}
	public int getCodelistseq() {
		return codelistseq;
	}
	public void setCodelistseq(int codelistseq) {
		this.codelistseq = codelistseq;
	}
	public String maddressdetail;
	public String maccountholder;
	private int codelistseq;
	
	
	
}
