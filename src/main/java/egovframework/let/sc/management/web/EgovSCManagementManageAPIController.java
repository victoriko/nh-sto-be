package egovframework.let.sc.management.web;

import java.io.File;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.ResponseCode;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.let.sc.management.service.EgovSCManagementManageService;
import egovframework.let.sc.management.service.EgovSCManagementManageHealthCheckService;
import egovframework.let.sc.management.service.PeerVO;
import egovframework.let.sc.management.service.TransactionVO;
import egovframework.let.sc.management.service.BlockVO;
import egovframework.let.sc.management.service.ChaincodeVO;
import egovframework.let.sc.management.service.ChannelVO;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class EgovSCManagementManageAPIController {

	/** EgovSCManagementManageService */

	@Resource(name = "EgovSCManagementManageService")
    private EgovSCManagementManageService scManagementMngService;
	
//	@Resource(name = "EgovSCManagementManageFabricService")
//    private EgovSCManagementManageFabricService fabricService;
	
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	@Autowired
	private DefaultBeanValidator beanValidator;
	
	private final Logger log = LoggerFactory.getLogger(EgovSCManagementManageAPIController.class);

	
	/**
	 * 조건에 맞는 피어를 조회 한다.
	 *
	 * @param peerVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/sc/management/selectPeerListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectPeerArticles(@RequestBody PeerVO peerVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(peerVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));

/*
		paginationInfo.setRecordCountPerPage(2);
		paginationInfo.setPageSize(2);
*/

		peerVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		peerVO.setLastIndex(paginationInfo.getLastRecordIndex());
		peerVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		
//		System.out.println("+++++++++++++++===="+ userVO.getPageIndex() );
	
		Map<String, Object> resultMap = scManagementMngService.selectPeerList(peerVO);

		int totCnt = Integer.parseInt((String)resultMap.get("resultCnt"));
		paginationInfo.setTotalRecordCount(totCnt);

		resultMap.put("peerVO", peerVO);
		resultMap.put("paginationInfo", paginationInfo);
		resultMap.put("user", user);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

		return resultVO;
	}	
	
	
	/**
	 * 조건에 맞는 블럭을 조회 한다.
	 *
	 * @param blockVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception  
	 */
	@RequestMapping(value = "/sc/management/selectBlockListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectBlockArticles(@RequestBody BlockVO blockVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(blockVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));

		blockVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		blockVO.setLastIndex(paginationInfo.getLastRecordIndex());
		blockVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

		if(blockVO.getSearchCnd().equals("0")) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			blockVO.setSearchWrd1(df.format(cal.getTime()));
			cal.add(Calendar.DATE, -1);
			blockVO.setSearchWrd(df.format(cal.getTime()));
		}
		
		StringTokenizer st = new StringTokenizer(blockVO.getSearchWrd2(),":");
		int i = 0;
		 while(st.hasMoreTokens()) {
			 i++;
			 String token = st.nextToken();
			 if(i == 1)
				 blockVO.setSearchWrd21(token);
			 else if(i == 2)
				 blockVO.setSearchWrd22(token);
			 else if(i == 3)
				 blockVO.setSearchWrd23(token);
			 else if(i == 4)
				 blockVO.setSearchWrd24(token);
			 else if(i == 5)
				 blockVO.setSearchWrd25(token);
			 else if(i == 6)
				 blockVO.setSearchWrd26(token);
			 else if(i == 7)
				 blockVO.setSearchWrd27(token);
			 else if(i == 8)
				 blockVO.setSearchWrd28(token);
			 else if(i == 9)
				 blockVO.setSearchWrd29(token);			 
		  }

		 /*
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd2());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd21());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd22());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd23());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd24());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd25());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd26());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd27());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd28());
		System.out.println("+++++++++++++++++++++++++ "+blockVO.getSearchWrd29());
		*/
	
		Map<String, Object> resultMap = scManagementMngService.selectBlockList(blockVO);

		int totCnt = Integer.parseInt((String)resultMap.get("resultCnt"));
		paginationInfo.setTotalRecordCount(totCnt);

		resultMap.put("blockVO", blockVO);
		resultMap.put("paginationInfo", paginationInfo);
		resultMap.put("user", user);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

		return resultVO;
	}	

	
	/**
	 * 조건에 맞는 블럭 1건을 조회 한다.
	 *
	 * @param blockVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception  
	 */	
	@RequestMapping("/sc/management/selectBlockArticleAPI.do")
	@ResponseBody
	public ResultVO selectBlockArticle(@RequestBody BlockVO blockVO)
		throws Exception {

		ResultVO resultVO = new ResultVO();

		LoginVO user = new LoginVO();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		BlockVO vo = scManagementMngService.selectBlockArticle(blockVO);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("blockVO", vo);
		resultMap.put("user", user);

		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		return resultVO;
	}
	
	
	/**
	 * 생성자명 조회 한다.
	 *
	 * @param transactionVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception  
	 */
	@RequestMapping(value = "/sc/management/selectTransactionCMspIdListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectTransactionCMspIdList(@RequestBody TransactionVO transactionVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}
		
	
		Map<String, Object> resultMap = scManagementMngService.selectTransactionCMspIdList(transactionVO);
		resultMap.put("transactionVO", transactionVO);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

		return resultVO;
	}	
	
	
	/**
	 * 조건에 맞는 트랜잭션을 조회 한다.
	 *
	 * @param transactionVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception  
	 */
	@RequestMapping(value = "/sc/management/selectTransactionListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectTransactionArticles(@RequestBody TransactionVO transactionVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(transactionVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));

		transactionVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		transactionVO.setLastIndex(paginationInfo.getLastRecordIndex());
		transactionVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
	
		if(transactionVO.getSearchCnd().equals("0")) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			transactionVO.setSearchWrd1(df.format(cal.getTime()));
			cal.add(Calendar.DATE, -1);
			transactionVO.setSearchWrd(df.format(cal.getTime()));
		}	
		
		StringTokenizer st = new StringTokenizer(transactionVO.getSearchWrd2(),":");
		int i = 0;
		 while(st.hasMoreTokens()) {
			 i++;
			 String token = st.nextToken();
			 if(i == 1)
				 transactionVO.setSearchWrd21(token);
			 else if(i == 2)
				 transactionVO.setSearchWrd22(token);
			 else if(i == 3)
				 transactionVO.setSearchWrd23(token);
			 else if(i == 4)
				 transactionVO.setSearchWrd24(token);
			 else if(i == 5)
				 transactionVO.setSearchWrd25(token);
			 else if(i == 6)
				 transactionVO.setSearchWrd26(token);
			 else if(i == 7)
				 transactionVO.setSearchWrd27(token);
			 else if(i == 8)
				 transactionVO.setSearchWrd28(token);
			 else if(i == 9)
				 transactionVO.setSearchWrd29(token);			 
		  }

		 /*
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd2());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd21());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd22());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd23());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd24());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd25());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd26());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd27());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd28());
		System.out.println("+++++++++++++++++++++++++ "+transactionVO.getSearchWrd29());
		*/
	
//		System.out.println("++++++++++++++++++++++"+transactionVO.getSearchCnd()+" "+transactionVO.getSearchWrd()+" "+transactionVO.getSearchWrd1());
//		System.out.println("++++++++++++++++++++++"+transactionVO.getSearchWrd8());
		Map<String, Object> resultMap = scManagementMngService.selectTransactionList(transactionVO);

		int totCnt = Integer.parseInt((String)resultMap.get("resultCnt"));
		paginationInfo.setTotalRecordCount(totCnt);

		resultMap.put("transactionVO", transactionVO);
		resultMap.put("paginationInfo", paginationInfo);
		resultMap.put("user", user);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

		return resultVO;
	}	


	/**
	 * 조건에 맞는 트랜잭션 1건을 조회 한다.
	 *
	 * @param transactionVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception  
	 */	
	@RequestMapping("/sc/management/selectTransactionArticleAPI.do")
	@ResponseBody
	public ResultVO selectTransactionArticle(@RequestBody TransactionVO transactionVO)
		throws Exception {
//		System.out.println("selectTransactionArticleAPI");
		
		ResultVO resultVO = new ResultVO();

		LoginVO user = new LoginVO();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		TransactionVO vo = scManagementMngService.selectTransactionArticle(transactionVO);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
//	    System.out.println("vo : "+vo.toString());
		resultMap.put("transactionVO", vo);
		resultMap.put("user", user);

		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		return resultVO;
	}
	
	
	
	
	/**
	 * 조건에 맞는 체인코드를 조회 한다.
	 *
	 * @param chaincodeVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/sc/management/selectChaincodeListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectChaincodeArticles(@RequestBody ChaincodeVO chaincodeVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(chaincodeVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));

		chaincodeVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		chaincodeVO.setLastIndex(paginationInfo.getLastRecordIndex());
		chaincodeVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
	
		Map<String, Object> resultMap = scManagementMngService.selectChaincodeList(chaincodeVO);

		int totCnt = Integer.parseInt((String)resultMap.get("resultCnt"));
		paginationInfo.setTotalRecordCount(totCnt);

		resultMap.put("chaincodeVO", chaincodeVO);
		resultMap.put("paginationInfo", paginationInfo);
		resultMap.put("user", user);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

		return resultVO;
	}	
	
	/**
	 * 조건에 맞는 채널을 조회 한다.
	 *
	 * @param channelVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/sc/management/selectChannelListAPI.do", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultVO selectChannelArticles(@RequestBody ChannelVO channelVO)
		throws Exception {
		ResultVO resultVO = new ResultVO();

		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(channelVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));

		channelVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		channelVO.setLastIndex(paginationInfo.getLastRecordIndex());
		channelVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
	
		Map<String, Object> resultMap = scManagementMngService.selectChannelList(channelVO);

		int totCnt = Integer.parseInt((String)resultMap.get("resultCnt"));
		paginationInfo.setTotalRecordCount(totCnt);

		resultMap.put("channelVO", channelVO);
		resultMap.put("paginationInfo", paginationInfo);
		resultMap.put("user", user);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		resultVO.setResult(resultMap);

//		System.out.println("++++++++++++ channelVO {} : "+channelVO);
//		ObjectMapper objectMapper = new ObjectMapper();
//		String resultVOJson = objectMapper.writeValueAsString(resultVO);
//		System.out.println("+++++++++++++++++++++ "+resultVOJson);
		
		return resultVO;
	}	
		
	
	
	/**
	 * Dashboard를 위해 조회 한다.
	 *
	 * @param BlockVO / TransactionVO / ChaincodeVO
	 * @param sessionVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/sc/management/selectDashboardAPI.do")
	@ResponseBody
	public ResultVO selectDashboard(@RequestBody  PeerVO peerVO, BlockVO blockVO, TransactionVO transactionVO, ChaincodeVO chaincodeVO)
		throws Exception {

		ResultVO resultVO = new ResultVO();

		LoginVO user = new LoginVO();
		if (EgovUserDetailsHelper.isAuthenticated()) {
			user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		}

		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(peerVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(propertyService.getInt("pageUnit"));
		paginationInfo.setPageSize(propertyService.getInt("pageSize"));
		
		// PeerVo List 생성(ASC)
//		System.out.println("=== peer");
		peerVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		peerVO.setLastIndex(paginationInfo.getLastRecordIndex());
		peerVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
//		int peerCount = scManagementMngService.selectPeerCount();
//		System.out.println("=== peerCount : "+peerCount);
		peerVO.setCountPeer(scManagementMngService.selectPeerCount());
//		System.out.println("=== peerVO.peerCount : "+peerVO.getCountPeer());
		Map<String, Object> peerMap = scManagementMngService.selectPeerList(peerVO);
		peerMap.put("peerVO", peerVO);
//		log.info("peerMap content: {}", peerMap);
		
	    // resultList만 로그로 출력
//        Object resultList = peerMap.get("resultList");
//        log.info("=== resultList: {}", resultList);

        List<PeerVO> resultList = (List<PeerVO>) peerMap.get("resultList");

        if (resultList == null) {
            log.info("=== resultList is null. Check if 'resultList' exists in peerMap.");
        }

//        log.info("=== resultList size: {}", resultList.size());

        List<String> urlList = new ArrayList<>();

        for (PeerVO result : resultList) {
//            log.info("=== Processing result: {}", result);

            String serverHostName = result.getServerHostName(); // PeerVO의 getter 메서드를 사용
//            log.info("=== Retrieved serverHostName: {}", serverHostName);

            if (serverHostName != null && serverHostName.contains(":")) {
                serverHostName = serverHostName.substring(0, serverHostName.indexOf(":"));
//                log.info("=== Modified serverHostName (port removed): {}", serverHostName);
//            } else {
//                log.info("=== serverHostName is null or does not contain a port.");
            }

            String events = result.getEvents(); // PeerVO에서 events를 String으로 반환한다고 가정
//            log.info("=== Retrieved events: {}", events);

            String url = "http://" + serverHostName + ":" + events + "/healthz";
//            log.info("=== Generated URL: {}", url);

            urlList.add(url);
        }
        // 최종 URL 리스트 출력
//        log.info("=== Final URL List: {}", urlList);
        
    	// HealrhCheckService를 사용하여 피어 및 오더러 상태를체크
		EgovSCManagementManageHealthCheckService healthCheckService = new EgovSCManagementManageHealthCheckService();

//        log.info("=== healthCheckService.checkHealth() start");
        Map<String, Boolean> healthCheckMap = healthCheckService.checkHealth(urlList); 
        healthCheckMap.forEach((url, status) -> {
//            log.info("=== URL: " + url + " - Status: " + status);
        });
//        log.info("=== healthCheckService.checkHealth() end");
        
        // URL과 resultList를 매칭하여 live 값을 설정
        for (PeerVO result : resultList) {
            String serverHostName = result.getServerHostName();

            if (serverHostName != null && serverHostName.contains(":")) {
                serverHostName = serverHostName.substring(0, serverHostName.indexOf(":")); // :port 제거
            }

            // healthCheckMap에서 URL의 도메인 이름만 비교
            for (String url : healthCheckMap.keySet()) {
                String urlDomain = url.replaceFirst("http://", "").split(":")[0]; // URL에서 도메인만 추출
                
                if (serverHostName.equals(urlDomain)) { // 도메인 이름만 비교
                    Boolean isLive = healthCheckMap.get(url);

                    if (isLive != null) {
                        result.setLive(isLive); // PeerVO의 live 필드를 업데이트
//                        log.info("=== Updated PeerVO -> serverHostName: {}, live: {}", serverHostName, isLive);
//                    } else {
//                        log.info("=== No status found for URL: {}", url);
                    }
                }
            }        
        }
//        log.info("=== healthCheckService.checkHealth() end");
        
		// PeerVo List 생성(DESC)
		peerVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		peerVO.setLastIndex(paginationInfo.getLastRecordIndex());
		peerVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
//		Map<String, Object> peerReverseMap = scManagementMngService.selectPeerReverseList(peerVO);
//		peerReverseMap.put("peerVO", peerVO);
		List<PeerVO> reversedResultList = new ArrayList<>(resultList); 
		Collections.reverse(reversedResultList); 
		Map<String, Object> peerReverseMap = new HashMap<>();
		peerReverseMap.put("resultList", reversedResultList);
		peerReverseMap.put("peerVO", peerVO);
	    // resultList만 로그로 출력
//	    Object resultReverseList = peerReverseMap.get("resultList");
//	    log.info("=== resultReverseList: {}", resultReverseList);
			
		// BlockVo List 생성
		blockVO.setFirstIndex(0);
		blockVO.setRecordCountPerPage(3);
		Map<String, Object> blockMap = scManagementMngService.selectDBlockList(blockVO);
		blockMap.put("blockVO", blockVO);
		// TransactionVo List 생성   - 생성자별
 		Map<String, Object> transactionCountMap = scManagementMngService.selectTransactionCMspIdCntList(transactionVO);
		transactionCountMap.put("transactionVO", transactionVO);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("peerMap", peerMap);
		resultMap.put("peerReverseMap", peerReverseMap);
//		System.out.println("=== peer "+peerMap.toString());
		resultMap.put("blockMap", blockMap);
//		resultMap.put("transactionMap", transactionMap);
		resultMap.put("transactionCountMap", transactionCountMap);
		BlockVO blockVO2 = scManagementMngService.selectBlockCount(blockVO);
		resultMap.put("blockVO", blockVO2);
		BlockVO blockVO3 = scManagementMngService.selectBlockHourCntList(blockVO);
		resultMap.put("blockHourVO", blockVO3);
		BlockVO blockVO4 = scManagementMngService.selectBlockMinCntList(blockVO);
		resultMap.put("blockMinVO", blockVO4);
		TransactionVO transactionVO2 = scManagementMngService.selectTransactionCount(transactionVO);
		resultMap.put("transactionVO", transactionVO2);	
		TransactionVO transactionVO3 = scManagementMngService.selectTransactionHourCntList(transactionVO);
		resultMap.put("transactionHourVO", transactionVO3);	
		TransactionVO transactionVO4 = scManagementMngService.selectTransactionMinCntList(transactionVO);
		resultMap.put("transactionMinVO", transactionVO4);	
		ChaincodeVO chaincodeVO2 = scManagementMngService.selectChaincodeCount(chaincodeVO);
		resultMap.put("chaincodeVO", chaincodeVO2);
				
		resultMap.put("user", user);

		
//		for(String key : resultMap.keySet()) {
//			System.out.println("result: "+ key + ", " + resultMap.get(key));
//			for(String k : resultMap.get(key).keySet()) { 
//				   System.out.println("persent : " + k + ":" + resultMap.get(key).get(k));
//			}
//		}
		
		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		return resultVO;
	}		

              		
	/**
	 * XSS 방지 처리.
	 *
	 * @param data
	 * @return
	 */
	protected String unscript(String data) {
		if (data == null || data.trim().equals("")) {
			return "";
		}

		String ret = data;

		ret = ret.replaceAll("<(S|s)(C|c)(R|r)(I|i)(P|p)(T|t)", "&lt;script");
		ret = ret.replaceAll("</(S|s)(C|c)(R|r)(I|i)(P|p)(T|t)", "&lt;/script");

		ret = ret.replaceAll("<(O|o)(B|b)(J|j)(E|e)(C|c)(T|t)", "&lt;object");
		ret = ret.replaceAll("</(O|o)(B|b)(J|j)(E|e)(C|c)(T|t)", "&lt;/object");

		ret = ret.replaceAll("<(A|a)(P|p)(P|p)(L|l)(E|e)(T|t)", "&lt;applet");
		ret = ret.replaceAll("</(A|a)(P|p)(P|p)(L|l)(E|e)(T|t)", "&lt;/applet");

		ret = ret.replaceAll("<(E|e)(M|m)(B|b)(E|e)(D|d)", "&lt;embed");
		ret = ret.replaceAll("</(E|e)(M|m)(B|b)(E|e)(D|d)", "&lt;embed");

		ret = ret.replaceAll("<(F|f)(O|o)(R|r)(M|m)", "&lt;form");
		ret = ret.replaceAll("</(F|f)(O|o)(R|r)(M|m)", "&lt;form");

		return ret;
	}



}


