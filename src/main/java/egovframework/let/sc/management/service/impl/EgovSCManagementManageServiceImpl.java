package egovframework.let.sc.management.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.sc.management.service.EgovSCManagementManageService;
import egovframework.let.sc.management.service.PeerVO;
import egovframework.let.sc.management.service.TransactionVO;
import egovframework.let.sc.management.service.BlockVO;
import egovframework.let.sc.management.service.ChaincodeVO;
import egovframework.let.sc.management.service.ChannelVO;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.property.EgovPropertyService;


/**
 * Dashboard를 위한 서비스 구현 클래스
 */
@Service("EgovSCManagementManageService")
public class EgovSCManagementManageServiceImpl extends EgovAbstractServiceImpl implements EgovSCManagementManageService {

	@Resource(name = "SCManagementManageDAO")
	private SCManagementManageDAO scManagementMngDAO;

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	
	
	/**
	 * 조건에 맞는 피어를 조회 한다.(ASC)
	 */
	@Override
	public Map<String, Object>  selectPeerList(PeerVO peerVO) throws Exception {		
		
		List<PeerVO> list = scManagementMngDAO.selectPeerList(peerVO);
		List<PeerVO> result = new ArrayList<PeerVO>();

		result = list;

		int cnt = scManagementMngDAO.selectPeerListCnt(peerVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	
	
	
	/**
	 * 조건에 맞는 피어를 조회 한다.(DESC)
	 */
	@Override
	public Map<String, Object>  selectPeerReverseList(PeerVO peerVO) throws Exception {		
		
		List<PeerVO> list = scManagementMngDAO.selectPeerReverseList(peerVO);
		List<PeerVO> result = new ArrayList<PeerVO>();

		result = list;

		int cnt = scManagementMngDAO.selectPeerListCnt(peerVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	
	
	
	
	/**
	 * 조건에 맞는 블럭을 조회 한다.
	 */
	@Override
	public Map<String, Object>  selectBlockList(BlockVO blockVO) throws Exception {		
		
		List<BlockVO> list = scManagementMngDAO.selectBlockList(blockVO);
		List<BlockVO> result = new ArrayList<BlockVO>();

		result = list;

		int cnt = scManagementMngDAO.selectBlockListCnt(blockVO);
		Map<String, Object> map = new HashMap<String, Object>();
		

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	
	
	
	/**
	 * Dashboard용 조건에 맞는 블럭을 조회 한다.
	 */
	@Override
	public Map<String, Object>  selectDBlockList(BlockVO blockVO) throws Exception {		
		
		List<BlockVO> list = scManagementMngDAO.selectDBlockList(blockVO);
		List<BlockVO> result = new ArrayList<BlockVO>();
		
		for (BlockVO s : list) {

			String temp = s.getDateDiff();
			if(temp.contains("day")) {
				String token = temp.substring(0, temp.indexOf("day")-1);
//				System.out.println("++++++"+token);
				int temp1 = Integer.parseInt(token);
				
				if(temp1 == 7) {
					s.setTimeDiff("1주 전");
				}
				else if(temp1 < 7) {
					s.setTimeDiff(temp1+"일 전"); 
					
				}else if(temp1 > 7) {
					double  year;
					double  month;
					double  week;
					double  day;
					
					if(temp1 < 30) {
			    		week = Math.floor(temp1/7);
			    		day = temp1 - (week*7);
			    		s.setTimeDiff(String.format("%.0f", week) + "주 " + String.format("%.0f", day) + "일 전");
			    	} else if (temp1 < 365) {
			    		month = Math.floor(temp1/30);
			    		week = Math.floor((temp1-(month*30))/7);
			    		day   = temp1 - (month * 30) - (week*7);
			    		s.setTimeDiff(String.format("%.0f", month) + "개월 " + String.format("%.0f", week) + "주 " +
			    						String.format("%.0f", day) + "일 전");
			    	} else {
			    		year  = Math.floor(temp1/365);
			    		month = Math.floor((temp1-(year*365))/30);
			    		week = Math.floor((temp1-(year*365)-(month*30))/7);
			    		day   = temp1 - (year*365) - (month*30) - (week*7);
			    		s.setTimeDiff(String.format("%.0f", year) + "년 " + String.format("%.0f", month) + "개월 "  +
			    						String.format("%.0f", week) + "주 " + String.format("%.0f", day) + "일 전");
			    	}			
					
				}
							
			}else {
				String tokens[] = temp.split(":");
				
				for(int i=0;i<tokens.length;i++){
//					System.out.println("++++++"+tokens[i]);
					if(!tokens[i].equals("00")) {
						if(i == 0) {
							if(tokens[i].startsWith("0"))
								s.setTimeDiff(tokens[i].substring(1)+"시간 전");
							else
								s.setTimeDiff(tokens[i]+"시간 전");
							break; 
						}
						else if(i == 1) {
							if(tokens[i].startsWith("0"))
								s.setTimeDiff(tokens[i].substring(1)+"분 전");
							else
								s.setTimeDiff(tokens[i]+"분 전");
							break; 
						}
						else if(i == 2) {
							if(tokens[i].startsWith("0"))
								s.setTimeDiff(tokens[i].substring(1, tokens[i].indexOf("."))+"초 전");
							else
								s.setTimeDiff(tokens[i].substring(0, tokens[i].indexOf("."))+"초 전");
							break; 
						}
					}
				}						
			}	
//			System.out.println("++++++ ["+s.getTimeDiff()+"]");
		}

		result = list;

//		int cnt = scManagementMngDAO.selectDBlockListCnt(blockVO);
		Map<String, Object> map = new HashMap<String, Object>();
		

		map.put("resultList", result);
//		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}		
	
	
	/**
	 * 하루 시간별 블럭 총계를 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockHourCntList(BlockVO blockVO) throws Exception {

		return scManagementMngDAO.selectBlockHourCntList(blockVO);
	
	}
	

	/**
	 * 하루 분별 블럭 총계를 조회 한다.
	 * @return
	 * 
	 * @param BlockVO
	 * @exception Exception Exception
	 */
	public BlockVO selectBlockMinCntList(BlockVO blockVO) throws Exception {

		return scManagementMngDAO.selectBlockMinCntList(blockVO);
	
	}
	
	
	/**
	 * 조건에 맞는 블럭 1건을 조회 한다.
	 */
	@Override
	public BlockVO selectBlockArticle(BlockVO blockVO) throws Exception {

		return scManagementMngDAO.selectBlockArticle(blockVO);
	}
		
	
	/**
	 * 조건에 맞는 트랜잭션을 조회 한다.
	 */
	@Override
	public Map<String, Object>  selectTransactionList(TransactionVO transactionVO) throws Exception {		
		
		List<TransactionVO> list = scManagementMngDAO.selectTransactionList(transactionVO);
		List<TransactionVO> result = new ArrayList<TransactionVO>();

		result = list;

		int cnt = scManagementMngDAO.selectTransactionListCnt(transactionVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	

	
	/**
	 * 하루 시간별 트랜잭션을 총계를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionHourCntList(TransactionVO transactionVO) throws Exception {

		return scManagementMngDAO.selectTransactionHourCntList(transactionVO);
	
	}
	
	
	/**
	 * 하루 분별 트랜잭션을 총계를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	public TransactionVO selectTransactionMinCntList(TransactionVO transactionVO) throws Exception {

		return scManagementMngDAO.selectTransactionMinCntList(transactionVO);
	
	}
		
	
	/**
	 * 조건에 맞는 트랜잭션 1건을 조회 한다.
	 */
	@Override
	public TransactionVO selectTransactionArticle(TransactionVO transactionVO) throws Exception {

		return scManagementMngDAO.selectTransactionArticle(transactionVO);
	}
	
	
	/**
	 * 조건에 맞는 체인코드를 조회 한다.
	 */
	@Override
	public Map<String, Object>  selectChaincodeList(ChaincodeVO chaincodeVO) throws Exception {		
		
		List<ChaincodeVO> list = scManagementMngDAO.selectChaincodeList(chaincodeVO);
		List<ChaincodeVO> result = new ArrayList<ChaincodeVO>();

		result = list;

		int cnt = scManagementMngDAO.selectChaincodeListCnt(chaincodeVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	
	
	
	/**
	 * 조건에 맞는 채널을 조회 한다.
	 */
	@Override
	public Map<String, Object>  selectChannelList(ChannelVO channelVO) throws Exception {		
		
		List<ChannelVO> list = scManagementMngDAO.selectChannelList(channelVO);
		List<ChannelVO> result = new ArrayList<ChannelVO>();

		result = list;

		int cnt = scManagementMngDAO.selectChannelListCnt(channelVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;
	}	
	

	/**
	 * 조건에 맞는 조건에 맞는 Block 수를 조회 한다.
	 */
	@Override
	public BlockVO selectBlockCount(BlockVO blockVO) throws Exception {
		
		int cnt = scManagementMngDAO.selectBlockCount(blockVO);
		blockVO.setcountBlock(cnt);
		return blockVO;
	}	
	
	
	/**
	 * 조건에 맞는 조건에 맞는 Transaction 수를 조회 한다.
	 */
	@Override
	public TransactionVO selectTransactionCount(TransactionVO transactionVO) throws Exception {

		int cnt = scManagementMngDAO.selectTransactionCount(transactionVO);
		transactionVO.setCountTransaction(cnt);
		return transactionVO;
	}	

	/**
	 * 조건에 맞는 조건에 맞는 Peer 수를 조회 한다.
	 */
	@Override
	public int selectPeerCount() throws Exception {

		int cnt = scManagementMngDAO.selectPeerCount();
		return cnt;
	}	
	
	/**
	 * 조건에 맞는 조건에 맞는 Chaincode 수를 조회 한다.
	 */
	@Override
	public ChaincodeVO selectChaincodeCount(ChaincodeVO chaincodeVO) throws Exception {

		int cnt = scManagementMngDAO.selectChaincodeCount(chaincodeVO);
		chaincodeVO.setCountChaincode(cnt);
		return chaincodeVO;

	}		
	
	
	/**
	 * 생성자별 트랜잭션 총 갯수를 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	@Override
	public Map<String, Object> selectTransactionCMspIdCntList(TransactionVO transactionVO) throws Exception {
		
		List<TransactionVO> list = scManagementMngDAO.selectTransactionCMspIdCntList(transactionVO);
		List<TransactionVO> result = new ArrayList<TransactionVO>();
		
		result = list;

		int cnt = scManagementMngDAO.selectTransactionCMspIdCntListCount(transactionVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));
		
		return map;		
	}
	
	
	/**
	 * 생성자명을 조회 한다.
	 * @return
	 * 
	 * @param TransactionVO
	 * @exception Exception Exception
	 */
	@Override
	public Map<String, Object> selectTransactionCMspIdList(TransactionVO transactionVO) throws Exception {
		
		List<TransactionVO> list = scManagementMngDAO.selectTransactionCMspIdList(transactionVO);
		List<TransactionVO> result = new ArrayList<TransactionVO>();
		
		result = list;

//		int cnt = scManagementMngDAO.selectTransactionCMspIdListCount(transactionVO);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", result);
//		map.put("resultCnt", Integer.toString(cnt));
		
		return map;		
	}
	
}