package com.zong.pay.facade.account.entity;

import com.zong.paycommon.entity.BaseEntity;

/**
 * 账户资金冻结/解冻历史
 *
 * @author 宗叶青 on 2017/8/22/22:22
 */
public class AccountFrozenHistory extends BaseEntity{
    private static final long serialVersionUID = -7165652296985773807L;

    /**
     * 请求号
     */
    private String requestNo;
    /**
     * 账户编号
     */
    private String accountNo;
    /**
     * 冻结/解冻金额
     */
    private Double amount = 0D;
    /**
     * 当前冻结金额
     */
    private Double currentAmount = 0D;
    /**
     * 描述
     */
    private String remark;
    /**
     * 冻结/解冻(AccountFrozenHistoryTypeEnum)
     */
    private Integer accountFrozenHistoryType;
    /**
     * 交易类型（枚举AccountTradeTypeEnum）
     */
    private Integer trxType;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAccountFrozenHistoryType() {
        return accountFrozenHistoryType;
    }

    public void setAccountFrozenHistoryType(Integer accountFrozenHistoryType) {
        this.accountFrozenHistoryType = accountFrozenHistoryType;
    }

    public Integer getTrxType() {
        return trxType;
    }

    public void setTrxType(Integer trxType) {
        this.trxType = trxType;
    }
}
