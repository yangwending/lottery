package com.superywd.library.properties.exception;

/**
 * 描述在类型值注入时可能抛出的异常
 * @author 迷宫的中心
 * @date 2019/3/1 23:21
 */

public class TransformationException extends RuntimeException {

    private static final long serialVersionUID = -6641235751743285902L;


    public TransformationException() {
    }

    public TransformationException(String message) {
        super(message);
    }

    public TransformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransformationException(Throwable cause) {
        super(cause);
    }
}
