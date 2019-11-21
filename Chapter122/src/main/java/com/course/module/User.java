package com.course.module;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDetele;

    @Override
    public String toString(){
        return(
                "{id:"+id+
                 "userName:"+userName+
                   "password:"+password+
                     "sex:"+sex+
                       "age:"+age+
                         "permission:"+permission+
                           "isDetele:"+isDetele+"}"
                );
    }
}
