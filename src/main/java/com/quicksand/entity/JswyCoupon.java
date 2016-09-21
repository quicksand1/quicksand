package com.quicksand.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 优惠券
 * Created by WANG on 2016/8/26.
 */
@Entity
@Table(name = "jswy_coupon", schema = "")
@SuppressWarnings("serial")
public class JswyCoupon  implements java.io.Serializable {
    private Integer id;
    private Integer couponTemplateId;
    private String bigType;
    private String busType;
    private String code;
    private String stationId;
    private String stationName;
    private double money;
    private double minMoney;
    private int theTerm;
    private Date startDate;
    private Date endDate;
    private String startTime;
    private String endTime;
    private int status;
    private String receiveUserId;
    private Date receiveTime;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="ID",nullable=false,length=11)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponTemplateId() {
        return couponTemplateId;
    }

    public void setCouponTemplateId(Integer couponTemplateId) {
        this.couponTemplateId = couponTemplateId;
    }

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(double minMoney) {
        this.minMoney = minMoney;
    }

    public int getTheTerm() {
        return theTerm;
    }

    public void setTheTerm(int theTerm) {
        this.theTerm = theTerm;
    }

    @Column(name="StartDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name="EndDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
}
