package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Dashboard IssueVO를 위한 클래스
 */
public class TransactionVO extends Transaction implements Serializable {

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
	private String searchWrd1 = "";
	
	/** 검색단어 */
	private String searchWrd2 = null ;
	
	/** 검색단어 */
	private String searchWrd21 = null ;
	
	/** 검색단어 */
	private String searchWrd22 = null ;
	
	/** 검색단어 */
	private String searchWrd23 = null ;
	
	/** 검색단어 */
	private String searchWrd24 = null ;
	
	/** 검색단어 */
	private String searchWrd25 = null ;
	
	/** 검색단어 */
	private String searchWrd26 = null ;
	
	/** 검색단어 */
	private String searchWrd27 = null ;
	
	/** 검색단어 */
	private String searchWrd28 = null ;
	
	/** 검색단어 */
	private String searchWrd29 = null ;
	
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
	
	/** 검색단어 */
	private String searchWrd8 = "";	
	
	/** 정렬순서(DESC,ASC) */
	private long sortOrdr = 0L;

	/** 채널명 */
	private String channelName = "";
	
	/** 트랜잭션 총 갯수 */
	private int countTransaction = 0;		
	
	/** 생성자별 총 갯수 */
	private int countCMspId = 0;			
	
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
	
	/** 현재시간 총합계 */
	private int countPerHour = 0;
	
	/** 현재시간 총합계(1시간 전) */
	private int countPerHour1 = 0;
	
	/** 현재시간 총합계(2시간 전) */
	private int countPerHour2 = 0;
	
	/** 현재시간 총합계(3시간 전) */
	private int countPerHour3 = 0;
	
	/** 현재시간 총합계(4시간 전) */
	private int countPerHour4 = 0;

	/** 현재시간 총합계(5시간 전) */
	private int countPerHour5 = 0;
	
	/** 현재시간 총합계(6시간 전) */
	private int countPerHour6 = 0;
	
	/** 현재시간 총합계(7시간 전) */
	private int countPerHour7 = 0;
	
	/** 현재시간 총합계(8시간 전) */
	private int countPerHour8 = 0;
	
	/** 현재시간 총합계(9시간 전) */
	private int countPerHour9 = 0;
	
	/** 현재시간 총합계(10시간 전) */
	private int countPerHour10 = 0;
	
	/** 현재시간 총합계(11시간 전) */
	private int countPerHour11 = 0;
	
	/** 현재시간 총합계(12시간 전) */
	private int countPerHour12 = 0;

	/** 현재시간 총합계(13시간 전) */
	private int countPerHour13 = 0;
	
	/** 현재시간 총합계(14시간 전) */
	private int countPerHour14 = 0;
	
	/** 현재시간 총합계(15시간 전) */
	private int countPerHour15 = 0;
	
	/** 현재시간 총합계(16시간 전) */
	private int countPerHour16 = 0;
	
	/** 현재시간 총합계(17시간 전) */
	private int countPerHour17 = 0;
	
	/** 현재시간 총합계(18시간 전) */
	private int countPerHour18 = 0;
	
	/** 현재시간 총합계(19시간 전) */
	private int countPerHour19 = 0;
	
	/** 현재시간 총합계(20시간 전) */
	private int countPerHour20 = 0;
	
	/** 현재시간 총합계(21시간 전) */
	private int countPerHour21 = 0;
	
	/** 현재시간 총합계(22시간 전) */
	private int countPerHour22 = 0;

	/** 현재시간 총합계(23시간 전) */
	private int countPerHour23 = 0;
	
	/** 현재시간 총합계(24시간 전) */
	private int countPerHour24 = 0;
	
	/** 현재시간 */
	private String curHour = "";

	/** 현재시간(1시간 전) */
	private String curHour1 = "";
	
	/** 현재시간(2시간 전) */
	private String curHour2 = "";
	
	/** 현재시간(3시간 전) */
	private String curHour3 = "";
	
	/** 현재시간(4시간 전) */
	private String curHour4 = "";
	
	/** 현재시간(5시간 전) */
	private String curHour5 = "";
	
	/** 현재시간(6시간 전) */
	private String curHour6 = "";
	
	/** 현재시간(7시간 전) */
	private String curHour7 = "";
	
	/** 현재시간(8시간 전) */
	private String curHour8 = "";
	
	/** 현재시간(9시간 전) */
	private String curHour9 = "";
	
	/** 현재시간(10시간 전) */
	private String curHour10 = "";
		
	/** 현재시간(11시간 전) */
	private String curHour11 = "";
	
	/** 현재시간(12시간 전) */
	private String curHour12 = "";
	
	/** 현재시간(13시간 전) */
	private String curHour13 = "";
	
	/** 현재시간(14시간 전) */
	private String curHour14 = "";
	
	/** 현재시간(15시간 전) */
	private String curHour15 = "";
	
	/** 현재시간(16시간 전) */
	private String curHour16 = "";
	
	/** 현재시간(17시간 전) */
	private String curHour17 = "";
	
	/** 현재시간(18시간 전) */
	private String curHour18 = "";
	
	/** 현재시간(19시간 전) */
	private String curHour19 = "";
	
	/** 현재시간(20시간 전) */
	private String curHour20 = "";
	
	/** 현재시간(21시간 전) */
	private String curHour21 = "";
	
	/** 현재시간(22시간 전) */
	private String curHour22 = "";
	
	/** 현재시간(23시간 전) */
	private String curHour23 = "";
	
	/** 현재시간(24시간 전) */
	private String curHour24 = "";
	
	/** 현재분 총합계 */
	private int countPerMin = 0;
	
	/** 현재분 총합계(1분 전) */
	private int countPerMin1 = 0;
	
	/** 현재분 총합계(2분 전) */
	private int countPerMin2 = 0;
	
	/** 현재분 총합계(3분 전) */
	private int countPerMin3 = 0;
	
	/** 현재분 총합계(4분 전) */
	private int countPerMin4 = 0;
	
	/** 현재분 총합계(5분 전) */
	private int countPerMin5 = 0;
	
	/** 현재분 총합계(6분 전) */
	private int countPerMin6 = 0;
	
	/** 현재분 총합계(7분 전) */
	private int countPerMin7 = 0;
	
	/** 현재분 총합계(8분 전) */
	private int countPerMin8 = 0;
	
	/** 현재분 총합계(9분 전) */
	private int countPerMin9 = 0;
	
	/** 현재분 총합계(10분 전) */
	private int countPerMin10 = 0;
	
	/** 현재분 총합계(11분 전) */
	private int countPerMin11 = 0;
	
	/** 현재분 총합계(12분 전) */
	private int countPerMin12 = 0;
	
	/** 현재분 총합계(13분 전) */
	private int countPerMin13 = 0;
	
	/** 현재분 총합계(14분 전) */
	private int countPerMin14 = 0;
	
	/** 현재분 총합계(15분 전) */
	private int countPerMin15 = 0;
	
	/** 현재분 총합계(16분 전) */
	private int countPerMin16 = 0;
	
	/** 현재분 총합계(17분 전) */
	private int countPerMin17 = 0;
	
	/** 현재분 총합계(18분 전) */
	private int countPerMin18 = 0;
	
	/** 현재분 총합계(19분 전) */
	private int countPerMin19 = 0;
	
	/** 현재분 총합계(20분 전) */
	private int countPerMin20 = 0;
	
	/** 현재분 총합계(21분 전) */
	private int countPerMin21 = 0;
	
	/** 현재분 총합계(22분 전) */
	private int countPerMin22 = 0;
	
	/** 현재분 총합계(23분 전) */
	private int countPerMin23 = 0;
	
	/** 현재분 총합계(24분 전) */
	private int countPerMin24 = 0;
	
	/** 현재분 총합계(25분 전) */
	private int countPerMin25 = 0;
	
	/** 현재분 총합계(26분 전) */
	private int countPerMin26 = 0;
	
	/** 현재분 총합계(27분 전) */
	private int countPerMin27 = 0;
	
	/** 현재분 총합계(28분 전) */
	private int countPerMin28 = 0;
	
	/** 현재분 총합계(29분 전) */
	private int countPerMin29 = 0;
	
	/** 현재분 총합계(30분 전) */
	private int countPerMin30 = 0;
	
	/** 현재분 총합계(31분 전) */
	private int countPerMin31 = 0;
	
	/** 현재분 총합계(32분 전) */
	private int countPerMin32 = 0;
	
	/** 현재분 총합계(33분 전) */
	private int countPerMin33 = 0;
	
	/** 현재분 총합계(34분 전) */
	private int countPerMin34 = 0;
	
	/** 현재분 총합계(35분 전) */
	private int countPerMin35 = 0;
	
	/** 현재분 총합계(36분 전) */
	private int countPerMin36 = 0;
	
	/** 현재분 총합계(37분 전) */
	private int countPerMin37 = 0;
	
	/** 현재분 총합계(38분 전) */
	private int countPerMin38 = 0;
	
	/** 현재분 총합계(39분 전) */
	private int countPerMin39 = 0;
	
	/** 현재분 총합계(40분 전) */
	private int countPerMin40 = 0;
	
	/** 현재분 총합계(41분 전) */
	private int countPerMin41 = 0;
	
	/** 현재분 총합계(42분 전) */
	private int countPerMin42 = 0;
	
	/** 현재분 총합계(43분 전) */
	private int countPerMin43 = 0;
	
	/** 현재분 총합계(44분 전) */
	private int countPerMin44 = 0;
	
	/** 현재분 총합계(45분 전) */
	private int countPerMin45 = 0;
	
	/** 현재분 총합계(46분 전) */
	private int countPerMin46 = 0;
	
	/** 현재분 총합계(47분 전) */
	private int countPerMin47 = 0;
	
	/** 현재분 총합계(48분 전) */
	private int countPerMin48 = 0;	
	
	/** 현재분 총합계(49분 전) */
	private int countPerMin49 = 0;
	
	/** 현재분 총합계(50분 전) */
	private int countPerMin50 = 0;	
	
	/** 현재분 총합계(51분 전) */
	private int countPerMin51 = 0;
	
	/** 현재분 총합계(52분 전) */
	private int countPerMin52 = 0;
	
	/** 현재분 총합계(53분 전) */
	private int countPerMin53 = 0;
	
	/** 현재분 총합계(54분 전) */
	private int countPerMin54 = 0;
	
	/** 현재분 총합계(55분 전) */
	private int countPerMin55 = 0;
	
	/** 현재분 총합계(56분 전) */
	private int countPerMin56 = 0;
	
	/** 현재분 총합계(57분 전) */
	private int countPerMin57 = 0;
	
	/** 현재분 총합계(58분 전) */
	private int countPerMin58 = 0;	
	
	/** 현재분 총합계(59분 전) */
	private int countPerMin59 = 0;
	
	
	/** 현재분 */
	private String curMin = "";
	
	/** 현재분(1분 전) */
	private String curMin1 = "";
	
	/** 현재분(2분 전) */
	private String curMin2 = "";
	
	/** 현재분(3분 전) */
	private String curMin3 = "";
	
	/** 현재분(4분 전) */
	private String curMin4 = "";
	
	/** 현재분(5분 전) */
	private String curMin5 = "";
	
	/** 현재분(6분 전) */
	private String curMin6 = "";
	
	/** 현재분(7분 전) */
	private String curMin7 = "";
	
	/** 현재분(8분 전) */
	private String curMin8 = "";
	
	/** 현재분(9분 전) */
	private String curMin9 = "";
	
	/** 현재분(10분 전) */
	private String curMin10 = "";
		
	/** 현재분(11분 전) */
	private String curMin11 = "";
	
	/** 현재분(12분 전) */
	private String curMin12 = "";
	
	/** 현재분(13분 전) */
	private String curMin13 = "";
	
	/** 현재분(14분 전) */
	private String curMin14 = "";
	
	/** 현재분(15분 전) */
	private String curMin15 = "";
	
	/** 현재분(16분 전) */
	private String curMin16 = "";
	
	/** 현재분(17분 전) */
	private String curMin17 = "";
	
	/** 현재분(18분 전) */
	private String curMin18 = "";
	
	/** 현재분(19분 전) */
	private String curMin19 = "";
	
	/** 현재분(20분 전) */
	private String curMin20 = "";
	
	/** 현재분(21분 전) */
	private String curMin21 = "";
	
	/** 현재분(22분 전) */
	private String curMin22 = "";
	
	/** 현재분(23분 전) */
	private String curMin23 = "";
	
	/** 현재분(24분 전) */
	private String curMin24 = "";
	
	/** 현재분(25분 전) */
	private String curMin25 = "";
	
	/** 현재분(26분 전) */
	private String curMin26 = "";
	
	/** 현재분(27분 전) */
	private String curMin27 = "";
	
	/** 현재분(28분 전) */
	private String curMin28 = "";
	
	/** 현재분(29분 전) */
	private String curMin29 = "";
	
	/** 현재분(30분 전) */
	private String curMin30 = "";
	
	/** 현재분(31분 전) */
	private String curMin31 = "";
	
	/** 현재분(32분 전) */
	private String curMin32 = "";
	
	/** 현재분(33분 전) */
	private String curMin33 = "";
	
	/** 현재분(34분 전) */
	private String curMin34 = "";
	
	/** 현재분(35분 전) */
	private String curMin35 = "";
	
	/** 현재분(36분 전) */
	private String curMin36 = "";
	
	/** 현재분(37분 전) */
	private String curMin37 = "";
	
	/** 현재분(38분 전) */
	private String curMin38 = "";
	
	/** 현재분(39분 전) */
	private String curMin39 = "";
	
	/** 현재분(40분 전) */
	private String curMin40 = "";
	
	/** 현재분(41분 전) */
	private String curMin41 = "";
	
	/** 현재분(42분 전) */
	private String curMin42 = "";
	
	/** 현재분(43분 전) */
	private String curMin43 = "";
	
	/** 현재분(44분 전) */
	private String curMin44 = "";
	
	/** 현재분(45분 전) */
	private String curMin45 = "";
	
	/** 현재분(46분 전) */
	private String curMin46 = "";
	
	/** 현재분(47분 전) */
	private String curMin47 = "";
	
	/** 현재분(48분 전) */
	private String curMin48 = "";
	
	/** 현재분(49분 전) */
	private String curMin49 = "";
	
	/** 현재분(50분 전) */
	private String curMin50 = "";
	
	/** 현재분(51분 전) */
	private String curMin51 = "";
	
	/** 현재분(52분 전) */
	private String curMin52 = "";
	
	/** 현재분(53분 전) */
	private String curMin53 = "";
	
	/** 현재분(54분 전) */
	private String curMin54 = "";
	
	/** 현재분(55분 전) */
	private String curMin55 = "";
	
	/** 현재분(56분 전) */
	private String curMin56 = "";
	
	/** 현재분(57분 전) */
	private String curMin57 = "";
	
	/** 현재분(58분 전) */
	private String curMin58 = "";
	
	/** 현재분(59분 전) */
	private String curMin59 = "";

    private String readSet; // JSON 형식의 데이터를 담을 수 있는 String 타입
    private String writeSet; // JSON 형식의 데이터를 담을 수 있는 String 타입

    public String getReadSet() {
        return readSet;
    }
    public void setReadSet(String readSet) {
        this.readSet = readSet;
    }
    public String getWriteSet() {
        return writeSet;
    }
    public void setWriteSet(String writeSet) {
        this.writeSet = writeSet;
    }
    
    
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
	 * searchWrd1 attribute를 리턴한다.
	 *
	 * @return the searchWrd1
	 */
	public String getSearchWrd1() {
		return searchWrd1;
	}

	/**
	 * searchWrd1 attribute 값을 설정한다.
	 *
	 * @param searchWrd1
	 *            the searchWrd1 to set
	 */
	public void setSearchWrd1(String searchWrd1) {
		this.searchWrd1 = searchWrd1;
	}

	/**
	 * searchWrd2 attribute를 리턴한다.
	 *
	 * @return the searchWrd2
	 */
	public String getSearchWrd2() {
		return searchWrd2;
	}

	/**
	 * searchWrd2 attribute 값을 설정한다.
	 *
	 * @param searchWrd2
	 *            the searchWrd2 to set
	 */
	public void setSearchWrd2(String searchWrd2) {
		this.searchWrd2 = searchWrd2;
	}

	/**
	 * searchWrd21 attribute를 리턴한다.
	 *
	 * @return the searchWrd21
	 */
	public String getSearchWrd21() {
		return searchWrd21;
	}

	/**
	 * searchWrd21 attribute 값을 설정한다.
	 *
	 * @param searchWrd21
	 *            the searchWrd21 to set
	 */
	public void setSearchWrd21(String searchWrd21) {
		this.searchWrd21 = searchWrd21;
	}

	
	/**
	 * searchWrd22 attribute를 리턴한다.
	 *
	 * @return the searchWrd22
	 */
	public String getSearchWrd22() {
		return searchWrd22;
	}

	/**
	 * searchWrd22 attribute 값을 설정한다.
	 *
	 * @param searchWrd22
	 *            the searchWrd22 to set
	 */
	public void setSearchWrd22(String searchWrd22) {
		this.searchWrd22 = searchWrd22;
	}

	
	/**
	 * searchWrd23 attribute를 리턴한다.
	 *
	 * @return the searchWrd23
	 */
	public String getSearchWrd23() {
		return searchWrd23;
	}

	/**
	 * searchWrd23 attribute 값을 설정한다.
	 *
	 * @param searchWrd23
	 *            the searchWrd23 to set
	 */
	public void setSearchWrd23(String searchWrd23) {
		this.searchWrd23 = searchWrd23;
	}

	
	/**
	 * searchWrd24 attribute를 리턴한다.
	 *
	 * @return the searchWrd24
	 */
	public String getSearchWrd24() {
		return searchWrd24;
	}

	/**
	 * searchWrd24 attribute 값을 설정한다.
	 *
	 * @param searchWrd24
	 *            the searchWrd24 to set
	 */
	public void setSearchWrd24(String searchWrd24) {
		this.searchWrd24 = searchWrd24;
	}

	
	/**
	 * searchWrd25 attribute를 리턴한다.
	 *
	 * @return the searchWrd25
	 */
	public String getSearchWrd25() {
		return searchWrd25;
	}

	/**
	 * searchWrd25 attribute 값을 설정한다.
	 *
	 * @param searchWrd25
	 *            the searchWrd25 to set
	 */
	public void setSearchWrd25(String searchWrd25) {
		this.searchWrd25 = searchWrd25;
	}

	
	/**
	 * searchWrd26 attribute를 리턴한다.
	 *
	 * @return the searchWrd26
	 */
	public String getSearchWrd26() {
		return searchWrd26;
	}

	/**
	 * searchWrd26 attribute 값을 설정한다.
	 *
	 * @param searchWrd26
	 *            the searchWrd26 to set
	 */
	public void setSearchWrd26(String searchWrd26) {
		this.searchWrd26 = searchWrd26;
	}

	
	/**
	 * searchWrd27 attribute를 리턴한다.
	 *
	 * @return the searchWrd27
	 */
	public String getSearchWrd27() {
		return searchWrd27;
	}

	/**
	 * searchWrd27 attribute 값을 설정한다.
	 *
	 * @param searchWrd27
	 *            the searchWrd27 to set
	 */
	public void setSearchWrd27(String searchWrd27) {
		this.searchWrd27 = searchWrd27;
	}

	
	/**
	 * searchWrd28 attribute를 리턴한다.
	 *
	 * @return the searchWrd28
	 */
	public String getSearchWrd28() {
		return searchWrd28;
	}

	/**
	 * searchWrd28 attribute 값을 설정한다.
	 *
	 * @param searchWrd28
	 *            the searchWrd28 to set
	 */
	public void setSearchWrd28(String searchWrd28) {
		this.searchWrd28 = searchWrd28;
	}

	
	/**
	 * searchWrd29 attribute를 리턴한다.
	 *
	 * @return the searchWrd29
	 */
	public String getSearchWrd29() {
		return searchWrd29;
	}

	/**
	 * searchWrd29 attribute 값을 설정한다.
	 *
	 * @param searchWrd29
	 *            the searchWrd29 to set
	 */
	public void setSearchWrd29(String searchWrd29) {
		this.searchWrd29 = searchWrd29;
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
	 * searchWrd8 attribute를 리턴한다.
	 *
	 * @return the searchWrd8
	 */
	public String getSearchWrd8() {
		return searchWrd8;
	}

	/**
	 * searchWrd8 attribute 값을 설정한다.
	 *
	 * @param searchWrd8
	 *            the searchWrd to set
	 */
	public void setSearchWrd8(String searchWrd8) {
		this.searchWrd8 = searchWrd8;
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
	 * countTransaction attribute를 리턴한다.
	 *
	 * @return the countTransaction
	 */
	public int getCountTransaction() {
		return countTransaction;
	}

	/**
	 * countTransaction attribute 값을 설정한다.
	 *
	 * @param countTransaction
	 *            the countTransaction to set
	 */
	public void setCountTransaction(int countTransaction) {
		this.countTransaction = countTransaction;
	}	
	
	/**
	 * countCMspId attribute를 리턴한다.
	 *
	 * @return the countCMspId
	 */
	public int getCountCMspId() {
		return countCMspId;
	}

	/**
	 * countCMspId attribute 값을 설정한다.
	 *
	 * @param countCMspId
	 *            the countCMspId to set
	 */
	public void setCountCMspId(int countCMspId) {
		this.countCMspId = countCMspId;
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
	 * countPerHour attribute를 리턴한다.
	 *
	 * @return the countPerHour
	 */
	public int getCountPerHour() {
		return countPerHour;
	}

	/**
	 * countPerHour attribute 값을 설정한다.
	 *
	 * @param countPerHour
	 *            the countPerHour to set
	 */
	public void setCountPerHour(int countPerHour) {
		this.countPerHour = countPerHour;
	}
	
	/**
	 * countPerHour1 attribute를 리턴한다.
	 *
	 * @return the countPerHour1
	 */
	public int getCountPerHour1() {
		return countPerHour1;
	}

	/**
	 * countPerHour1 attribute 값을 설정한다.
	 *
	 * @param countPerHour1
	 *            the countPerHour1 to set
	 */
	public void setCountPerHour1(int countPerHour1) {
		this.countPerHour1 = countPerHour1;
	}
	
	/**
	 * countPerHour2 attribute를 리턴한다.
	 *
	 * @return the countPerHour2
	 */
	public int getCountPerHour2() {
		return countPerHour2;
	}

	/**
	 * countPerHour2 attribute 값을 설정한다.
	 *
	 * @param countPerHour2
	 *            the countPerHour2 to set
	 */
	public void setCountPerHour2(int countPerHour2) {
		this.countPerHour2 = countPerHour2;
	}	
	
	/**
	 * countPerHour3 attribute를 리턴한다.
	 *
	 * @return the countPerHour3
	 */
	public int getCountPerHour3() {
		return countPerHour3;
	}

	/**
	 * countPerHour3 attribute 값을 설정한다.
	 *
	 * @param countPerHour3
	 *            the countPerHour3 to set
	 */
	public void setCountPerHour3(int countPerHour3) {
		this.countPerHour3 = countPerHour3;
	}	
	
	
	/**
	 * countPerHour4 attribute를 리턴한다.
	 *
	 * @return the countPerHour4
	 */
	public int getCountPerHour4() {
		return countPerHour4;
	}

	/**
	 * countPerHour4 attribute 값을 설정한다.
	 *
	 * @param countPerHour4
	 *            the countPerHour4 to set
	 */
	public void setCountPerHour4(int countPerHour4) {
		this.countPerHour4 = countPerHour4;
	}	
	
	
	/**
	 * countPerHour5 attribute를 리턴한다.
	 *
	 * @return the countPerHour5
	 */
	public int getCountPerHour5() {
		return countPerHour5;
	}

	/**
	 * countPerHour5 attribute 값을 설정한다.
	 *
	 * @param countPerHour5
	 *            the countPerHour5 to set
	 */
	public void setCountPerHour5(int countPerHour5) {
		this.countPerHour5 = countPerHour5;
	}	
	
	
	/**
	 * countPerHour6 attribute를 리턴한다.
	 *
	 * @return the countPerHour6
	 */
	public int getCountPerHour6() {
		return countPerHour6;
	}

	/**
	 * countPerHour6 attribute 값을 설정한다.
	 *
	 * @param countPerHour6
	 *            the countPerHour6 to set
	 */
	public void setCountPerHour6(int countPerHour6) {
		this.countPerHour6 = countPerHour6;
	}	
	
	
	/**
	 * countPerHour7 attribute를 리턴한다.
	 *
	 * @return the countPerHour7
	 */
	public int getCountPerHour7() {
		return countPerHour7;
	}

	/**
	 * countPerHour7 attribute 값을 설정한다.
	 *
	 * @param countPerHour7
	 *            the countPerHour7 to set
	 */
	public void setCountPerHour7(int countPerHour7) {
		this.countPerHour7 = countPerHour7;
	}	
	
	
	/**
	 * countPerHour8 attribute를 리턴한다.
	 *
	 * @return the countPerHour8
	 */
	public int getCountPerHour8() {
		return countPerHour8;
	}

	/**
	 * countPerHour8 attribute 값을 설정한다.
	 *
	 * @param countPerHour8
	 *            the countPerHour8 to set
	 */
	public void setCountPerHour8(int countPerHour8) {
		this.countPerHour8 = countPerHour8;
	}	
	
	
	/**
	 * countPerHour9 attribute를 리턴한다.
	 *
	 * @return the countPerHour9
	 */
	public int getCountPerHour9() {
		return countPerHour9;
	}

	/**
	 * countPerHour9 attribute 값을 설정한다.
	 *
	 * @param countPerHour9
	 *            the countPerHour9 to set
	 */
	public void setCountPerHour9(int countPerHour9) {
		this.countPerHour9 = countPerHour9;
	}	
	
	
	/**
	 * countPerHour10 attribute를 리턴한다.
	 *
	 * @return the countPerHour10
	 */
	public int getCountPerHour10() {
		return countPerHour10;
	}

	/**
	 * countPerHour10 attribute 값을 설정한다.
	 *
	 * @param countPerHour10
	 *            the countPerHour10 to set
	 */
	public void setCountPerHour10(int countPerHour10) {
		this.countPerHour10 = countPerHour10;
	}	

	/**
	 * countPerHour11 attribute를 리턴한다.
	 *
	 * @return the countPerHour11
	 */
	public int getCountPerHour11() {
		return countPerHour11;
	}

	/**
	 * countPerHour11 attribute 값을 설정한다.
	 *
	 * @param countPerHour11
	 *            the countPerHour11 to set
	 */
	public void setCountPerHour11(int countPerHour11) {
		this.countPerHour11 = countPerHour11;
	}
	
	/**
	 * countPerHour12 attribute를 리턴한다.
	 *
	 * @return the countPerHour12
	 */
	public int getCountPerHour12() {
		return countPerHour12;
	}

	/**
	 * countPerHour12 attribute 값을 설정한다.
	 *
	 * @param countPerHour12
	 *            the countPerHour12 to set
	 */
	public void setCountPerHour12(int countPerHour12) {
		this.countPerHour12 = countPerHour12;
	}	
	
	/**
	 * countPerHour13 attribute를 리턴한다.
	 *
	 * @return the countPerHour13
	 */
	public int getCountPerHour13() {
		return countPerHour13;
	}

	/**
	 * countPerHour13 attribute 값을 설정한다.
	 *
	 * @param countPerHour13
	 *            the countPerHour13 to set
	 */
	public void setCountPerHour13(int countPerHour13) {
		this.countPerHour13 = countPerHour13;
	}	
	
	
	/**
	 * countPerHour14 attribute를 리턴한다.
	 *
	 * @return the countPerHour14
	 */
	public int getCountPerHour14() {
		return countPerHour14;
	}

	/**
	 * countPerHour14 attribute 값을 설정한다.
	 *
	 * @param countPerHour14
	 *            the countPerHour14 to set
	 */
	public void setCountPerHour14(int countPerHour14) {
		this.countPerHour14 = countPerHour14;
	}	
	
	
	/**
	 * countPerHour15 attribute를 리턴한다.
	 *
	 * @return the countPerHour15
	 */
	public int getCountPerHour15() {
		return countPerHour15;
	}

	/**
	 * countPerHour15 attribute 값을 설정한다.
	 *
	 * @param countPerHour15
	 *            the countPerHour15 to set
	 */
	public void setCountPerHour15(int countPerHour15) {
		this.countPerHour15 = countPerHour15;
	}	
	
	
	/**
	 * countPerHour16 attribute를 리턴한다.
	 *
	 * @return the countPerHour16
	 */
	public int getCountPerHour16() {
		return countPerHour16;
	}

	/**
	 * countPerHour16 attribute 값을 설정한다.
	 *
	 * @param countPerHour16
	 *            the countPerHour16 to set
	 */
	public void setCountPerHour16(int countPerHour16) {
		this.countPerHour16 = countPerHour16;
	}	
	
	
	/**
	 * countPerHour17 attribute를 리턴한다.
	 *
	 * @return the countPerHour17
	 */
	public int getCountPerHour17() {
		return countPerHour17;
	}

	/**
	 * countPerHour17 attribute 값을 설정한다.
	 *
	 * @param countPerHour17
	 *            the countPerHour17 to set
	 */
	public void setCountPerHour17(int countPerHour17) {
		this.countPerHour17 = countPerHour17;
	}	
	
	
	/**
	 * countPerHour18 attribute를 리턴한다.
	 *
	 * @return the countPerHour18
	 */
	public int getCountPerHour18() {
		return countPerHour18;
	}

	/**
	 * countPerHour18 attribute 값을 설정한다.
	 *
	 * @param countPerHour18
	 *            the countPerHour18 to set
	 */
	public void setCountPerHour18(int countPerHour18) {
		this.countPerHour18 = countPerHour18;
	}	
	
	
	/**
	 * countPerHour19 attribute를 리턴한다.
	 *
	 * @return the countPerHour19
	 */
	public int getCountPerHour19() {
		return countPerHour19;
	}

	/**
	 * countPerHour19 attribute 값을 설정한다.
	 *
	 * @param countPerHour19
	 *            the countPerHour19 to set
	 */
	public void setCountPerHour19(int countPerHour19) {
		this.countPerHour19 = countPerHour19;
	}	
		
	/**
	 * countPerHour20 attribute를 리턴한다.
	 *
	 * @return the countPerHour20
	 */
	public int getCountPerHour20() {
		return countPerHour20;
	}

	/**
	 * countPerHour20 attribute 값을 설정한다.
	 *
	 * @param countPerHour20
	 *            the countPerHour20 to set
	 */
	public void setCountPerHour20(int countPerHour20) {
		this.countPerHour20 = countPerHour20;
	}
	
	/**
	 * countPerHour21 attribute를 리턴한다.
	 *
	 * @return the countPerHour21
	 */
	public int getCountPerHour21() {
		return countPerHour21;
	}

	/**
	 * countPerHour21 attribute 값을 설정한다.
	 *
	 * @param countPerHour21
	 *            the countPerHour21 to set
	 */
	public void setCountPerHour21(int countPerHour21) {
		this.countPerHour21 = countPerHour21;
	}
	
	/**
	 * countPerHour22 attribute를 리턴한다.
	 *
	 * @return the countPerHour22
	 */
	public int getCountPerHour22() {
		return countPerHour22;
	}

	/**
	 * countPerHour22 attribute 값을 설정한다.
	 *
	 * @param countPerHour22
	 *            the countPerHour22 to set
	 */
	public void setCountPerHour22(int countPerHour22) {
		this.countPerHour22 = countPerHour22;
	}	
	
	/**
	 * countPerHour23 attribute를 리턴한다.
	 *
	 * @return the countPerHour23
	 */
	public int getCountPerHour23() {
		return countPerHour23;
	}

	/**
	 * countPerHour23 attribute 값을 설정한다.
	 *
	 * @param countPerHour23
	 *            the countPerHour13 to set
	 */
	public void setCountPerHour23(int countPerHour23) {
		this.countPerHour23 = countPerHour23;
	}
	
	/**
	 * countPerHour24 attribute를 리턴한다.
	 *
	 * @return the countPerHour24
	 */
	public int getCountPerHour24() {
		return countPerHour24;
	}

	/**
	 * countPerHour24 attribute 값을 설정한다.
	 *
	 * @param countPerHour24
	 *            the countPerHour24 to set
	 */
	public void setCountPerHour24(int countPerHour24) {
		this.countPerHour24 = countPerHour24;
	}	
		
	/**
	 * curHour attribute를 리턴한다.
	 *
	 * @return the curHour
	 */
	public String getCurHour() {
		return curHour;
	}

	/**
	 * curHour attribute 값을 설정한다.
	 *
	 * @param curHour
	 *            the curHour to set
	 */
	public void setCurHour(String curHour) {
		this.curHour = curHour;
	}
	
	/**
	 * curHour1 attribute를 리턴한다.
	 *
	 * @return the curHour1
	 */
	public String getCurHour1() {
		return curHour1;
	}

	/**
	 * curHour1 attribute 값을 설정한다.
	 *
	 * @param curHour1
	 *            the curHour1 to set
	 */
	public void setCurHour1(String curHour1) {
		this.curHour1 = curHour1;
	}
	
	/**
	 * curHour2 attribute를 리턴한다.
	 *
	 * @return the curHour2
	 */
	public String getCurHour2() {
		return curHour2;
	}

	/**
	 * curHour2 attribute 값을 설정한다.
	 *
	 * @param curHour2
	 *            the curHour2 to set
	 */
	public void setCurHour2(String curHour2) {
		this.curHour2 = curHour2;
	}	
	
	/**
	 * curHour3 attribute를 리턴한다.
	 *
	 * @return the curHour3
	 */
	public String getCurHour3() {
		return curHour3;
	}

	/**
	 * curHour3 attribute 값을 설정한다.
	 *
	 * @param curHour3
	 *            the curHour3 to set
	 */
	public void setCurHour3(String curHour3) {
		this.curHour3 = curHour3;
	}

	/**
	 * curHour4 attribute를 리턴한다.
	 *
	 * @return the curHour4
	 */
	public String getCurHour4() {
		return curHour4;
	}

	/**
	 * curHour4 attribute 값을 설정한다.
	 *
	 * @param curHour4
	 *            the curHour4 to set
	 */
	public void setCurHour4(String curHour4) {
		this.curHour4 = curHour4;
	}
	
	/**
	 * curHour5 attribute를 리턴한다.
	 *
	 * @return the curHour5
	 */
	public String getCurHour5() {
		return curHour5;
	}

	/**
	 * curHour5 attribute 값을 설정한다.
	 *
	 * @param curHour5
	 *            the curHour5 to set
	 */
	public void setCurHour5(String curHour5) {
		this.curHour5 = curHour5;
	}
	
	/**
	 * curHour6 attribute를 리턴한다.
	 *
	 * @return the curHour6
	 */
	public String getCurHour6() {
		return curHour6;
	}

	/**
	 * curHour6 attribute 값을 설정한다.
	 *
	 * @param curHour6
	 *            the curHour6 to set
	 */
	public void setCurHour6(String curHour6) {
		this.curHour6 = curHour6;
	}
	
	/**
	 * curHour7 attribute를 리턴한다.
	 *
	 * @return the curHour7
	 */
	public String getCurHour7() {
		return curHour7;
	}

	/**
	 * curHour7 attribute 값을 설정한다.
	 *
	 * @param curHour7
	 *            the curHour7 to set
	 */
	public void setCurHour7(String curHour7) {
		this.curHour7 = curHour7;
	}
	
	/**
	 * curHour8 attribute를 리턴한다.
	 *
	 * @return the curHour8
	 */
	public String getCurHour8() {
		return curHour8;
	}

	/**
	 * curHour8 attribute 값을 설정한다.
	 *
	 * @param curHour8
	 *            the curHour8 to set
	 */
	public void setCurHour8(String curHour8) {
		this.curHour8 = curHour8;
	}
	
	/**
	 * curHour9 attribute를 리턴한다.
	 *
	 * @return the curHour9
	 */
	public String getCurHour9() {
		return curHour9;
	}

	/**
	 * curHour9 attribute 값을 설정한다.
	 *
	 * @param curHour9
	 *            the curHour9 to set
	 */
	public void setCurHour9(String curHour9) {
		this.curHour9 = curHour9;
	}
	
	/**
	 * curHour10 attribute를 리턴한다.
	 *
	 * @return the curHour10
	 */
	public String getCurHour10() {
		return curHour10;
	}

	/**
	 * curHour10 attribute 값을 설정한다.
	 *
	 * @param curHour10
	 *            the curHour10 to set
	 */
	public void setCurHour10(String curHour10) {
		this.curHour10 = curHour10;
	}
	
	/**
	 * curHour11 attribute를 리턴한다.
	 *
	 * @return the curHour11
	 */
	public String getCurHour11() {
		return curHour11;
	}

	/**
	 * curHour11 attribute 값을 설정한다.
	 *
	 * @param curHour11
	 *            the curHour11 to set
	 */
	public void setCurHour11(String curHour11) {
		this.curHour11 = curHour11;
	}
	
	/**
	 * curHour12 attribute를 리턴한다.
	 *
	 * @return the curHour12
	 */
	public String getCurHour12() {
		return curHour12;
	}

	/**
	 * curHour12 attribute 값을 설정한다.
	 *
	 * @param curHour12
	 *            the curHour12 to set
	 */
	public void setCurHour12(String curHour12) {
		this.curHour12 = curHour12;
	}	
	
	/**
	 * curHour13 attribute를 리턴한다.
	 *
	 * @return the curHour13
	 */
	public String getCurHour13() {
		return curHour13;
	}

	/**
	 * curHour13 attribute 값을 설정한다.
	 *
	 * @param curHour13
	 *            the curHour13 to set
	 */
	public void setCurHour13(String curHour13) {
		this.curHour13 = curHour13;
	}

	/**
	 * curHour14 attribute를 리턴한다.
	 *
	 * @return the curHour14
	 */
	public String getCurHour14() {
		return curHour14;
	}

	/**
	 * curHour14 attribute 값을 설정한다.
	 *
	 * @param curHour14
	 *            the curHour14 to set
	 */
	public void setCurHour14(String curHour14) {
		this.curHour14 = curHour14;
	}
	
	/**
	 * curHour15 attribute를 리턴한다.
	 *
	 * @return the curHour15
	 */
	public String getCurHour15() {
		return curHour15;
	}

	/**
	 * curHour15 attribute 값을 설정한다.
	 *
	 * @param curHour15
	 *            the curHour15 to set
	 */
	public void setCurHour15(String curHour15) {
		this.curHour15 = curHour15;
	}
	
	/**
	 * curHour16 attribute를 리턴한다.
	 *
	 * @return the curHour16
	 */
	public String getCurHour16() {
		return curHour16;
	}

	/**
	 * curHour16 attribute 값을 설정한다.
	 *
	 * @param curHour16
	 *            the curHour16 to set
	 */
	public void setCurHour16(String curHour16) {
		this.curHour16 = curHour16;
	}
	
	/**
	 * curHour17 attribute를 리턴한다.
	 *
	 * @return the curHour17
	 */
	public String getCurHour17() {
		return curHour17;
	}

	/**
	 * curHour17 attribute 값을 설정한다.
	 *
	 * @param curHour17
	 *            the curHour17 to set
	 */
	public void setCurHour17(String curHour17) {
		this.curHour17 = curHour17;
	}
	
	/**
	 * curHour18 attribute를 리턴한다.
	 *
	 * @return the curHour18
	 */
	public String getCurHour18() {
		return curHour18;
	}

	/**
	 * curHour18 attribute 값을 설정한다.
	 *
	 * @param curHour18
	 *            the curHour18 to set
	 */
	public void setCurHour18(String curHour18) {
		this.curHour18 = curHour18;
	}
	
	/**
	 * curHour19 attribute를 리턴한다.
	 *
	 * @return the curHour19
	 */
	public String getCurHour19() {
		return curHour19;
	}

	/**
	 * curHour19 attribute 값을 설정한다.
	 *
	 * @param curHour19
	 *            the curHour19 to set
	 */
	public void setCurHour19(String curHour19) {
		this.curHour19 = curHour19;
	}
	
	/**
	 * curHour20 attribute를 리턴한다.
	 *
	 * @return the curHour20
	 */
	public String getCurHour20() {
		return curHour20;
	}

	/**
	 * curHour20 attribute 값을 설정한다.
	 *
	 * @param curHour20
	 *            the curHour20 to set
	 */
	public void setCurHour20(String curHour20) {
		this.curHour20 = curHour20;
	}
	
	/**
	 * curHour21 attribute를 리턴한다.
	 *
	 * @return the curHour21
	 */
	public String getCurHour21() {
		return curHour21;
	}

	/**
	 * curHour21 attribute 값을 설정한다.
	 *
	 * @param curHour21
	 *            the curHour21 to set
	 */
	public void setCurHour21(String curHour21) {
		this.curHour21 = curHour21;
	}
	
	/**
	 * curHour22 attribute를 리턴한다.
	 *
	 * @return the curHour22
	 */
	public String getCurHour22() {
		return curHour22;
	}

	/**
	 * curHour22 attribute 값을 설정한다.
	 *
	 * @param curHour22
	 *            the curHour22 to set
	 */
	public void setCurHour22(String curHour22) {
		this.curHour22 = curHour22;
	}	
	
	/**
	 * curHour23 attribute를 리턴한다.
	 *
	 * @return the curHour23
	 */
	public String getCurHour23() {
		return curHour23;
	}

	/**
	 * curHour23 attribute 값을 설정한다.
	 *
	 * @param curHour23
	 *            the curHour23 to set
	 */
	public void setCurHour23(String curHour23) {
		this.curHour23 = curHour23;
	}	
	
	/**
	 * curHour24 attribute를 리턴한다.
	 *
	 * @return the curHour24
	 */
	public String getCurHour24() {
		return curHour24;
	}

	/**
	 * curHour24 attribute 값을 설정한다.
	 *
	 * @param curHour24
	 *            the curHour24 to set
	 */
	public void setCurHour24(String curHour24) {
		this.curHour24 = curHour24;
	}
	
	/**
	 * countPerMin attribute를 리턴한다.
	 *
	 * @return the countPerMin
	 */
	public int getCountPerMin() {
		return countPerMin;
	}

	/**
	 * countPerMin attribute 값을 설정한다.
	 *
	 * @param countPerMin
	 *            the countPerMin to set
	 */
	public void setCountPerMin(int countPerMin) {
		this.countPerMin = countPerMin;
	}
	
	/**
	 * countPerMin1 attribute를 리턴한다.
	 *
	 * @return the countPerMin1
	 */
	public int getCountPerMin1() {
		return countPerMin1;
	}

	/**
	 * countPerMin1 attribute 값을 설정한다.
	 *
	 * @param countPerMin1
	 *            the countPerMin1 to set
	 */
	public void setCountPerMin1(int countPerMin1) {
		this.countPerMin1 = countPerMin1;
	}
	
	/**
	 * countPerMin2 attribute를 리턴한다.
	 *
	 * @return the countPerMin2
	 */
	public int getCountPerMin2() {
		return countPerMin2;
	}

	/**
	 * countPerMin2 attribute 값을 설정한다.
	 *
	 * @param countPerMin2
	 *            the countPerMin2 to set
	 */
	public void setCountPerMin2(int countPerMin2) {
		this.countPerMin2 = countPerMin2;
	}	
	
	/**
	 * countPerMin3 attribute를 리턴한다.
	 *
	 * @return the countPerMin3
	 */
	public int getCountPerMin3() {
		return countPerMin3;
	}

	/**
	 * countPerMin3 attribute 값을 설정한다.
	 *
	 * @param countPerMin3
	 *            the countPerMin3 to set
	 */
	public void setCountPerMin3(int countPerMin3) {
		this.countPerMin3 = countPerMin3;
	}	
	
	
	/**
	 * countPerMin4 attribute를 리턴한다.
	 *
	 * @return the countPerMin4
	 */
	public int getCountPerMin4() {
		return countPerMin4;
	}

	/**
	 * countPerMin4 attribute 값을 설정한다.
	 *
	 * @param countPerMin4
	 *            the countPerMin4 to set
	 */
	public void setCountPerMin4(int countPerMin4) {
		this.countPerMin4 = countPerMin4;
	}	
	
	
	/**
	 * countPerMin5 attribute를 리턴한다.
	 *
	 * @return the countPerMin5
	 */
	public int getCountPerMin5() {
		return countPerMin5;
	}

	/**
	 * countPerMin5 attribute 값을 설정한다.
	 *
	 * @param countPerMin5
	 *            the countPerMin5 to set
	 */
	public void setCountPerMin5(int countPerMin5) {
		this.countPerMin5 = countPerMin5;
	}	
	
	
	/**
	 * countPerMin6 attribute를 리턴한다.
	 *
	 * @return the countPerMin6
	 */
	public int getCountPerMin6() {
		return countPerMin6;
	}

	/**
	 * countPerMin6 attribute 값을 설정한다.
	 *
	 * @param countPerMin6
	 *            the countPerMin6 to set
	 */
	public void setCountPerMin6(int countPerMin6) {
		this.countPerMin6 = countPerMin6;
	}	
	
	
	/**
	 * countPerMin7 attribute를 리턴한다.
	 *
	 * @return the countPerMin7
	 */
	public int getCountPerMin7() {
		return countPerMin7;
	}

	/**
	 * countPerMin7 attribute 값을 설정한다.
	 *
	 * @param countPerMin7
	 *            the countPerMin7 to set
	 */
	public void setCountPerMin7(int countPerMin7) {
		this.countPerMin7 = countPerMin7;
	}	
	
	
	/**
	 * countPerMin8 attribute를 리턴한다.
	 *
	 * @return the countPerMin8
	 */
	public int getCountPerMin8() {
		return countPerMin8;
	}

	/**
	 * countPerMin8 attribute 값을 설정한다.
	 *
	 * @param countPerMin8
	 *            the countPerMin8 to set
	 */
	public void setCountPerMin8(int countPerMin8) {
		this.countPerMin8 = countPerMin8;
	}	
	
	
	/**
	 * countPerMin9 attribute를 리턴한다.
	 *
	 * @return the countPerMin9
	 */
	public int getCountPerMin9() {
		return countPerMin9;
	}

	/**
	 * countPerMin9 attribute 값을 설정한다.
	 *
	 * @param countPerMin9
	 *            the countPerMin9 to set
	 */
	public void setCountPerMin9(int countPerMin9) {
		this.countPerMin9 = countPerMin9;
	}	
	
	
	/**
	 * countPerMin10 attribute를 리턴한다.
	 *
	 * @return the countPerMin10
	 */
	public int getCountPerMin10() {
		return countPerMin10;
	}

	/**
	 * countPerMin10 attribute 값을 설정한다.
	 *
	 * @param countPerMin10
	 *            the countPerMin10 to set
	 */
	public void setCountPerMin10(int countPerMin10) {
		this.countPerMin10 = countPerMin10;
	}	

	/**
	 * countPerMin11 attribute를 리턴한다.
	 *
	 * @return the countPerMin11
	 */
	public int getCountPerMin11() {
		return countPerMin11;
	}

	/**
	 * countPerMin11 attribute 값을 설정한다.
	 *
	 * @param countPerMin11
	 *            the countPerMin11 to set
	 */
	public void setCountPerMin11(int countPerMin11) {
		this.countPerMin11 = countPerMin11;
	}
	
	/**
	 * countPerMin12 attribute를 리턴한다.
	 *
	 * @return the countPerMin12
	 */
	public int getCountPerMin12() {
		return countPerMin12;
	}

	/**
	 * countPerMin12 attribute 값을 설정한다.
	 *
	 * @param countPerMin12
	 *            the countPerMin12 to set
	 */
	public void setCountPerMin12(int countPerMin12) {
		this.countPerMin12 = countPerMin12;
	}	
	
	/**
	 * countPerMin13 attribute를 리턴한다.
	 *
	 * @return the countPerMin13
	 */
	public int getCountPerMin13() {
		return countPerMin13;
	}

	/**
	 * countPerMin13 attribute 값을 설정한다.
	 *
	 * @param countPerMin13
	 *            the countPerMin13 to set
	 */
	public void setCountPerMin13(int countPerMin13) {
		this.countPerMin13 = countPerMin13;
	}	
	
	
	/**
	 * countPerMin14 attribute를 리턴한다.
	 *
	 * @return the countPerMin14
	 */
	public int getCountPerMin14() {
		return countPerMin14;
	}

	/**
	 * countPerMin14 attribute 값을 설정한다.
	 *
	 * @param countPerMin14
	 *            the countPerMin14 to set
	 */
	public void setCountPerMin14(int countPerMin14) {
		this.countPerMin14 = countPerMin14;
	}	
	
	
	/**
	 * countPerMin15 attribute를 리턴한다.
	 *
	 * @return the countPerMin15
	 */
	public int getCountPerMin15() {
		return countPerMin15;
	}

	/**
	 * countPerMin15 attribute 값을 설정한다.
	 *
	 * @param countPerMin15
	 *            the countPerMin15 to set
	 */
	public void setCountPerMin15(int countPerMin15) {
		this.countPerMin15 = countPerMin15;
	}	
	
	
	/**
	 * countPerMin16 attribute를 리턴한다.
	 *
	 * @return the countPerMin16
	 */
	public int getCountPerMin16() {
		return countPerMin16;
	}

	/**
	 * countPerMin16 attribute 값을 설정한다.
	 *
	 * @param countPerMin16
	 *            the countPerMin16 to set
	 */
	public void setCountPerMin16(int countPerMin16) {
		this.countPerMin16 = countPerMin16;
	}	
	
	
	/**
	 * countPerMin17 attribute를 리턴한다.
	 *
	 * @return the countPerMin17
	 */
	public int getCountPerMin17() {
		return countPerMin17;
	}

	/**
	 * countPerMin17 attribute 값을 설정한다.
	 *
	 * @param countPerMin17
	 *            the countPerMin17 to set
	 */
	public void setCountPerMin17(int countPerMin17) {
		this.countPerMin17 = countPerMin17;
	}	
	
	
	/**
	 * countPerMin18 attribute를 리턴한다.
	 *
	 * @return the countPerMin18
	 */
	public int getCountPerMin18() {
		return countPerMin18;
	}

	/**
	 * countPerMin18 attribute 값을 설정한다.
	 *
	 * @param countPerMin18
	 *            the countPerMin18 to set
	 */
	public void setCountPerMin18(int countPerMin18) {
		this.countPerMin18 = countPerMin18;
	}	
	
	
	/**
	 * countPerMin19 attribute를 리턴한다.
	 *
	 * @return the countPerMin19
	 */
	public int getCountPerMin19() {
		return countPerMin19;
	}

	/**
	 * countPerMin19 attribute 값을 설정한다.
	 *
	 * @param countPerMin19
	 *            the countPerMin19 to set
	 */
	public void setCountPerMin19(int countPerMin19) {
		this.countPerMin19 = countPerMin19;
	}	
		
	/**
	 * countPerMin20 attribute를 리턴한다.
	 *
	 * @return the countPerMin20
	 */
	public int getCountPerMin20() {
		return countPerMin20;
	}

	/**
	 * countPerMin20 attribute 값을 설정한다.
	 *
	 * @param countPerMin20
	 *            the countPerMin20 to set
	 */
	public void setCountPerMin20(int countPerMin20) {
		this.countPerMin20 = countPerMin20;
	}
	
	/**
	 * countPerMin21 attribute를 리턴한다.
	 *
	 * @return the countPerMin21
	 */
	public int getCountPerMin21() {
		return countPerMin21;
	}

	/**
	 * countPerMin21 attribute 값을 설정한다.
	 *
	 * @param countPerMin21
	 *            the countPerMin21 to set
	 */
	public void setCountPerMin21(int countPerMin21) {
		this.countPerMin21 = countPerMin21;
	}
	
	/**
	 * countPerMin22 attribute를 리턴한다.
	 *
	 * @return the countPerMin22
	 */
	public int getCountPerMin22() {
		return countPerMin22;
	}

	/**
	 * countPerMin22 attribute 값을 설정한다.
	 *
	 * @param countPerMin22
	 *            the countPerMin22 to set
	 */
	public void setCountPerMin22(int countPerMin22) {
		this.countPerMin22 = countPerMin22;
	}	
	
	/**
	 * countPerMin23 attribute를 리턴한다.
	 *
	 * @return the countPerMin23
	 */
	public int getCountPerMin23() {
		return countPerMin23;
	}

	/**
	 * countPerMin23 attribute 값을 설정한다.
	 *
	 * @param countPerMin23
	 *            the countPerMin13 to set
	 */
	public void setCountPerMin23(int countPerMin23) {
		this.countPerMin23 = countPerMin23;
	}	
	
	/**
	 * countPerMin24 attribute를 리턴한다.
	 *
	 * @return the countPerMin24
	 */
	public int getCountPerMin24() {
		return countPerMin24;
	}
	
	/**
	 * countPerMin24 attribute 값을 설정한다.
	 *
	 * @param countPerMin24
	 *            the countPerMin24 to set
	 */
	public void setCountPerMin24(int countPerMin24) {
		this.countPerMin24 = countPerMin24;
	}	
	
	/**
	 * countPerMin25 attribute를 리턴한다.
	 *
	 * @return the countPerMin25
	 */
	public int getCountPerMin25() {
		return countPerMin25;
	}

	/**
	 * countPerMin25 attribute 값을 설정한다.
	 *
	 * @param countPerMin25
	 *            the countPerMin25 to set
	 */
	public void setCountPerMin25(int countPerMin25) {
		this.countPerMin25 = countPerMin25;
	}	
			
	/**
	 * countPerMin26 attribute를 리턴한다.
	 *
	 * @return the countPerMin26
	 */
	public int getCountPerMin26() {
		return countPerMin26;
	}

	/**
	 * countPerMin26 attribute 값을 설정한다.
	 *
	 * @param countPerMin26
	 *            the countPerMin26 to set
	 */
	public void setCountPerMin26(int countPerMin26) {
		this.countPerMin26 = countPerMin26;
	}	
	
	
	/**
	 * countPerMin27 attribute를 리턴한다.
	 *
	 * @return the countPerMin27
	 */
	public int getCountPerMin27() {
		return countPerMin27;
	}

	/**
	 * countPerMin27 attribute 값을 설정한다.
	 *
	 * @param countPerMin27
	 *            the countPerMin27 to set
	 */
	public void setCountPerMin27(int countPerMin27) {
		this.countPerMin27 = countPerMin27;
	}	
	
	
	/**
	 * countPerMin28 attribute를 리턴한다.
	 *
	 * @return the countPerMin28
	 */
	public int getCountPerMin28() {
		return countPerMin28;
	}

	/**
	 * countPerMin28 attribute 값을 설정한다.
	 *
	 * @param countPerMin28
	 *            the countPerMin28 to set
	 */
	public void setCountPerMin28(int countPerMin28) {
		this.countPerMin28 = countPerMin28;
	}	
	
	
	/**
	 * countPerMin29 attribute를 리턴한다.
	 *
	 * @return the countPerMin29
	 */
	public int getCountPerMin29() {
		return countPerMin29;
	}

	/**
	 * countPerMin29 attribute 값을 설정한다.
	 *
	 * @param countPerMin29
	 *            the countPerMin29 to set
	 */
	public void setCountPerMin29(int countPerMin29) {
		this.countPerMin29 = countPerMin29;
	}	
		
	/**
	 * countPerMin30 attribute를 리턴한다.
	 *
	 * @return the countPerMin30
	 */
	public int getCountPerMin30() {
		return countPerMin30;
	}

	/**
	 * countPerMin30 attribute 값을 설정한다.
	 *
	 * @param countPerMin30
	 *            the countPerMin30 to set
	 */
	public void setCountPerMin30(int countPerMin30) {
		this.countPerMin30 = countPerMin30;
	}
	
	/**
	 * countPerMin31 attribute를 리턴한다.
	 *
	 * @return the countPerMin31
	 */
	public int getCountPerMin31() {
		return countPerMin31;
	}
	
	/**
	 * countPerMin31 attribute 값을 설정한다.
	 *
	 * @param countPerMin31
	 *            the countPerMin31 to set
	 */
	public void setCountPerMin31(int countPerMin31) {
		this.countPerMin31 = countPerMin31;
	}

	/**
	 * countPerMin32 attribute를 리턴한다.
	 *
	 * @return the countPerMin32
	 */
	public int getCountPerMin32() {
		return countPerMin32;
	}

	/**
	 * countPerMin32 attribute 값을 설정한다.
	 *
	 * @param countPerMin32
	 *            the countPerMin32 to set
	 */
	public void setCountPerMin32(int countPerMin32) {
		this.countPerMin32 = countPerMin32;
	}
	
	/**
	 * countPerMin33 attribute를 리턴한다.
	 *
	 * @return the countPerMin33
	 */
	public int getCountPerMin33() {
		return countPerMin33;
	}

	/**
	 * countPerMin33 attribute 값을 설정한다.
	 *
	 * @param countPerMin33
	 *            the countPerMin33 to set
	 */
	public void setCountPerMin33(int countPerMin33) {
		this.countPerMin33 = countPerMin33;
	}		
	
	/**
	 * countPerMin34 attribute를 리턴한다.
	 *
	 * @return the countPerMin34
	 */
	public int getCountPerMin34() {
		return countPerMin34;
	}
	
	/**
	 * countPerMin34 attribute 값을 설정한다.
	 *
	 * @param countPerMin34
	 *            the countPerMin34 to set
	 */
	public void setCountPerMin34(int countPerMin34) {
		this.countPerMin34 = countPerMin34;
	}	
	
	/**
	 * countPerMin35 attribute를 리턴한다.
	 *
	 * @return the countPerMin35
	 */
	public int getCountPerMin35() {
		return countPerMin35;
	}

	/**
	 * countPerMin35 attribute 값을 설정한다.
	 *
	 * @param countPerMin35
	 *            the countPerMin35 to set
	 */
	public void setCountPerMin35(int countPerMin35) {
		this.countPerMin35 = countPerMin35;
	}	
			
	/**
	 * countPerMin36 attribute를 리턴한다.
	 *
	 * @return the countPerMin36
	 */
	public int getCountPerMin36() {
		return countPerMin36;
	}

	/**
	 * countPerMin36 attribute 값을 설정한다.
	 *
	 * @param countPerMin36
	 *            the countPerMin36 to set
	 */
	public void setCountPerMin36(int countPerMin36) {
		this.countPerMin36 = countPerMin36;
	}	
	
	
	/**
	 * countPerMin37 attribute를 리턴한다.
	 *
	 * @return the countPerMin37
	 */
	public int getCountPerMin37() {
		return countPerMin37;
	}

	/**
	 * countPerMin37 attribute 값을 설정한다.
	 *
	 * @param countPerMin37
	 *            the countPerMin37 to set
	 */
	public void setCountPerMin37(int countPerMin37) {
		this.countPerMin37 = countPerMin37;
	}	
	
	
	/**
	 * countPerMin38 attribute를 리턴한다.
	 *
	 * @return the countPerMin38
	 */
	public int getCountPerMin38() {
		return countPerMin38;
	}

	/**
	 * countPerMin38 attribute 값을 설정한다.
	 *
	 * @param countPerMin38
	 *            the countPerMin38 to set
	 */
	public void setCountPerMin38(int countPerMin38) {
		this.countPerMin38 = countPerMin38;
	}	
	
	
	/**
	 * countPerMin39 attribute를 리턴한다.
	 *
	 * @return the countPerMin39
	 */
	public int getCountPerMin39() {
		return countPerMin39;
	}

	/**
	 * countPerMin39 attribute 값을 설정한다.
	 *
	 * @param countPerMin39
	 *            the countPerMin39 to set
	 */
	public void setCountPerMin39(int countPerMin39) {
		this.countPerMin39 = countPerMin39;
	}	
		
	/**
	 * countPerMin40 attribute를 리턴한다.
	 *
	 * @return the countPerMin40
	 */
	public int getCountPerMin40() {
		return countPerMin40;
	}

	/**
	 * countPerMin40 attribute 값을 설정한다.
	 *
	 * @param countPerMin40
	 *            the countPerMin40 to set
	 */
	public void setCountPerMin40(int countPerMin40) {
		this.countPerMin40 = countPerMin40;
	}	

	/**
	 * countPerMin41 attribute를 리턴한다.
	 *
	 * @return the countPerMin41
	 */
	public int getCountPerMin41() {
		return countPerMin41;
	}

	/**
	 * countPerMin41 attribute 값을 설정한다.
	 *
	 * @param countPerMin41
	 *            the countPerMin41 to set
	 */
	public void setCountPerMin41(int countPerMin41) {
		this.countPerMin41 = countPerMin41;
	}
	
	/**
	 * countPerMin42 attribute를 리턴한다.
	 *
	 * @return the countPerMin42
	 */
	public int getCountPerMin42() {
		return countPerMin42;
	}

	/**
	 * countPerMin42 attribute 값을 설정한다.
	 *
	 * @param countPerMin42
	 *            the countPerMin42 to set
	 */
	public void setCountPerMin42(int countPerMin42) {
		this.countPerMin42 = countPerMin42;
	}		

	/**
	 * countPerMin43 attribute를 리턴한다.
	 *
	 * @return the countPerMin43
	 */
	public int getCountPerMin43() {
		return countPerMin43;
	}

	/**
	 * countPerMin43 attribute 값을 설정한다.
	 *
	 * @param countPerMin43
	 *            the countPerMin43 to set
	 */
	public void setCountPerMin43(int countPerMin43) {
		this.countPerMin43 = countPerMin43;
	}	
	
	/**
	 * countPerMin44 attribute를 리턴한다.
	 *
	 * @return the countPerMin44
	 */
	public int getCountPerMin44() {
		return countPerMin44;
	}
	
	/**
	 * countPerMin44 attribute 값을 설정한다.
	 *
	 * @param countPerMin44
	 *            the countPerMin44 to set
	 */
	public void setCountPerMin44(int countPerMin44) {
		this.countPerMin44 = countPerMin44;
	}	
	
	/**
	 * countPerMin45 attribute를 리턴한다.
	 *
	 * @return the countPerMin45
	 */
	public int getCountPerMin45() {
		return countPerMin45;
	}

	/**
	 * countPerMin45 attribute 값을 설정한다.
	 *
	 * @param countPerMin45
	 *            the countPerMin45 to set
	 */
	public void setCountPerMin45(int countPerMin45) {
		this.countPerMin45 = countPerMin45;
	}	
			
	/**
	 * countPerMin46 attribute를 리턴한다.
	 *
	 * @return the countPerMin46
	 */
	public int getCountPerMin46() {
		return countPerMin46;
	}

	/**
	 * countPerMin46 attribute 값을 설정한다.
	 *
	 * @param countPerMin46
	 *            the countPerMin46 to set
	 */
	public void setCountPerMin46(int countPerMin46) {
		this.countPerMin46 = countPerMin46;
	}	
	
	
	/**
	 * countPerMin47 attribute를 리턴한다.
	 *
	 * @return the countPerMin47
	 */
	public int getCountPerMin47() {
		return countPerMin47;
	}

	/**
	 * countPerMin47 attribute 값을 설정한다.
	 *
	 * @param countPerMin47
	 *            the countPerMin47 to set
	 */
	public void setCountPerMin47(int countPerMin47) {
		this.countPerMin47 = countPerMin47;
	}	
	
	
	/**
	 * countPerMin48 attribute를 리턴한다.
	 *
	 * @return the countPerMin48
	 */
	public int getCountPerMin48() {
		return countPerMin48;
	}

	/**
	 * countPerMin48 attribute 값을 설정한다.
	 *
	 * @param countPerMin48
	 *            the countPerMin48 to set
	 */
	public void setCountPerMin48(int countPerMin48) {
		this.countPerMin48 = countPerMin48;
	}	
	
	
	/**
	 * countPerMin49 attribute를 리턴한다.
	 *
	 * @return the countPerMin49
	 */
	public int getCountPerMin49() {
		return countPerMin49;
	}

	/**
	 * countPerMin49 attribute 값을 설정한다.
	 *
	 * @param countPerMin49
	 *            the countPerMin49 to set
	 */
	public void setCountPerMin49(int countPerMin49) {
		this.countPerMin49 = countPerMin49;
	}	
		
	/**
	 * countPerMin50 attribute를 리턴한다.
	 *
	 * @return the countPerMin50
	 */
	public int getCountPerMin50() {
		return countPerMin50;
	}

	/**
	 * countPerMin50 attribute 값을 설정한다.
	 *
	 * @param countPerMin50
	 *            the countPerMin50 to set
	 */
	public void setCountPerMin50(int countPerMin50) {
		this.countPerMin50 = countPerMin50;
	}	
	
	/**
	 * countPerMin51 attribute를 리턴한다.
	 *
	 * @return the countPerMin51
	 */
	public int getCountPerMin51() {
		return countPerMin51;
	}

	/**
	 * countPerMin51 attribute 값을 설정한다.
	 *
	 * @param countPerMin51
	 *            the countPerMin51 to set
	 */
	public void setCountPerMin51(int countPerMin5) {
		this.countPerMin51 = countPerMin51;
	}
	
	/**
	 * countPerMin52 attribute를 리턴한다.
	 *
	 * @return the countPerMin52
	 */
	public int getCountPerMin52() {
		return countPerMin52;
	}

	/**
	 * countPerMin52 attribute 값을 설정한다.
	 *
	 * @param countPerMin52
	 *            the countPerMin52 to set
	 */
	public void setCountPerMin52(int countPerMin52) {
		this.countPerMin52 = countPerMin52;
	}		

	/**
	 * countPerMin53 attribute를 리턴한다.
	 *
	 * @return the countPerMin53
	 */
	public int getCountPerMin53() {
		return countPerMin53;
	}

	/**
	 * countPerMin53 attribute 값을 설정한다.
	 *
	 * @param countPerMin543
	 *            the countPerMin53 to set
	 */
	public void setCountPerMin53(int countPerMin53) {
		this.countPerMin53 = countPerMin53;
	}	
	
	/**
	 * countPerMin54 attribute를 리턴한다.
	 *
	 * @return the countPerMin54
	 */
	public int getCountPerMin54() {
		return countPerMin54;
	}
	
	/**
	 * countPerMin54 attribute 값을 설정한다.
	 *
	 * @param countPerMin54
	 *            the countPerMin54 to set
	 */
	public void setCountPerMin54(int countPerMin54) {
		this.countPerMin54 = countPerMin54;
	}	
	
	/**
	 * countPerMin55 attribute를 리턴한다.
	 *
	 * @return the countPerMin55
	 */
	public int getCountPerMin55() {
		return countPerMin55;
	}

	/**
	 * countPerMin55 attribute 값을 설정한다.
	 *
	 * @param countPerMin55
	 *            the countPerMin55 to set
	 */
	public void setCountPerMin55(int countPerMin55) {
		this.countPerMin55 = countPerMin55;
	}	
			
	/**
	 * countPerMin56 attribute를 리턴한다.
	 *
	 * @return the countPerMin56
	 */
	public int getCountPerMin56() {
		return countPerMin56;
	}

	/**
	 * countPerMin56 attribute 값을 설정한다.
	 *
	 * @param countPerMin56
	 *            the countPerMin56 to set
	 */
	public void setCountPerMin56(int countPerMin56) {
		this.countPerMin56 = countPerMin56;
	}	
	
	
	/**
	 * countPerMin57 attribute를 리턴한다.
	 *
	 * @return the countPerMin57
	 */
	public int getCountPerMin57() {
		return countPerMin57;
	}

	/**
	 * countPerMin57 attribute 값을 설정한다.
	 *
	 * @param countPerMin57
	 *            the countPerMin57 to set
	 */
	public void setCountPerMin57(int countPerMin57) {
		this.countPerMin57 = countPerMin57;
	}	
	
	
	/**
	 * countPerMin58 attribute를 리턴한다.
	 *
	 * @return the countPerMin58
	 */
	public int getCountPerMin58() {
		return countPerMin58;
	}

	/**
	 * countPerMin58 attribute 값을 설정한다.
	 *
	 * @param countPerMin58
	 *            the countPerMin58 to set
	 */
	public void setCountPerMin58(int countPerMin58) {
		this.countPerMin58 = countPerMin58;
	}	
	
	
	/**
	 * countPerMin59 attribute를 리턴한다.
	 *
	 * @return the countPerMin59
	 */
	public int getCountPerMin59() {
		return countPerMin59;
	}

	/**
	 * countPerMin59 attribute 값을 설정한다.
	 *
	 * @param countPerMin59
	 *            the countPerMin59 to set
	 */
	public void setCountPerMin59(int countPerMin59) {
		this.countPerMin59 = countPerMin59;
	}	
		
		
	/**
	 * curMin attribute를 리턴한다.
	 *
	 * @return the curMin
	 */
	public String getCurMin() {
		return curMin;
	}

	/**
	 * curMin attribute 값을 설정한다.
	 *
	 * @param curMin
	 *            the curMin to set
	 */
	public void setCurMin(String curMin) {
		this.curMin = curMin;
	}
	
	/**
	 * curMin1 attribute를 리턴한다.
	 *
	 * @return the curMin1
	 */
	public String getCurMin1() {
		return curMin1;
	}

	/**
	 * curMin1 attribute 값을 설정한다.
	 *
	 * @param curMin1
	 *            the curMin1 to set
	 */
	public void setCurMin1(String curMin1) {
		this.curMin1 = curMin1;
	}
	
	/**
	 * curMin2 attribute를 리턴한다.
	 *
	 * @return the curMin2
	 */
	public String getCurMin2() {
		return curMin2;
	}

	/**
	 * curMin2 attribute 값을 설정한다.
	 *
	 * @param curMin2
	 *            the curMin2 to set
	 */
	public void setCurMin2(String curMin2) {
		this.curMin2 = curMin2;
	}	
	
	/**
	 * curMin3 attribute를 리턴한다.
	 *
	 * @return the curMin3
	 */
	public String getCurMin3() {
		return curMin3;
	}

	/**
	 * curMin3 attribute 값을 설정한다.
	 *
	 * @param curMin3
	 *            the curMin3 to set
	 */
	public void setCurMin3(String curMin3) {
		this.curMin3 = curMin3;
	}

	/**
	 * curMin4 attribute를 리턴한다.
	 *
	 * @return the curMin4
	 */
	public String getCurMin4() {
		return curMin4;
	}

	/**
	 * curMin4 attribute 값을 설정한다.
	 *
	 * @param curMin4
	 *            the curMin4 to set
	 */
	public void setCurMin4(String curMin4) {
		this.curMin4 = curMin4;
	}
	
	/**
	 * curMin5 attribute를 리턴한다.
	 *
	 * @return the curMin5
	 */
	public String getCurMin5() {
		return curMin5;
	}

	/**
	 * curMin5 attribute 값을 설정한다.
	 *
	 * @param curMin5
	 *            the curMin5 to set
	 */
	public void setCurMin5(String curMin5) {
		this.curMin5 = curMin5;
	}
	
	/**
	 * curMin6 attribute를 리턴한다.
	 *
	 * @return the curMin6
	 */
	public String getCurMin6() {
		return curMin6;
	}

	/**
	 * curMin6 attribute 값을 설정한다.
	 *
	 * @param curMin6
	 *            the curMin6 to set
	 */
	public void setCurMin6(String curMin6) {
		this.curMin6 = curMin6;
	}
	
	/**
	 * curMin7 attribute를 리턴한다.
	 *
	 * @return the curMin7
	 */
	public String getCurMin7() {
		return curMin7;
	}

	/**
	 * curMin7 attribute 값을 설정한다.
	 *
	 * @param curMin7
	 *            the curMin7 to set
	 */
	public void setCurMin7(String curMin7) {
		this.curMin7 = curMin7;
	}
	
	/**
	 * curMin8 attribute를 리턴한다.
	 *
	 * @return the curMin8
	 */
	public String getCurMin8() {
		return curMin8;
	}

	/**
	 * curMin8 attribute 값을 설정한다.
	 *
	 * @param curMin8
	 *            the curMin8 to set
	 */
	public void setCurMin8(String curMin8) {
		this.curMin8 = curMin8;
	}
	
	/**
	 * curMin9 attribute를 리턴한다.
	 *
	 * @return the curMin9
	 */
	public String getCurMin9() {
		return curMin9;
	}

	/**
	 * curMin9 attribute 값을 설정한다.
	 *
	 * @param curMin9
	 *            the curMin9 to set
	 */
	public void setCurMin9(String curMin9) {
		this.curMin9 = curMin9;
	}
	
	/**
	 * curMin10 attribute를 리턴한다.
	 *
	 * @return the curMin10
	 */
	public String getCurMin10() {
		return curMin10;
	}

	/**
	 * curMin10 attribute 값을 설정한다.
	 *
	 * @param curMin10
	 *            the curMin10 to set
	 */
	public void setCurMin10(String curMin10) {
		this.curMin10 = curMin10;
	}
	
	/**
	 * curMin11 attribute를 리턴한다.
	 *
	 * @return the curMin11
	 */
	public String getCurMin11() {
		return curMin11;
	}

	/**
	 * curMin11 attribute 값을 설정한다.
	 *
	 * @param curMin11
	 *            the curMin11 to set
	 */
	public void setCurMin11(String curMin11) {
		this.curMin11 = curMin11;
	}
	
	/**
	 * curMin12 attribute를 리턴한다.
	 *
	 * @return the curMin12
	 */
	public String getCurMin12() {
		return curMin12;
	}

	/**
	 * curMin12 attribute 값을 설정한다.
	 *
	 * @param curMin12
	 *            the curMin12 to set
	 */
	public void setCurMin12(String curMin12) {
		this.curMin12 = curMin12;
	}	
	
	/**
	 * curMin13 attribute를 리턴한다.
	 *
	 * @return the curMin13
	 */
	public String getCurMin13() {
		return curMin13;
	}

	/**
	 * curMin13 attribute 값을 설정한다.
	 *
	 * @param curMin13
	 *            the curMin13 to set
	 */
	public void setCurMin13(String curMin13) {
		this.curMin13 = curMin13;
	}

	/**
	 * curMin14 attribute를 리턴한다.
	 *
	 * @return the curMin14
	 */
	public String getCurMin14() {
		return curMin14;
	}

	/**
	 * curMin14 attribute 값을 설정한다.
	 *
	 * @param curMin14
	 *            the curMin14 to set
	 */
	public void setCurMin14(String curMin14) {
		this.curMin14 = curMin14;
	}
	
	/**
	 * curMin15 attribute를 리턴한다.
	 *
	 * @return the curMin15
	 */
	public String getCurMin15() {
		return curMin15;
	}

	/**
	 * curMin15 attribute 값을 설정한다.
	 *
	 * @param curMin15
	 *            the curMin15 to set
	 */
	public void setCurMin15(String curMin15) {
		this.curMin15 = curMin15;
	}
	
	/**
	 * curMin16 attribute를 리턴한다.
	 *
	 * @return the curMin16
	 */
	public String getCurMin16() {
		return curMin16;
	}

	/**
	 * curMin16 attribute 값을 설정한다.
	 *
	 * @param curMin16
	 *            the curMin16 to set
	 */
	public void setCurMin16(String curMin16) {
		this.curMin16 = curMin16;
	}
	
	/**
	 * curMin17 attribute를 리턴한다.
	 *
	 * @return the curMin17
	 */
	public String getCurMin17() {
		return curMin17;
	}

	/**
	 * curMin17 attribute 값을 설정한다.
	 *
	 * @param curMin17
	 *            the curMin17 to set
	 */
	public void setCurMin17(String curMin17) {
		this.curMin17 = curMin17;
	}
	
	/**
	 * curMin18 attribute를 리턴한다.
	 *
	 * @return the curMin18
	 */
	public String getCurMin18() {
		return curMin18;
	}

	/**
	 * curMin18 attribute 값을 설정한다.
	 *
	 * @param curMin18
	 *            the curMin18 to set
	 */
	public void setCurMin18(String curMin18) {
		this.curMin18 = curMin18;
	}
	
	/**
	 * curMin19 attribute를 리턴한다.
	 *
	 * @return the curMin19
	 */
	public String getCurMin19() {
		return curMin19;
	}

	/**
	 * curMin19 attribute 값을 설정한다.
	 *
	 * @param curMin19
	 *            the curMin19 to set
	 */
	public void setCurMin19(String curMin19) {
		this.curMin19 = curMin19;
	}
	
	/**
	 * curMin20 attribute를 리턴한다.
	 *
	 * @return the curMin20
	 */
	public String getCurMin20() {
		return curMin20;
	}

	/**
	 * curMin20 attribute 값을 설정한다.
	 *
	 * @param curMin20
	 *            the curMin20 to set
	 */
	public void setCurMin20(String curMin20) {
		this.curMin20 = curMin20;
	}
	
	/**
	 * curMin21 attribute를 리턴한다.
	 *
	 * @return the curMin21
	 */
	public String getCurMin21() {
		return curMin21;
	}

	/**
	 * curMin21 attribute 값을 설정한다.
	 *
	 * @param curMin21
	 *            the curMin21 to set
	 */
	public void setCurMin21(String curMin21) {
		this.curMin21 = curMin21;
	}
	
	/**
	 * curMin22 attribute를 리턴한다.
	 *
	 * @return the curMin22
	 */
	public String getCurMin22() {
		return curMin22;
	}

	/**
	 * curMin22 attribute 값을 설정한다.
	 *
	 * @param curMin22
	 *            the curMin22 to set
	 */
	public void setCurMin22(String curMin22) {
		this.curMin22 = curMin22;
	}	
	
	/**
	 * curMin23 attribute를 리턴한다.
	 *
	 * @return the curMin23
	 */
	public String getCurMin23() {
		return curMin23;
	}

	/**
	 * curMin23 attribute 값을 설정한다.
	 *
	 * @param curMin23
	 *            the curMin23 to set
	 */
	public void setCurMin23(String curMin23) {
		this.curMin23 = curMin23;
	}

	/**
	 * curMin24 attribute를 리턴한다.
	 *
	 * @return the curMin24
	 */
	public String getCurMin24() {
		return curMin24;
	}

	/**
	 * curMin24 attribute 값을 설정한다.
	 *
	 * @param curMin24
	 *            the curMin24 to set
	 */
	public void setCurMin24(String curMin24) {
		this.curMin24 = curMin24;
	}	

	/**
	 * curMin25 attribute를 리턴한다.
	 *
	 * @return the curMin25
	 */
	public String getCurMin25() {
		return curMin25;
	}

	/**
	 * curMin25 attribute 값을 설정한다.
	 *
	 * @param curMin25
	 *            the curMin25 to set
	 */
	public void setCurMin25(String curMin25) {
		this.curMin25 = curMin25;
	}
	
	/**
	 * curMin26 attribute를 리턴한다.
	 *
	 * @return the curMin26
	 */
	public String getCurMin26() {
		return curMin26;
	}

	/**
	 * curMin26 attribute 값을 설정한다.
	 *
	 * @param curMin26
	 *            the curMin26 to set
	 */
	public void setCurMin26(String curMin26) {
		this.curMin16 = curMin26;
	}
	
	/**
	 * curMin27 attribute를 리턴한다.
	 *
	 * @return the curMin27
	 */
	public String getCurMin27() {
		return curMin27;
	}

	/**
	 * curMin27 attribute 값을 설정한다.
	 *
	 * @param curMin27
	 *            the curMin27 to set
	 */
	public void setCurMin27(String curMin27) {
		this.curMin27 = curMin27;
	}
	
	/**
	 * curMin28 attribute를 리턴한다.
	 *
	 * @return the curMin28
	 */
	public String getCurMin28() {
		return curMin28;
	}

	/**
	 * curMin28 attribute 값을 설정한다.
	 *
	 * @param curMin28
	 *            the curMin28 to set
	 */
	public void setCurMin28(String curMin28) {
		this.curMin18 = curMin28;
	}
	
	/**
	 * curMin29 attribute를 리턴한다.
	 *
	 * @return the curMin29
	 */
	public String getCurMin29() {
		return curMin29;
	}

	/**
	 * curMin29 attribute 값을 설정한다.
	 *
	 * @param curMin29
	 *            the curMin29 to set
	 */
	public void setCurMin29(String curMin29) {
		this.curMin29 = curMin29;
	}
	
	/**
	 * curMin30 attribute를 리턴한다.
	 *
	 * @return the curMin30
	 */
	public String getCurMin30() {
		return curMin30;
	}

	/**
	 * curMin30 attribute 값을 설정한다.
	 *
	 * @param curMin30
	 *            the curMin30 to set
	 */
	public void setCurMin30(String curMin30) {
		this.curMin30 = curMin30;
	}
					
	/**
	 * curMin31 attribute를 리턴한다.
	 *
	 * @return the curMin31
	 */
	public String getCurMin31() {
		return curMin31;
	}

	/**
	 * curMin31 attribute 값을 설정한다.
	 *
	 * @param curMin31
	 *            the curMin31 to set
	 */
	public void setCurMin31(String curMin31) {
		this.curMin31 = curMin31;
	}
	
	/**
	 * curMin32 attribute를 리턴한다.
	 *
	 * @return the curMin32
	 */
	public String getCurMin32() {
		return curMin32;
	}

	/**
	 * curMin32 attribute 값을 설정한다.
	 *
	 * @param curMin32
	 *            the curMin32 to set
	 */
	public void setCurMin32(String curMin32) {
		this.curMin32 = curMin32;
	}	
	
	/**
	 * curMin33 attribute를 리턴한다.
	 *
	 * @return the curMin33
	 */
	public String getCurMin33() {
		return curMin33;
	}

	/**
	 * curMin33 attribute 값을 설정한다.
	 *
	 * @param curMin33
	 *            the curMin33 to set
	 */
	public void setCurMin33(String curMin33) {
		this.curMin33 = curMin33;
	}

	/**
	 * curMin34 attribute를 리턴한다.
	 *
	 * @return the curMin34
	 */
	public String getCurMin34() {
		return curMin34;
	}

	/**
	 * curMin34 attribute 값을 설정한다.
	 *
	 * @param curMin34
	 *            the curMin34 to set
	 */
	public void setCurMin34(String curMin34) {
		this.curMin34 = curMin34;
	}	

	/**
	 * curMin35 attribute를 리턴한다.
	 *
	 * @return the curMin35
	 */
	public String getCurMin35() {
		return curMin35;
	}

	/**
	 * curMin35 attribute 값을 설정한다.
	 *
	 * @param curMin35
	 *            the curMin35 to set
	 */
	public void setCurMin35(String curMin35) {
		this.curMin35 = curMin35;
	}
	
	/**
	 * curMin36 attribute를 리턴한다.
	 *
	 * @return the curMin36
	 */
	public String getCurMin36() {
		return curMin36;
	}

	/**
	 * curMin36 attribute 값을 설정한다.
	 *
	 * @param curMin36
	 *            the curMin36 to set
	 */
	public void setCurMin36(String curMin36) {
		this.curMin36 = curMin36;
	}
	
	/**
	 * curMin37 attribute를 리턴한다.
	 *
	 * @return the curMin37
	 */
	public String getCurMin37() {
		return curMin37;
	}

	/**
	 * curMin37 attribute 값을 설정한다.
	 *
	 * @param curMin37
	 *            the curMin37 to set
	 */
	public void setCurMin37(String curMin37) {
		this.curMin37 = curMin37;
	}
	
	/**
	 * curMin38 attribute를 리턴한다.
	 *
	 * @return the curMin38
	 */
	public String getCurMin38() {
		return curMin38;
	}

	/**
	 * curMin38 attribute 값을 설정한다.
	 *
	 * @param curMin38
	 *            the curMin38 to set
	 */
	public void setCurMin38(String curMin38) {
		this.curMin38 = curMin38;
	}
	
	/**
	 * curMin39 attribute를 리턴한다.
	 *
	 * @return the curMin39
	 */
	public String getCurMin39() {
		return curMin39;
	}

	/**
	 * curMin39 attribute 값을 설정한다.
	 *
	 * @param curMin39
	 *            the curMin39 to set
	 */
	public void setCurMin39(String curMin39) {
		this.curMin39 = curMin39;
	}
	
	/**
	 * curMin40 attribute를 리턴한다.
	 *
	 * @return the curMin40
	 */
	public String getCurMin40() {
		return curMin40;
	}

	/**
	 * curMin40 attribute 값을 설정한다.
	 *
	 * @param curMin40
	 *            the curMin40 to set
	 */
	public void setCurMin40(String curMin40) {
		this.curMin40 = curMin40;
	}		
	
	/**
	 * curMin41 attribute를 리턴한다.
	 *
	 * @return the curMin41
	 */
	public String getCurMin41() {
		return curMin41;
	}

	/**
	 * curMin41 attribute 값을 설정한다.
	 *
	 * @param curMin41
	 *            the curMin41 to set
	 */
	public void setCurMin41(String curMin41) {
		this.curMin41 = curMin41;
	}
	
	/**
	 * curMin42 attribute를 리턴한다.
	 *
	 * @return the curMin42
	 */
	public String getCurMin42() {
		return curMin42;
	}

	/**
	 * curMin42 attribute 값을 설정한다.
	 *
	 * @param curMin42
	 *            the curMin42 to set
	 */
	public void setCurMin42(String curMin42) {
		this.curMin42 = curMin42;
	}	
	
	/**
	 * curMin43 attribute를 리턴한다.
	 *
	 * @return the curMin43
	 */
	public String getCurMin43() {
		return curMin43;
	}

	/**
	 * curMin43 attribute 값을 설정한다.
	 *
	 * @param curMin43
	 *            the curMin43 to set
	 */
	public void setCurMin43(String curMin43) {
		this.curMin43 = curMin43;
	}

	/**
	 * curMin44 attribute를 리턴한다.
	 *
	 * @return the curMin44
	 */
	public String getCurMin44() {
		return curMin44;
	}

	/**
	 * curMin44 attribute 값을 설정한다.
	 *
	 * @param curMin44
	 *            the curMin44 to set
	 */
	public void setCurMin44(String curMin44) {
		this.curMin44 = curMin44;
	}	

	/**
	 * curMin45 attribute를 리턴한다.
	 *
	 * @return the curMin45
	 */
	public String getCurMin45() {
		return curMin45;
	}

	/**
	 * curMin45 attribute 값을 설정한다.
	 *
	 * @param curMin45
	 *            the curMin45 to set
	 */
	public void setCurMin45(String curMin45) {
		this.curMin45 = curMin45;
	}
	
	/**
	 * curMin46 attribute를 리턴한다.
	 *
	 * @return the curMin46
	 */
	public String getCurMin46() {
		return curMin46;
	}

	/**
	 * curMin46 attribute 값을 설정한다.
	 *
	 * @param curMin46
	 *            the curMin46 to set
	 */
	public void setCurMin46(String curMin46) {
		this.curMin46 = curMin46;
	}
	
	/**
	 * curMin47 attribute를 리턴한다.
	 *
	 * @return the curMin47
	 */
	public String getCurMin47() {
		return curMin47;
	}

	/**
	 * curMin47 attribute 값을 설정한다.
	 *
	 * @param curMin47
	 *            the curMin47 to set
	 */
	public void setCurMin47(String curMin47) {
		this.curMin47 = curMin47;
	}
	
	/**
	 * curMin48 attribute를 리턴한다.
	 *
	 * @return the curMin48
	 */
	public String getCurMin48() {
		return curMin48;
	}

	/**
	 * curMin48 attribute 값을 설정한다.
	 *
	 * @param curMin48
	 *            the curMin48 to set
	 */
	public void setCurMin48(String curMin48) {
		this.curMin48 = curMin48;
	}
	
	/**
	 * curMin49 attribute를 리턴한다.
	 *
	 * @return the curMin49
	 */
	public String getCurMin49() {
		return curMin49;
	}

	/**
	 * curMin49 attribute 값을 설정한다.
	 *
	 * @param curMin49
	 *            the curMin49 to set
	 */
	public void setCurMin49(String curMin49) {
		this.curMin49 = curMin49;
	}
	
	/**
	 * curMin50 attribute를 리턴한다.
	 *
	 * @return the curMin50
	 */
	public String getCurMin50() {
		return curMin50;
	}

	/**
	 * curMin50 attribute 값을 설정한다.
	 *
	 * @param curMin50
	 *            the curMin50 to set
	 */
	public void setCurMin50(String curMin50) {
		this.curMin50 = curMin50;
	}				

	/**
	 * curMin51 attribute를 리턴한다.
	 *
	 * @return the curMin51
	 */
	public String getCurMin51() {
		return curMin51;
	}

	/**
	 * curMin51 attribute 값을 설정한다.
	 *
	 * @param curMin51
	 *            the curMin51 to set
	 */
	public void setCurMin51(String curMin51) {
		this.curMin51 = curMin51;
	}
	
	/**
	 * curMin52 attribute를 리턴한다.
	 *
	 * @return the curMin52
	 */
	public String getCurMin52() {
		return curMin52;
	}

	/**
	 * curMin52 attribute 값을 설정한다.
	 *
	 * @param curMin52
	 *            the curMin52 to set
	 */
	public void setCurMin52(String curMin52) {
		this.curMin52 = curMin52;
	}	
	
	/**
	 * curMin53 attribute를 리턴한다.
	 *
	 * @return the curMin53
	 */
	public String getCurMin53() {
		return curMin53;
	}

	/**
	 * curMin53 attribute 값을 설정한다.
	 *
	 * @param curMin53
	 *            the curMin53 to set
	 */
	public void setCurMin53(String curMin53) {
		this.curMin53 = curMin53;
	}

	/**
	 * curMin54 attribute를 리턴한다.
	 *
	 * @return the curMin54
	 */
	public String getCurMin54() {
		return curMin54;
	}

	/**
	 * curMin54 attribute 값을 설정한다.
	 *
	 * @param curMin54
	 *            the curMin54 to set
	 */
	public void setCurMin54(String curMin54) {
		this.curMin54 = curMin54;
	}	

	/**
	 * curMin55 attribute를 리턴한다.
	 *
	 * @return the curMin55
	 */
	public String getCurMin55() {
		return curMin55;
	}

	/**
	 * curMin55 attribute 값을 설정한다.
	 *
	 * @param curMin55
	 *            the curMin55 to set
	 */
	public void setCurMin55(String curMin55) {
		this.curMin55 = curMin55;
	}
	
	/**
	 * curMin56 attribute를 리턴한다.
	 *
	 * @return the curMin56
	 */
	public String getCurMin56() {
		return curMin56;
	}

	/**
	 * curMin56 attribute 값을 설정한다.
	 *
	 * @param curMin56
	 *            the curMin56 to set
	 */
	public void setCurMin56(String curMin56) {
		this.curMin56 = curMin56;
	}
	
	/**
	 * curMin57 attribute를 리턴한다.
	 *
	 * @return the curMin57
	 */
	public String getCurMin57() {
		return curMin57;
	}

	/**
	 * curMin57 attribute 값을 설정한다.
	 *
	 * @param curMin57
	 *            the curMin57 to set
	 */
	public void setCurMin57(String curMin57) {
		this.curMin57 = curMin57;
	}
	
	/**
	 * curMin58 attribute를 리턴한다.
	 *
	 * @return the curMin58
	 */
	public String getCurMin58() {
		return curMin58;
	}

	/**
	 * curMin58 attribute 값을 설정한다.
	 *
	 * @param curMin58
	 *            the curMin58 to set
	 */
	public void setCurMin58(String curMin58) {
		this.curMin58 = curMin58;
	}
	
	/**
	 * curMin59 attribute를 리턴한다.
	 *
	 * @return the curMin59
	 */
	public String getCurMin59() {
		return curMin59;
	}

	/**
	 * curMin59 attribute 값을 설정한다.
	 *
	 * @param curMin59
	 *            the curMin59 to set
	 */
	public void setCurMin59(String curMin59) {
		this.curMin59 = curMin59;
	}
	

	
	
	/**
	 * toString 메소드를 대치한다.
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}