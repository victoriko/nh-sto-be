package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Dashboard IssueVO를 위한 클래스
 */
public class PeerVO extends Peer implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	
	/** 검색시작일 */
	private String searchBgnDe = "";

	/** 검색종료일 */
	private String searchEndDe = "";
	
	/** 검색조건 */
	private String searchCnd = "";
	
	/** 검색단어 */
	private String searchWrd = "";

	/** 검색단어 */
	private String searchWrd3 = "";
	
	/** 검색단어 */
	private String searchWrd4 = "";
	
	/** 검색단어 */
	private String searchWrd5 = "";
	
	/** 검색단어 */
	private String searchWrd6 = "";
	
	/** 검색단어 */
	private String searchWrd7 = "";
	
	
	/** 정렬순서(DESC,ASC) */
	private long sortOrdr = 0L;

	/** 채널명 */
	private String channelName = "";
	
	/** 트랜잭션 총 갯수 */
	private int countPeer = 0;	
	
	/** 현재페이지 */
	private int pageIndex = 1;

	/** 페이지갯수 */
	private int pageUnit = 10;

	/** 페이지사이즈 */
	private int pageSize = 10;

	/** 첫페이지 인덱스 */
	private int firstIndex = 1;

	/** 마지막페이지 인덱스 */
	private int lastIndex = 1;

	/** 페이지당 레코드 개수 */
	private int recordCountPerPage = 10;

	/** 레코드 번호 */
	private int rowNo = 0;

	/** rpc 상태 */
    private boolean live;
	
	
	/**
	 * searchBgnDe attribute를 리턴한다.
	 *
	 * @return the searchBgnDe
	 */
	public String getSearchBgnDe() {
		return searchBgnDe;
	}

	/**
	 * searchBgnDe attribute 값을 설정한다.
	 *
	 * @param searchBgnDe
	 *            the searchBgnDe to set
	 */
	public void setSearchBgnDe(String searchBgnDe) {
		this.searchBgnDe = searchBgnDe;
	}

	/**
	 * searchEndDe attribute를 리턴한다.
	 *
	 * @return the searchEndDe
	 */
	public String getSearchEndDe() {
		return searchEndDe;
	}

	/**
	 * searchEndDe attribute 값을 설정한다.
	 *
	 * @param searchEndDe
	 *            the searchEndDe to set
	 */
	public void setSearchEndDe(String searchEndDe) {
		this.searchEndDe = searchEndDe;
	}
	
	/**
	 * searchCnd attribute를 리턴한다.
	 *
	 * @return the searchCnd
	 */
	public String getSearchCnd() {
		return searchCnd;
	}

	/**
	 * searchCnd attribute 값을 설정한다.
	 *
	 * @param searchCnd
	 *            the searchCnd to set
	 */
	public void setSearchCnd(String searchCnd) {
		this.searchCnd = searchCnd;
	}
	
	/**
	 * searchWrd attribute를 리턴한다.
	 *
	 * @return the searchWrd
	 */
	public String getSearchWrd() {
		return searchWrd;
	}

	/**
	 * searchWrd attribute 값을 설정한다.
	 *
	 * @param searchWrd
	 *            the searchWrd to set
	 */
	public void setSearchWrd(String searchWrd) {
		this.searchWrd = searchWrd;
	}

	/**
	 * searchWrd3 attribute를 리턴한다.
	 *
	 * @return the searchWrd3
	 */
	public String getSearchWrd3() {
		return searchWrd3;
	}

	/**
	 * searchWrd3 attribute 값을 설정한다.
	 *
	 * @param searchWrd3
	 *            the searchWrd3 to set
	 */
	public void setSearchWrd3(String searchWrd3) {
		this.searchWrd3 = searchWrd3;
	}

	/**
	 * searchWrd4 attribute를 리턴한다.
	 *
	 * @return the searchWrd4
	 */
	public String getSearchWrd4() {
		return searchWrd4;
	}

	/**
	 * searchWrd4 attribute 값을 설정한다.
	 *
	 * @param searchWrd4
	 *            the searchWrd4 to set
	 */
	public void setSearchWrd4(String searchWrd4) {
		this.searchWrd4 = searchWrd4;
	}

	/**
	 * searchWrd5 attribute를 리턴한다.
	 *
	 * @return the searchWrd5
	 */
	public String getSearchWrd5() {
		return searchWrd5;
	}

	/**
	 * searchWrd5 attribute 값을 설정한다.
	 *
	 * @param searchWrd5
	 *            the searchWrd5 to set
	 */
	public void setSearchWrd5(String searchWrd5) {
		this.searchWrd5 = searchWrd5;
	}

	/**
	 * searchWrd6 attribute를 리턴한다.
	 *
	 * @return the searchWrd6
	 */
	public String getSearchWrd6() {
		return searchWrd6;
	}

	/**
	 * searchWrd attribute 값을 설정한다.
	 *
	 * @param searchWrd6
	 *            the searchWrd to set
	 */
	public void setSearchWrd6(String searchWrd6) {
		this.searchWrd6 = searchWrd6;
	}

	/**
	 * searchWrd7 attribute를 리턴한다.
	 *
	 * @return the searchWrd7
	 */
	public String getSearchWrd7() {
		return searchWrd7;
	}

	/**
	 * searchWrd7 attribute 값을 설정한다.
	 *
	 * @param searchWrd7
	 *            the searchWrd7 to set
	 */
	public void setSearchWrd7(String searchWrd7) {
		this.searchWrd7 = searchWrd7;
	}

	
	
	/**
	 * sortOrdr attribute를 리턴한다.
	 *
	 * @return the sortOrdr
	 */
	public long getSortOrdr() {
		return sortOrdr;
	}

	/**
	 * sortOrdr attribute 값을 설정한다.
	 *
	 * @param sortOrdr
	 *            the sortOrdr to set
	 */
	public void setSortOrdr(long sortOrdr) {
		this.sortOrdr = sortOrdr;
	}

	/**
	 * channelName attribute를 리턴한다.
	 *
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * channelName attribute 값을 설정한다.
	 *
	 * @param channelName
	 *            the channelName to set
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}	


	/**
	 * countPeer attribute를 리턴한다.
	 *
	 * @return the countPeer
	 */
	public int getCountPeer() {
		return countPeer;
	}

	/**
	 * countPeer attribute 값을 설정한다.
	 *
	 * @param countPeer
	 *            the countPeer to set
	 */
	public void setCountPeer(int countPeer) {
		this.countPeer = countPeer;
	}	
	
	/**
	 * pageIndex attribute를 리턴한다.
	 *
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * pageIndex attribute 값을 설정한다.
	 *
	 * @param pageIndex
	 *            the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * pageUnit attribute를 리턴한다.
	 *
	 * @return the pageUnit
	 */
	public int getPageUnit() {
		return pageUnit;
	}

	/**
	 * pageUnit attribute 값을 설정한다.
	 *
	 * @param pageUnit
	 *            the pageUnit to set
	 */
	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	/**
	 * pageSize attribute를 리턴한다.
	 *
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * pageSize attribute 값을 설정한다.
	 *
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * firstIndex attribute를 리턴한다.
	 *
	 * @return the firstIndex
	 */
	public int getFirstIndex() {
		return firstIndex;
	}

	/**
	 * firstIndex attribute 값을 설정한다.
	 *
	 * @param firstIndex
	 *            the firstIndex to set
	 */
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	/**
	 * lastIndex attribute를 리턴한다.
	 *
	 * @return the lastIndex
	 */
	public int getLastIndex() {
		return lastIndex;
	}

	/**
	 * lastIndex attribute 값을 설정한다.
	 *
	 * @param lastIndex
	 *            the lastIndex to set
	 */
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	/**
	 * recordCountPerPage attribute를 리턴한다.
	 *
	 * @return the recordCountPerPage
	 */
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	/**
	 * recordCountPerPage attribute 값을 설정한다.
	 *
	 * @param recordCountPerPage
	 *            the recordCountPerPage to set
	 */
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	/**
	 * rowNo attribute를 리턴한다.
	 *
	 * @return the rowNo
	 */
	public int getRowNo() {
		return rowNo;
	}

	/**
	 * rowNo attribute 값을 설정한다.
	 *
	 * @param rowNo
	 *            the rowNo to set
	 */
	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}

	/**
	 * live attribute를 리턴한다.
	 *
	 * @return the live
	 */
    public boolean getLive() {
        return live;
    }

	/**
	 * live attribute 값을 설정한다.
	 *
	 * @param live
	 *            the live to set
	 */
    public void setLive(boolean live) {
        this.live = live;
    }
    

	/**
	 * toString 메소드를 대치한다.
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}