package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 스마트컨트랙트의 채널를 위한 클래스
 */
public class Peer implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	/** 피어 아이디 */
	private int id = 0;
	/** org */
	private int org = 0;
	/** 생성자 */
	private String mspId;
	/** requests */
	private String requests;
	/** events */
	private String events;
	/** 서버명 */
	private String serverHostName;
	/** 피어 타입 */
	private String peerType;
	/** 등록 시간 */
	private String createDt;
	/** 채널생성 해쉬값 */
	private String channelGenesisHash;
	/** 네트워크명 */
	private String networkName;

	

	/**
	 * id attribute를 리턴한다.
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * id attribute 값을 설정한다.
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * org attribute를 리턴한다.
	 * @return int
	 */
	public int getOrg() {
		return org;
	}

	/**
	 * org attribute 값을 설정한다.
	 * @param org int
	 */
	public void setOrg(int org) {
		this.org = org;
	}

	
	/**
	 * mspId attribute 를 리턴한다.
	 * @return String
	 */
	public String getMspId() {
		return mspId;
	}
	
	/**
	 * mspId attribute 값을 설정한다.
	 * @param mspId String
	 */
	public void setMspId(String mspId) {
		this.mspId = mspId;
	}
	
	/**
	 * requests attribute 를 리턴한다.
	 * @return String
	 */
	public String getRequests() {
		return requests;
	}
	
	/**
	 * requests attribute 값을 설정한다.
	 * @param requests String
	 */
	public void setRequests(String requests) {
		this.requests = requests;
	}	

	/**
	 * events attribute 를 리턴한다.
	 * @return String
	 */
	public String getEvents() {
		return events;
	}
	
	/**
	 * events attribute 값을 설정한다.
	 * @param events String
	 */
	public void setEvents(String events) {
		this.events = events;
	}		
	
	/**
	 * serverHostame attribute 를 리턴한다.
	 * @return String
	 */
	public String getServerHostName() {
		return serverHostName;
	}
	
	/**
	 * serverHostName attribute 값을 설정한다.
	 * @param serverHostName String
	 */
	public void setServerHostName(String serverHostName) {
		this.serverHostName = serverHostName;
	}
	
	/**
	 * peerType attribute 를 리턴한다.
	 * @return String
	 */
	public String getPeerType() {
		return peerType;
	}
	
	/**
	 * peerType attribute 값을 설정한다.
	 * @param peerType String
	 */
	public void setPeerType(String peerType) {
		this.peerType = peerType;
	}	
	
	/**
	 * createDt attribute 를 리턴한다.
	 * @return String
	 */
	public String getCreateDt() {
		return createDt;
	}
	
	/**
	 * createDt attribute 값을 설정한다.
	 * @param createDt String
	 */
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	
	/**
	 * channelGenesisHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getChannelGenesisHash() {
		return channelGenesisHash;
	}
	
	/**
	 * channelGenesisHash attribute 값을 설정한다.
	 * @param channelGenesisHash String
	 */
	public void setChannelGenesisHash(String channelGenesisHash) {
		this.channelGenesisHash = channelGenesisHash;
	}	

	/**
	 * networkName attribute 를 리턴한다.
	 * @return String
	 */
	public String getNetworkName() {
		return networkName;
	}
	
	/**
	 * networkName attribute 값을 설정한다.
	 * @param networkName String
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
		
		
	/**
	 * toString 메소드를 대치한다.
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}