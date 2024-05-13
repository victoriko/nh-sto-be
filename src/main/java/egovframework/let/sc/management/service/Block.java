package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 스마트컨트랙트의 채널를 위한 클래스
 */
public class Block implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	/** 블럭 아이디 */
	private int id = 0;
	/** 블럭넘버 */
	private int blockNum = 0;
	/** 데이타 해쉬값 */
	private String dataHash;
	/** 이전 데이타 해쉬값 */
	private String preHash;
	/** 트랜잭션 수 */
	private int txCount = 0;
	/** 데이타 해쉬값 */
	private String blockHash;
	/** 이전 데이타 해쉬값 */
	private String prevBlockHash;
	/** 블럭 크기 */
	private int blkSize = 0;
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
	 * blockNum attribute를 리턴한다.
	 * @return int
	 */
	public int getBlockNum() {
		return blockNum;
	}

	/**
	 * blockNum attribute 값을 설정한다.
	 * @param blockNum int
	 */
	public void setBlockNum(int blockNum) {
		this.blockNum = blockNum;
	}	
	
	/**
	 * dataHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getDataHash() {
		return dataHash;
	}
	
	/**
	 * dataHash attribute 값을 설정한다.
	 * @param dataHash String
	 */
	public void setDataHash(String dataHash) {
		this.dataHash = dataHash;
	}

	/**
	 * preHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getPreHash() {
		return preHash;
	}
	
	/**
	 * preHash attribute 값을 설정한다.
	 * @param preHash String
	 */
	public void setPreHash(String preHash) {
		this.preHash = preHash;
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
	 * blockHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getBlockHash() {
		return blockHash;
	}
	
	/**
	 * blockHash attribute 값을 설정한다.
	 * @param blockHash String
	 */
	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}	

	/**
	 * prevBlockHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getPrevBlockHash() {
		return prevBlockHash;
	}
	
	/**
	 * prevBlockHash attribute 값을 설정한다.
	 * @param prevBlockHash String
	 */
	public void setPrevBlockHash(String prevBlockHash) {
		this.prevBlockHash = prevBlockHash;
	}		
	
	/**
	 * blkSize attribute를 리턴한다.
	 * @return int
	 */
	public int getBlkSize() {
		return blkSize;
	}

	/**
	 * blkSize attribute 값을 설정한다.
	 * @param blkSize int
	 */
	public void setBlkSize(int blkSize) {
		this.blkSize = blkSize;
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