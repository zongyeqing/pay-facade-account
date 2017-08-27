package com.zong.pay.facade.account.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 账户资金变动方向
 * @author 宗叶青 on 2017/8/22/20:06
 */
public enum AccountFundDirectionEnum {

    ADD("加款", 123),

    SUB("见款", 321),

    FROZEN("冻结", 321),

    UNFROZEN("解冻", 123);

    /**枚举值*/
    private int value;

    /**描述*/
    private String desc;

    private AccountFundDirectionEnum(String desc, int value){
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static AccountFundDirectionEnum getEum(int value){
        AccountFundDirectionEnum resultEnum = null;
        AccountFundDirectionEnum[] enumAry = AccountFundDirectionEnum.values();
        for(int i = 0; i < enumAry.length; i++){
            if(enumAry[i].getValue() == value){
                resultEnum = enumAry[i];
                break;
            }
        }
        return resultEnum;
    }

    public static Map<String, Map<String, Object>> toMap(){
        AccountFundDirectionEnum[] ary = AccountFundDirectionEnum.values();
        Map<String, Map<String, Object>> enumMap = new HashMap<>();
        for(int num = 0; num < ary.length; num++){
            Map<String, Object> map = new HashMap<>();
            String key = String.valueOf(getEum(ary[num].getValue()));
            map.put("value", String.valueOf(ary[num].getValue()));
            map.put("desc", ary[num].getDesc());
            enumMap.put(key, map);
        }
        return enumMap;
    }

    public static List toList(){
        AccountFundDirectionEnum[] ary = AccountFundDirectionEnum.values();
        List list = new ArrayList();
        for(int i = 0; i <ary.length; i++){
            Map<String, String> map = new HashMap<>();
            map.put("value", String.valueOf(ary[i].getValue()));
            map.put("desc", ary[i].getDesc());
            list.add(map);
        }
        return list;
    }
}
