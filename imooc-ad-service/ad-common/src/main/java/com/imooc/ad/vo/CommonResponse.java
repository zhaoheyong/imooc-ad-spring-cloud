package com.imooc.ad.vo;


import java.io.Serializable;

/**
 * Created by Qinyi.
 */

public class CommonResponse<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;
    
    

    public Integer getCode() {
		return code;
	}



	public void setCode(Integer code) {
		this.code = code;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}

    

	public CommonResponse() {
		super();
	}
	
	



	public CommonResponse(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}



	public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
