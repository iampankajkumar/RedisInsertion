package com.stpl.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "st_pm_player_master")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StPmPlayerMaster implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long playerId;
	private Timestamp lastLoginDate;
	private String title;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String emailId;
	private Long mobileNo;
	private String gender;
	private String autoPassword;
	private String userName;
	private String password;
	private String status;
	private String plrStatus;
	private String verificationStatus;
	private String verificationMode;
	private Integer affiliateCode;
	private Short domainId;
	private Short aliasId;
	private String duplicationCheckReq;
	private String promoOpt;
	private String addressVerified;
	private String emailVerified;
	private String phoneVerified;
	private String ageVerified;
	private String taxationIdVerified;
	private Integer vipLevel;
	private String languageCode;
	private String lastLoginCity;
	private String lastLoginCountryCode;
	private String lastLoginIp;
	private String lastLoginThrough;
	private Double practiceBal;
	private String playerImagePath;
	private Timestamp firstDepositDate;
	private Integer firstDepositPayTypeId;
	private String referSource;
	private Long referSourceId;
	private Long subSourceId;
	private Long campTrackId;
	private String firstDepositReferSource;
	private Long firstDepositReferSourceId;
	private Long firstDepositSubSourceId;
	private Long firstDepositCampTrackId;
	private Double migratePlrBalance;
	private String affiliateBind;
	private Integer affiliateId;
	private String affiliateReference;
	private Short tPVerificationSource;
	private Short invalidLoginTry;
	private String tPVerificationId;
	private String regDevice;
	private String userAgent;

	private String isPlay2x;

	public StPmPlayerMaster() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public String getAutoPassword() {
		return autoPassword;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getStatus() {
		return status;
	}

	public String getPlrStatus() {
		return plrStatus;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public String getVerificationMode() {
		return verificationMode;
	}

	public Integer getAffiliateCode() {
		return affiliateCode;
	}

	public Short getDomainId() {
		return domainId;
	}

	public Short getAliasId() {
		return aliasId;
	}

	public String getDuplicationCheckReq() {
		return duplicationCheckReq;
	}

	public String getPromoOpt() {
		return promoOpt;
	}

	public String getAddressVerified() {
		return addressVerified;
	}

	public String getEmailVerified() {
		return emailVerified;
	}

	public String getPhoneVerified() {
		return phoneVerified;
	}

	public String getAgeVerified() {
		return ageVerified;
	}

	public String getTaxationIdVerified() {
		return taxationIdVerified;
	}

	public Integer getVipLevel() {
		return vipLevel;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public String getLastLoginCity() {
		return lastLoginCity;
	}

	public String getLastLoginCountryCode() {
		return lastLoginCountryCode;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public String getLastLoginThrough() {
		return lastLoginThrough;
	}

	public Double getPracticeBal() {
		return practiceBal;
	}

	public String getPlayerImagePath() {
		return playerImagePath;
	}

	public Timestamp getFirstDepositDate() {
		return firstDepositDate;
	}

	public Integer getFirstDepositPayTypeId() {
		return firstDepositPayTypeId;
	}

	public String getReferSource() {
		return referSource;
	}

	public Long getReferSourceId() {
		return referSourceId;
	}

	public Long getSubSourceId() {
		return subSourceId;
	}

	public Long getCampTrackId() {
		return campTrackId;
	}

	public String getFirstDepositReferSource() {
		return firstDepositReferSource;
	}

	public Long getFirstDepositReferSourceId() {
		return firstDepositReferSourceId;
	}

	public Long getFirstDepositSubSourceId() {
		return firstDepositSubSourceId;
	}

	public Long getFirstDepositCampTrackId() {
		return firstDepositCampTrackId;
	}

	public Double getMigratePlrBalance() {
		return migratePlrBalance;
	}

	public String getAffiliateBind() {
		return affiliateBind;
	}

	public Integer getAffiliateId() {
		return affiliateId;
	}

	public String getAffiliateReference() {
		return affiliateReference;
	}

	public Short gettPVerificationSource() {
		return tPVerificationSource;
	}

	public Short getInvalidLoginTry() {
		return invalidLoginTry;
	}

	public String gettPVerificationId() {
		return tPVerificationId;
	}

	public String getRegDevice() {
		return regDevice;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public String getIsPlay2x() {
		return isPlay2x;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAutoPassword(String autoPassword) {
		this.autoPassword = autoPassword;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPlrStatus(String plrStatus) {
		this.plrStatus = plrStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public void setVerificationMode(String verificationMode) {
		this.verificationMode = verificationMode;
	}

	public void setAffiliateCode(Integer affiliateCode) {
		this.affiliateCode = affiliateCode;
	}

	public void setDomainId(Short domainId) {
		this.domainId = domainId;
	}

	public void setAliasId(Short aliasId) {
		this.aliasId = aliasId;
	}

	public void setDuplicationCheckReq(String duplicationCheckReq) {
		this.duplicationCheckReq = duplicationCheckReq;
	}

	public void setPromoOpt(String promoOpt) {
		this.promoOpt = promoOpt;
	}

	public void setAddressVerified(String addressVerified) {
		this.addressVerified = addressVerified;
	}

	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}

	public void setPhoneVerified(String phoneVerified) {
		this.phoneVerified = phoneVerified;
	}

	public void setAgeVerified(String ageVerified) {
		this.ageVerified = ageVerified;
	}

	public void setTaxationIdVerified(String taxationIdVerified) {
		this.taxationIdVerified = taxationIdVerified;
	}

	public void setVipLevel(Integer vipLevel) {
		this.vipLevel = vipLevel;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public void setLastLoginCity(String lastLoginCity) {
		this.lastLoginCity = lastLoginCity;
	}

	public void setLastLoginCountryCode(String lastLoginCountryCode) {
		this.lastLoginCountryCode = lastLoginCountryCode;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public void setLastLoginThrough(String lastLoginThrough) {
		this.lastLoginThrough = lastLoginThrough;
	}

	public void setPracticeBal(Double practiceBal) {
		this.practiceBal = practiceBal;
	}

	public void setPlayerImagePath(String playerImagePath) {
		this.playerImagePath = playerImagePath;
	}

	public void setFirstDepositDate(Timestamp firstDepositDate) {
		this.firstDepositDate = firstDepositDate;
	}

	public void setFirstDepositPayTypeId(Integer firstDepositPayTypeId) {
		this.firstDepositPayTypeId = firstDepositPayTypeId;
	}

	public void setReferSource(String referSource) {
		this.referSource = referSource;
	}

	public void setReferSourceId(Long referSourceId) {
		this.referSourceId = referSourceId;
	}

	public void setSubSourceId(Long subSourceId) {
		this.subSourceId = subSourceId;
	}

	public void setCampTrackId(Long campTrackId) {
		this.campTrackId = campTrackId;
	}

	public void setFirstDepositReferSource(String firstDepositReferSource) {
		this.firstDepositReferSource = firstDepositReferSource;
	}

	public void setFirstDepositReferSourceId(Long firstDepositReferSourceId) {
		this.firstDepositReferSourceId = firstDepositReferSourceId;
	}

	public void setFirstDepositSubSourceId(Long firstDepositSubSourceId) {
		this.firstDepositSubSourceId = firstDepositSubSourceId;
	}

	public void setFirstDepositCampTrackId(Long firstDepositCampTrackId) {
		this.firstDepositCampTrackId = firstDepositCampTrackId;
	}

	public void setMigratePlrBalance(Double migratePlrBalance) {
		this.migratePlrBalance = migratePlrBalance;
	}

	public void setAffiliateBind(String affiliateBind) {
		this.affiliateBind = affiliateBind;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
	}

	public void setAffiliateReference(String affiliateReference) {
		this.affiliateReference = affiliateReference;
	}

	public void settPVerificationSource(Short tPVerificationSource) {
		this.tPVerificationSource = tPVerificationSource;
	}

	public void setInvalidLoginTry(Short invalidLoginTry) {
		this.invalidLoginTry = invalidLoginTry;
	}

	public void settPVerificationId(String tPVerificationId) {
		this.tPVerificationId = tPVerificationId;
	}

	public void setRegDevice(String regDevice) {
		this.regDevice = regDevice;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public void setIsPlay2x(String isPlay2x) {
		this.isPlay2x = isPlay2x;
	}

}