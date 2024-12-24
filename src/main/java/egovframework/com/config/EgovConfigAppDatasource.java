package egovframework.com.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName : EgovConfigAppDatasource.java
 * @Description : DataSource 설정
 *
 * @author : 윤주호
 * @since  : 2021. 7. 20
 * @version : 1.0
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일              수정자               수정내용
 *  -------------  ------------   ---------------------
 *   2021. 7. 20    윤주호               최초 생성
 * </pre>
 *
 */
@Configuration
public class EgovConfigAppDatasource {

	private static final Logger logger = LoggerFactory.getLogger(EgovConfigAppDatasource.class);
	
	// DataSource를 멤버 변수로 선언
    private DataSource dataSource;

	/**
	 *  @Value 을 어노테이션을 이용하는 방법
	 */
	//	@Value("${Globals.DbType}")
	//	private String dbType;
	//
	//	@Value("${Globals.DriverClassName}")
	//	private String className;
	//
	//	@Value("${Globals.Url}")
	//	private String url;
	//
	//	@Value("${Globals.UserName}")
	//	private String userName;
	//
	//	@Value("${Globals.Password}")
	//	private String password;
	
	@Value("${Globals.db.maxTotal}")
    private int maxTotal;

    @Value("${Globals.db.maxIdle}")
    private int maxIdle;

    @Value("${Globals.db.minIdle}")
    private int minIdle;

    @Value("${Globals.db.initialSize}")
    private int initialSize;

    @Value("${Globals.db.testOnBorrow}")
    private boolean testOnBorrow;
    
    @Value("${Globals.db.validationQuery}")
    private String validationQuery;

    @Value("${Globals.db.validationQueryTimeout}")
    private int validationQueryTimeout;

    @Value("${Globals.db.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${Globals.db.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${Globals.db.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${Globals.db.maxWaitMillis}")
    private int maxWaitMillis;

	/**
	 *  Environment 의존성 주입하여 사용하는 방법
	 */

	@Autowired
	Environment env;

	private String dbType;

	private String className;

	private String url;

	private String userName;

	private String password;

	@PostConstruct
	void init() {
		dbType = env.getProperty("Globals.DbType");
		//Exception 처리 필요
		className = env.getProperty("Globals." + dbType + ".DriverClassName");
		url = env.getProperty("Globals." + dbType + ".Url");
		userName = env.getProperty("Globals." + dbType + ".UserName");
		password = env.getProperty("Globals." + dbType + ".Password");
//		logger.error("========== className : "+className);
//		logger.error("========== url : "+url);
//		logger.error("========== userName : "+userName);
//		logger.error("========== password : "+password);
		
//	    // 커넥션 풀 상태 점검 및 초기화
//	    DataSource newDataSource = checkAndResetConnections();  // 새 데이터 소스를 반환받음
//	    
//	    // checkAndResetConnections가 null을 반환하지 않는지 확인
//	    if (newDataSource != null) {
//            this.dataSource = newDataSource;  // 멤버 변수에 새로 초기화된 DataSource를 설정
//        } else {
//            // 실패한 경우, 적절한 예외 처리 또는 로깅
//            logger.error("DataSource initialization failed.");
//        }
	}

	/**
	 * @return [dataSource 설정] HSQL 설정
	 */
	private DataSource dataSourceHSQL() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.HSQL)
			.setScriptEncoding("UTF8")
			.addScript("classpath:/db/shtdb.sql")
			//			.addScript("classpath:/otherpath/other.sql")
			.build();
	}

	/**
	 * @return [dataSource 설정] basicDataSource 설정
	 */
	private DataSource basicDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource .setDriverClassName(className);
		dataSource .setUrl(url);
		dataSource .setUsername(userName);
		dataSource .setPassword(password);
//		logger.error("========== className : "+className);
//		logger.error("========== url : "+url);
//		logger.error("========== userName : "+userName);
//		logger.error("========== password : "+password);
		
		 // 커넥션 풀 설정
		dataSource .setMaxTotal(maxTotal);
        dataSource .setMaxIdle(maxIdle);
        dataSource .setMinIdle(minIdle);
        dataSource .setInitialSize(initialSize);

        // DB 연결 유효성 검사 설정
        dataSource .setTestOnBorrow(testOnBorrow);
        dataSource .setValidationQuery(validationQuery);
        dataSource .setValidationQueryTimeout(validationQueryTimeout);
        
        // 유휴 상태 커넥션 검사 및 재시도 설정
        dataSource .setTestWhileIdle(testWhileIdle);
        dataSource .setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource .setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);

        // 커넥션 대기 시간 설정        
        dataSource .setMaxWaitMillis(maxWaitMillis);		
		
		return dataSource ;
	}

//	// 커넥션 풀 점검 및 재설정
//	private DataSource checkAndResetConnections() {
//		logger.info("========== checkAndResetConnections() ");
//		if (this.dataSource != null && !((BasicDataSource) this.dataSource).isClosed()) {
//	        logger.info("========== DataSource is already open and valid.");
//	        return this.dataSource;  // 이미 열린 상태라면 새로 열지 않음
//	    }
//		
//        if ("psql".equals(dbType) && className != null && url != null) {
//        	logger.info("== PSQL ======== checkAndResetConnections() ");
//            BasicDataSource dataSource = (BasicDataSource) dataSource();
//            
//            try {
//                // 기존 데이터 소스를 종료하고 새로 설정
//                if (dataSource != null && !dataSource.isClosed()) {
//                    dataSource.close();  // 기존 커넥션 풀을 닫음
//                    logger.info("========== DataSource connections closed.");
//                }
//                logger.info("========== After DataSource connections closed.");
//                
//                // 데이터 소스가 닫혔거나 null이면 새 데이터 소스 생성
//                if (dataSource == null || dataSource.isClosed()) {
//                    dataSource = (BasicDataSource) basicDataSource(); // 새 데이터 소스를 설정하고 반환
//                    logger.info("========== DataSource connections reset.");
//                }
//                logger.info("========== After DataSource connections reset.");
//
//                // 잠시 대기하여 커넥션 풀 초기화가 완료되도록 할 수 있음 (Optional)
//                Thread.sleep(1000);  // 1초 대기 (필요시 조정)
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            return dataSource;  // 새로운 데이터 소스를 반환
//        }
//        return null;  // dbType이 "psql"이 아닐 경우 null 반환
//    }
	
	/**
	 * @return [DataSource 설정]
	 */
	@Bean(name = {"dataSource", "egov.dataSource", "egovDataSource"})
	public DataSource dataSource() {
		if ("hsql".equals(dbType)) {
			return dataSourceHSQL();
		} else {
			return basicDataSource();
		}
//		return checkAndResetConnections();  // 새로운 DataSource 반환
	}
	
	@PostConstruct
	public void validateDataSource() {
	    try {
	        if (dataSource instanceof BasicDataSource) {
	            BasicDataSource ds = (BasicDataSource) dataSource;
	            if (ds.isClosed()) {
	                logger.error("========== DataSource is closed after initialization.");
	            } else {
	                logger.info("========== DataSource is open and ready for use.");
	            }
	        }
	    } catch (Exception e) {
	        logger.error("========== Error checking DataSource status", e);
	    }
	}
	
	@PostConstruct
	public void testDataSourceConnection() {
		if (this.dataSource == null) {
	        logger.error("========== DataSource has not been initialized yet.");
	        return;
	    }
		
	    try (Connection connection = dataSource.getConnection()) {
	        if (connection.isValid(1)) {
	            logger.info("========== Test query executed successfully. DataSource is valid.");
	        } else {
	            logger.error("========== Test query failed. DataSource might be closed.");
	        }
	    } catch (SQLException e) {
	        logger.error("========== Error testing DataSource connection.", e);
	    }
	}
	
}
