package egovframework.let.sc.management.service.impl;
import java.util.List;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.LoggerFactory;
import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;

import org.springframework.stereotype.Repository;

import egovframework.let.sc.management.service.BlockVO;
import egovframework.let.sc.management.service.ChaincodeVO;
import egovframework.let.sc.management.service.ChannelVO;
import egovframework.let.sc.management.service.PeerVO;
import egovframework.let.sc.management.service.TransactionVO;

/**
 * Dashboard를 위한 데이터 접근 클래스
 */        
@Repository("SCManagementManageDAO")
public class SCManagementManageDAO extends EgovAbstractMapper {
	
	 @Resource(name = "sqlSession")
	    public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
	    	LoggerFactory.getLogger(SCManagementManageDAO.class).debug("###########sqlSession(dataSource) 바인딩");
	    	super.setSqlSessionFactory(sqlSession);
	    }

	 
	    /**
	     * 조건에 맞는 피어를 조회 한다.(ASC)
	     *
	     * @param PeerVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<PeerVO> selectPeerList(PeerVO peerVO) throws Exception {
	    	
	    	return (List<PeerVO>) list("SCManagementManageDAO.selectPeerList", peerVO);
	    }

	    
	    /**
	     * 조건에 맞는 피어를 조회 한다.(DESC)
	     *
	     * @param PeerVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<PeerVO> selectPeerReverseList(PeerVO peerVO) throws Exception {
	    	
	    	return (List<PeerVO>) list("SCManagementManageDAO.selectPeerReverseList", peerVO);
	    }
	    
	    
	    /**
	     * 조건에 맞는 피어에 대한 전체 건수를 조회 한다.
	     *
	     * @param PeerVO
	     * @return
	     * @throws Exception
	     */
	    public int selectPeerListCnt(PeerVO peerVO) throws Exception {
	    	
	    	return (Integer)selectOne("SCManagementManageDAO.selectPeerListCnt", peerVO);
	    }
	 
	 
	    /**
	     * 조건에 맞는 블럭을 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<BlockVO> selectBlockList(BlockVO blockVO) throws Exception {
	    	
	    	return (List<BlockVO>) list("SCManagementManageDAO.selectBlockList", blockVO);
	    }

	    
	    /**
	     * Dashboard용 조건에 맞는 블럭을 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<BlockVO> selectDBlockList(BlockVO blockVO) throws Exception {
	    	
	    	return (List<BlockVO>) list("SCManagementManageDAO.selectDBlockList", blockVO);
	    }
	    

	    /**
	     * 조건에 맞는 블럭에 대한 전체 건수를 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    public int selectBlockListCnt(BlockVO blockVO) throws Exception {
	    	
	    	return (Integer)selectOne("SCManagementManageDAO.selectBlockListCnt", blockVO);
	    }
	    
	    
	    /**
	     * 하루 시간별 블럭 총계를 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    public BlockVO selectBlockHourCntList(BlockVO blockVO) throws Exception {
	    	
	    	return (BlockVO)selectOne("SCManagementManageDAO.selectBlockHourCntList", blockVO);
	    }
	    
	    /**
	     * 하루 분별 블럭 총계를 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    public BlockVO selectBlockMinCntList(BlockVO blockVO) throws Exception {
	    	
	    	return (BlockVO)selectOne("SCManagementManageDAO.selectBlockMinCntList", blockVO);
	    } 
	    
	    /**
	     * 조건에 맞는 블럭 1건을 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */	    
	    public BlockVO selectBlockArticle(BlockVO blockVO) throws Exception {
	    	
	    	return (BlockVO)selectOne("SCManagementManageDAO.selectBlockArticle", blockVO);
	    }
	    
	    
	    /**
	     * 조건에 맞는 트랜잭션을 조회 한다.
	     *
	     * @param TransactionVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<TransactionVO> selectTransactionList(TransactionVO transactionVO) throws Exception {
	    	
	    	return (List<TransactionVO>) list("SCManagementManageDAO.selectTransactionList", transactionVO);
	    }


	    /**
	     * 조건에 맞는 트랜잭션에 대한 전체 건수를 조회 한다.
	     *
	     * @param TransactionVO
	     * @return
	     * @throws Exception
	     */
	    public int selectTransactionListCnt(TransactionVO transactionVO) throws Exception {
	    	
	    	return (Integer)selectOne("SCManagementManageDAO.selectTransactionListCnt", transactionVO);
	    }

	    
	    /**
	     * 하루 시간별 트랜잭션 총계를 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    public TransactionVO selectTransactionHourCntList(TransactionVO transactionVO) throws Exception {
	    	
	    	return (TransactionVO)selectOne("SCManagementManageDAO.selectTransactionHourCntList", transactionVO);
	    }
	    
	    /**
	     * 하루 분별 트랜잭션 총계를 조회 한다.
	     *
	     * @param BlockVO
	     * @return
	     * @throws Exception
	     */
	    public TransactionVO selectTransactionMinCntList(TransactionVO transactionVO) throws Exception {
	    	
	    	return (TransactionVO)selectOne("SCManagementManageDAO.selectTransactionMinCntList", transactionVO);
	    }
	    
	    
	    /**
	     * 조건에 맞는 트랜잭션 1건을 조회 한다.
	     *
	     * @param TransactionVO
	     * @return
	     * @throws Exception
	     */	    
	    public TransactionVO selectTransactionArticle(TransactionVO transactionVO) throws Exception {
	    	
	    	return (TransactionVO)selectOne("SCManagementManageDAO.selectTransactionArticle", transactionVO);
	    }    
	    
	    
	    
	    /**
	     * 조건에 맞는 체인코드를 조회 한다.
	     *
	     * @param ChaincodeVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<ChaincodeVO> selectChaincodeList(ChaincodeVO chaincodeVO) throws Exception {
	    	
	    	return (List<ChaincodeVO>) list("SCManagementManageDAO.selectChaincodeList", chaincodeVO);
	    }


	    /**
	     * 조건에 맞는 체인코드에 대한 전체 건수를 조회 한다.
	     *
	     * @param ChaincodeVO
	     * @return
	     * @throws Exception
	     */
	    public int selectChaincodeListCnt(ChaincodeVO chaincodeVO) throws Exception {
	    	
	    	return (Integer)selectOne("SCManagementManageDAO.selectChaincodeListCnt", chaincodeVO);
	    }
	    
	    
	    /**
	     * 조건에 맞는 채널을 조회 한다.
	     *
	     * @param ChannelVO
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<ChannelVO> selectChannelList(ChannelVO channelVO) throws Exception {
	    	
	    	return (List<ChannelVO>) list("SCManagementManageDAO.selectChannelList", channelVO);
	    }


	    /**
	     * 조건에 맞는 채널에 대한 전체 건수를 조회 한다.
	     *
	     * @param ChannelVO
	     * @return
	     * @throws Exception
	     */
	    public int selectChannelListCnt(ChannelVO channelVO) throws Exception {
	    	
	    	return (Integer)selectOne("SCManagementManageDAO.selectChannelListCnt", channelVO);
	    }
	    	 
	 
    /**
     * 조건에 맞는 조건에 맞는 Block 수를 조회 한다.
     *
     * @param BlockVO
     * @return
     * @throws Exception
     */
    public int selectBlockCount(BlockVO blockVO) throws Exception {
    	
    	return (Integer)selectOne("SCManagementManageDAO.selectBlockCount", blockVO);
    }

    /**
     * 조건에 맞는 조건에 맞는 Transaction 수를 조회 한다.
     *
     * @param TransactionVO
     * @return
     * @throws Exception
     */
    public int selectTransactionCount(TransactionVO transactionVO) throws Exception {
    	
    	return (Integer)selectOne("SCManagementManageDAO.selectTransactionCount", transactionVO);
    }
    
    /**
     * 조건에 맞는 조건에 맞는 Chaincode 수를 조회 한다.
     *
     * @param ChaincodeVO
     * @return
     * @throws Exception
     */
    public int selectChaincodeCount(ChaincodeVO chaincodeVO) throws Exception {
    	
    	return (Integer)selectOne("SCManagementManageDAO.selectChaincodeCount", chaincodeVO);
    }
    
    /**
     * 생성자별 트랜잭션 총 갯수를 조회 한다.
     *
     * @param TransactionVO
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<TransactionVO> selectTransactionCMspIdCntList(TransactionVO transactionVO) throws Exception {
    	
    	return (List<TransactionVO>) list("SCManagementManageDAO.selectTransactionCMspIdCntList", transactionVO);
    }
    
    
    /**
     * 생성자명을 조회 한다.
     *
     * @param TransactionVO
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<TransactionVO> selectTransactionCMspIdList(TransactionVO transactionVO) throws Exception {
    	
    	return (List<TransactionVO>) list("SCManagementManageDAO.selectTransactionCMspIdList", transactionVO);
    }
    
    /**
     * 생성자별 트랜잭션 총 갯수의 조회에 대한 전체 건수를 조회 한다.
     *
     * @param TransactionVO
     * @return
     * @throws Exception
     */
    public int selectTransactionCMspIdCntListCount(TransactionVO transactionVO) throws Exception {
    	
    	return (Integer)selectOne("SCManagementManageDAO.selectTransactionCMspIdCntListCount", transactionVO);
    }


	public int selectPeerCount() {
		// TODO Auto-generated method stub
		
		return (Integer)selectOne("SCManagementManageDAO.selectPeerCount");
	}
    
}
