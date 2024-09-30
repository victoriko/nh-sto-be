package egovframework.let.sc.management.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Fabric Network 상태확인을 위한 클래스
 */
@Service("EgovSCManagementManageHealthCheckService")
public class EgovSCManagementManageHealthCheckService {
	
	private final Logger log = LoggerFactory.getLogger(EgovSCManagementManageHealthCheckService.class);
	
    private RestTemplate restTemplate; // Remove final modifier

    // RestTemplate을 생성자에서 주입받지 않고 직접 초기화합니다.
    public void HealthCheckService() {
        this.restTemplate = new RestTemplate(); // RestTemplate 초기화
    }

    public Map<String, Boolean> checkHealth(List<String> urls) {
        return urls.stream().collect(Collectors.toMap(url -> url, this::checkUrl));
    }

    private Boolean checkUrl(String url) {    	
        try {
            RestTemplate restTemplate = new RestTemplate();
//        	log.info("=== url : "+url);
            String response = restTemplate.getForObject(url, String.class);
//            log.info("=== response : "+response);
            return response.contains("\"status\":\"OK\"");
        } catch (Exception e) {
//        	 log.info("=== Error while checking URL: " + url, e);
            return false;
        }
    }
	
}