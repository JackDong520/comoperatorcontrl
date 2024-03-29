package com.wyfx.business.controller.commons;

/**
 * @author johnson liu
 * @date 2019/11/2
 * @description 自定义系统内部异常类
 */
public class SafetyHatException extends RuntimeException {
    private static final long serialVersionUID = 3554002511449958741L;

    public SafetyHatException(String message) {
        super(message);
    }
}
