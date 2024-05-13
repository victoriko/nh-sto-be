package egovframework.let.sc.management.service;

import java.util.Map;


/**
 * 스마트컨트랙트를 위한 서비스 인터페이스  클래스
 */
public interface EgovSCManagementManageService {
	
	/**
	 * 조건에 맞는 피어를 조회 한다.(ASC)
	 * @return
	 * 
	 * @param PeerVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectPeerList(PeerVO peerVO)
	  throws Exception;
	

	/**
	 * 조건에 맞는 피어를 조회 한다.(DESC)
	 * @return
	 * 
	 * @param PeerVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectPeerReverseList(PeerVO peerVO)
	  throws Exception;
	
	
	/**
	 * 조건에 맞는 블럭을 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectBlockList(BlockVO blockVO)
	  throws Exception;
	
	
	/**
	 * Dashboard용 조건에 맞는 블럭을 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectDBlockList(BlockVO blockVO)
	  throws Exception;	

	
	/**
	 * 하루 시간별 블럭 총계를 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockHourCntList(BlockVO blockVO)
			  throws Exception;	
	
	
	/**
	 * 하루 분별 블럭 총계를 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockMinCntList(BlockVO blockVO)
			  throws Exception;	
	
	
	/**
	 * 조건에 맞는 블럭 1건을 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockArticle(BlockVO blockVO)
			  throws Exception;
	
	
	/**
	 * 조건에 맞는 트랜잭션을 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectTransactionList(TransactionVO transactionVO)
	  throws Exception;
	

	/**
	 * 하루 시간별 트랜잭션 총계를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionHourCntList(TransactionVO transactionVO)
			  throws Exception;
	
	
	/**
	 * 하루 분별 트랜잭션 총계를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionMinCntList(TransactionVO transactionVO)
			  throws Exception;
	
	
	/**
	 * 조건에 맞는 트랜잭션 1건을 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionArticle(TransactionVO transactionVO)
			  throws Exception;
	
	
	/**
	 * 조건에 맞는 체인코드를 조회 한다.
	 * @return
	 * 
	 * @param ChaincodeVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectChaincodeList(ChaincodeVO chaincodeVO)
	  throws Exception;
	
	
	/**
	 * 조건에 맞는 채널을 조회 한다.
	 * @return
	 * 
	 * @param ChannelVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectChannelList(ChannelVO channelVO)
	  throws Exception;
	
		
	/**
	 * 조건에 맞는 Block 수를 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockCount(BlockVO blockVO)
	  throws Exception;
	
	
	/**
	 * 조건에 맞는 Transaction 수를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionCount(TransactionVO transactionVO)
	  throws Exception;
	
	
	/**
	 * 조건에 맞는 Chaincode 수를 조회 한다.
	 * @return
	 * 
	 * @param ChaincodeVO
	 * @exception Exception Exception
	 */
	public ChaincodeVO selectChaincodeCount(ChaincodeVO chaincodeVO)
	  throws Exception;
	
	
	/**
	 * 생성자별 트랜잭션 총 갯수를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectTransactionCMspIdCntList(TransactionVO transactionVO)
	  throws Exception;	
	
	
	/**
	 * 생성자명을 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public Map<String, Object> selectTransactionCMspIdList(TransactionVO transactionVO)
	  throws Exception;	
	
}