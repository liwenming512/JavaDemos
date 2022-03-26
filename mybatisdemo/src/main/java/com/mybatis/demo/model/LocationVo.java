package com.mybatis.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/11/6.
 */
public class LocationVo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *站点唯一编码
     */
    private String code;

    /**
     *站点名称
     */
    private String name;

    /**
     *站点类型
     */
    private OrgTypeEnum orgType;

    /**
     * 站点状态
     */
    private StatusTypeEnum status;

    public StatusTypeEnum getStatus() {
        return status;
    }

    public void setStatus(StatusTypeEnum status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgTypeEnum getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgTypeEnum orgType) {
        this.orgType = orgType;
    }

    private ContractCostVo contractCostVo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ContractCostVo getContractCostVo() {
        return contractCostVo;
    }

    public void setContractCostVo(ContractCostVo contractCostVo) {
        this.contractCostVo = contractCostVo;
    }
}

class ContractCostVo{
    /**
     *参考运费
     */
    private String refExp;
}
