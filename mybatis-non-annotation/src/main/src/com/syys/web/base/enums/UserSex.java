package com.syys.web.base.enums;

/**
 * Created by Administrator on 2018/4/2.
 */
public enum UserSex {

    MAN("1","男"),
    WOMAN("0","女");

    private String code;
    private String dscp;

    UserSex(String code, String dscp) {
        this.code = code;
        this.dscp = dscp;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDscp() {
        return dscp;
    }
    public void setDscp(String dscp) {
        this.dscp = dscp;
    }

    //通过code的值来获取Sex枚举类型，数据库只需保存code，通过代码解析成Sex类型
    public static UserSex getUserSex(String code) {
        for(UserSex userSex : UserSex.values()) {
            if(userSex.getCode().equals(code)) {
                return userSex;
            }
        }
        return null;
    }

}
