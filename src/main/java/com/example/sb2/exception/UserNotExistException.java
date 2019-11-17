package com.example.sb2.exception;

/**
 * Created by Administrator on 2019/2/13.
 */
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
