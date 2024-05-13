package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 스마트컨트랙트의 채널를 위한 클래스
 */
public class Chaincode implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	/** 체인코드 아이디 */
	private int id = 0;
	/** 체인코드명 */
	private String name;
	/** 버전 */
	private String version;
	/** path */
	private String path;
	/** 트랜잭션수 */
	private int txCount = 0;
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
	 * version attribute 를 리턴한다.
	 * @return String
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * version attribute 값을 설정한다.
	 * @param version String
	 */
	public void setVersion(String version) {
		this.version = version;
	}	

	/**
	 * path attribute 를 리턴한다.
	 * @return String
	 */
	public String getPath() {
		return path;
	}
	
	/**
	 * path attribute 값을 설정한다.
	 * @param path String
	 */
	public void setPath(String path) {
		this.path = path;
	}		
	
	/**
	 * txCount attribute를 리턴한다.
	 * @return int
	 */
	public int getTxCount() {
		return txCount;
	}

	/**
	 * txCount attribute 값을 설정한다.
	 * @param txCount int
	 */
	public void setTxCount(int txCount) {
		this.txCount = txCount;
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