package keshwaniIshan.FullStack_Backend.exception;

import org.aspectj.apache.bcel.classfile.Module;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find user with this id "+id);
    }
}


