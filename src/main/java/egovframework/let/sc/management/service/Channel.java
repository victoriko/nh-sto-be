package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 스마트컨트랙트의 채널를 위한 클래스
 */
public class Channel implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	/** 채널 아이디 */
	private int id = 0;
	/** 채널명 */
	private String name;
	/** 블럭 수 */
	private int blocksCnt = 0;
	/** 트랜잭션 수 */
	private int transCnt = 0;
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
	 * name attribute 를 리턴한다.
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * name attribute 값을 설정한다.
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
			
	/**
	 * blocksCnt attribute를 리턴한다.
	 * @return int
	 */
	public int getBlocksCnt() {
		return blocksCnt;
	}

	/**
	 * blocksCnt attribute 값을 설정한다.
	 * @param blocksCnt int
	 */
	public void setBlocksCnt(int blocksCnt) {
		this.blocksCnt = blocksCnt;
	}

	/**
	 * transCnt attribute를 리턴한다.
	 * @return int
	 */
	public int getTransCnt() {
		return transCnt;
	}

	/**
	 * transCnt attribute 값을 설정한다.
	 * @param transCnt int
	 */
	public void setTransCnt(int transCnt) {
		this.transCnt = transCnt;
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