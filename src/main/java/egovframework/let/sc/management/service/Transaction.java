package egovframework.let.sc.management.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 스마트컨트랙트의 채널를 위한 클래스
 */
public class Transaction implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -4779821913760046011L;

	/** 트랜잭션 아이디 */
	private int id = 0;
	/** 트랜잭션 해쉬값 */
	private String txHash;
	/** 체인코드명 */
	private String chaincodeName;
	/** 생성자 */
	private String creatorMspId;
	/** 타입 */
	private String type;
	/** 등록 시간 */
	private String createDt;
	/** 채널생성 해쉬값 */
	private String channelGenesisHash;
	/** 네트워크명 */
	private String networkName;
	/** 유효검사결과 */
	private String validationCode;
	/** payloadProposalHash */
	private String payloadProposalHash;
	/** endorserMspId */
	private String endorserMspId;


	

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
	 * txHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getTxHash() {
		return txHash;
	}
	
	/**
	 * txHash attribute 값을 설정한다.
	 * @param txHash String
	 */
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	
	/**
	 * chaincodeName attribute 를 리턴한다.
	 * @return String
	 */
	public String getChaincodeName() {
		return chaincodeName;
	}
	
	/**
	 * chaincodeName attribute 값을 설정한다.
	 * @param chaincodeName String
	 */
	public void setChaincodeName(String chaincodeName) {
		this.chaincodeName = chaincodeName;
	}	

	/**
	 * creatorMspId attribute 를 리턴한다.
	 * @return String
	 */
	public String getCreatorMspId() {
		return creatorMspId;
	}
	
	/**
	 * creatorMspId attribute 값을 설정한다.
	 * @param creatorMspId String
	 */
	public void setCreatorMspId(String creatorMspId) {
		this.creatorMspId = creatorMspId;
	}		
	
	/**
	 * type attribute 를 리턴한다.
	 * @return String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * type attribute 값을 설정한다.
	 * @param type String
	 */
	public void setType(String type) {
		this.type = type;
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
	 * validationCode attribute 를 리턴한다.
	 * @return String
	 */
	public String getValidationCode() {
		return validationCode;
	}
	
	/**
	 * validationCode attribute 값을 설정한다.
	 * @param validationCode String
	 */
	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}
	/**
	 * payloadProposalHash attribute 를 리턴한다.
	 * @return String
	 */
	public String getPayloadProposalHash() {
		return payloadProposalHash;
	}
	
	/**
	 * payloadProposalHash attribute 값을 설정한다.
	 * @param payloadProposalHash String
	 */
	public void setPayloadProposalHash(String payloadProposalHash) {
		this.payloadProposalHash = payloadProposalHash;
	}
	
	/**
	 * endorserMspId attribute 를 리턴한다.
	 * @return String
	 */
	public String getEndorserMspId() {
		return endorserMspId;
	}
	
	/**
	 * endorserMspId attribute 값을 설정한다.
	 * @param endorserMspId String
	 */
	public void setEndorserMspId(String endorserMspId) {
		this.endorserMspId = endorserMspId;
	}
	
	
	/**
	 * toString 메소드를 대치한다.
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}