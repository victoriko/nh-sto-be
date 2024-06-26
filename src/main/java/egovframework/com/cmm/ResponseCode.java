package egovframework.com.cmm;

public enum ResponseCode {

	SUCCESS(200, "성공했습니다."),
	AUTH_ERROR(403, "인가된 사용자가 아닙니다."),
	DELETE_ERROR(700, "삭제 중 내부 오류가 발생했습니다."),
	SAVE_ERROR(800, "저장시 내부 오류가 발생했습니다."),
	INPUT_CHECK_ERROR(900, "입력값 무결성 오류 입니다."),
	DB_DUP_CHECK_ERROR(880, "사용자아이디 중복 에러입니다."),  //추가됨
	BzNo_DB_DUP_CHECK_ERROR(885, "사업자번호 중복 에러입니다."),  //추가됨
	API_ERROR(890, "API처리 결과 에러 입니다.");  //추가됨


	private int code;
	private String message;

	private ResponseCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}




}
