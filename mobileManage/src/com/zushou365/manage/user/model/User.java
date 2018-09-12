/**   
 * @Title: User.java
 * @Package com.zushou365.manage.user.model
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.user.model;

import java.sql.Timestamp;
import java.util.Date;

import com.zushou365.manage.comm.model.BaseEntity;

/**
 * @ClassName: User
 * @Description: User实体类
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
public class User extends BaseEntity {

	// Fields

	private Integer id;
	private String passWd;
	private String name;
	private String realName;
	private String realFirstName;
	private String realLastName;
	private String question;
	private String answer;
	private String email;
	private Timestamp regDate;
	private String mobile;
	private String tel;
	private String address;
	private Integer status;
	private Integer sex;
	private String phoneZone;
	private String qq;
	private String msn;
	private String pid;
	private Integer cityCode;
	private Integer bigAreaCode;
	private Integer smallAreaCode;
	private String companyName;
	private String companyShortName;
	private String companyUrl;
	private Integer workYear;
	private Date workDate;
	private String postCode;
	private String project;
	private String agentPass;
	private String faxZone;
	private String fax;
	private Date foundDate;
	private Date birthDate;
	private String jobTitle;
	private String department;
	private Timestamp vipStartTime;
	private Timestamp vipExpireTime;
	private Timestamp lastLoginTime;
	private Timestamp lastPublishTime;
	private Integer totalLoginCount;
	private Integer dayLoginCount;
	private Integer dayJifen;
	private Integer totalJifen;
	private Double money;
	private Integer credit;
	private String licenseNo;
	private String certificateNo;
	private String registrationNo;
	private Integer birthProvinceCode;
	private Integer birthCityCode;
	private Integer birthAreaCode;
	private String school;
	private String recommend;
	private String topRecommend;
	private Integer recommendType;
	private Integer groupId;
	private Integer wsProcessOk;
	private Integer wsProcessCur;
	private Integer wsProcessIndex;
	private String descn;
	private String companyAddress;
	private String companyDescn;
	private Integer tjJifen;
	private Integer tjLevel;
	private Integer tjPublishCount;
	private Integer vipType;
	private Integer cid;
	private String extendStr;
	private Timestamp lastMsgTime;
	private Integer smsCount;
	private Integer userType;
	private String smsPwd;
	private Integer paymentId;
	private Timestamp paymentExpireTime;
	private Timestamp trialSpTime;
	private Integer trialSpDays;
	private Integer vipStart;
	private Integer independentAgent;
	private Integer isZs;
	private Integer msgCount;
	private Integer otherCityCode;
	private String yearDesc;
	private Integer internetServer;
	private Integer yearOrder;
	private String yearSummary;
	private String yearDemo;
	private String taskComplete;
	private Integer operateCount;
	private Integer active;
	private String usersZone;

	// Constructors

	/** default constructor */
	public User() {
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassWd() {
		return this.passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRealFirstName() {
		return this.realFirstName;
	}

	public void setRealFirstName(String realFirstName) {
		this.realFirstName = realFirstName;
	}

	public String getRealLastName() {
		return this.realLastName;
	}

	public void setRealLastName(String realLastName) {
		this.realLastName = realLastName;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhoneZone() {
		return this.phoneZone;
	}

	public void setPhoneZone(String phoneZone) {
		this.phoneZone = phoneZone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Integer getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public Integer getBigAreaCode() {
		return this.bigAreaCode;
	}

	public void setBigAreaCode(Integer bigAreaCode) {
		this.bigAreaCode = bigAreaCode;
	}

	public Integer getSmallAreaCode() {
		return this.smallAreaCode;
	}

	public void setSmallAreaCode(Integer smallAreaCode) {
		this.smallAreaCode = smallAreaCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyShortName() {
		return this.companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	public String getCompanyUrl() {
		return this.companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public Integer getWorkYear() {
		return this.workYear;
	}

	public void setWorkYear(Integer workYear) {
		this.workYear = workYear;
	}

	public Date getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAgentPass() {
		return this.agentPass;
	}

	public void setAgentPass(String agentPass) {
		this.agentPass = agentPass;
	}

	public String getFaxZone() {
		return this.faxZone;
	}

	public void setFaxZone(String faxZone) {
		this.faxZone = faxZone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Date getFoundDate() {
		return this.foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Timestamp getVipStartTime() {
		return this.vipStartTime;
	}

	public void setVipStartTime(Timestamp vipStartTime) {
		this.vipStartTime = vipStartTime;
	}

	public Timestamp getVipExpireTime() {
		return this.vipExpireTime;
	}

	public void setVipExpireTime(Timestamp vipExpireTime) {
		this.vipExpireTime = vipExpireTime;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Timestamp getLastPublishTime() {
		return this.lastPublishTime;
	}

	public void setLastPublishTime(Timestamp lastPublishTime) {
		this.lastPublishTime = lastPublishTime;
	}

	public Integer getTotalLoginCount() {
		return this.totalLoginCount;
	}

	public void setTotalLoginCount(Integer totalLoginCount) {
		this.totalLoginCount = totalLoginCount;
	}

	public Integer getDayLoginCount() {
		return this.dayLoginCount;
	}

	public void setDayLoginCount(Integer dayLoginCount) {
		this.dayLoginCount = dayLoginCount;
	}

	public Integer getDayJifen() {
		return this.dayJifen;
	}

	public void setDayJifen(Integer dayJifen) {
		this.dayJifen = dayJifen;
	}

	public Integer getTotalJifen() {
		return this.totalJifen;
	}

	public void setTotalJifen(Integer totalJifen) {
		this.totalJifen = totalJifen;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Integer getBirthProvinceCode() {
		return this.birthProvinceCode;
	}

	public void setBirthProvinceCode(Integer birthProvinceCode) {
		this.birthProvinceCode = birthProvinceCode;
	}

	public Integer getBirthCityCode() {
		return this.birthCityCode;
	}

	public void setBirthCityCode(Integer birthCityCode) {
		this.birthCityCode = birthCityCode;
	}

	public Integer getBirthAreaCode() {
		return this.birthAreaCode;
	}

	public void setBirthAreaCode(Integer birthAreaCode) {
		this.birthAreaCode = birthAreaCode;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getRecommend() {
		return this.recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getTopRecommend() {
		return this.topRecommend;
	}

	public void setTopRecommend(String topRecommend) {
		this.topRecommend = topRecommend;
	}

	public Integer getRecommendType() {
		return this.recommendType;
	}

	public void setRecommendType(Integer recommendType) {
		this.recommendType = recommendType;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getWsProcessOk() {
		return this.wsProcessOk;
	}

	public void setWsProcessOk(Integer wsProcessOk) {
		this.wsProcessOk = wsProcessOk;
	}

	public Integer getWsProcessCur() {
		return this.wsProcessCur;
	}

	public void setWsProcessCur(Integer wsProcessCur) {
		this.wsProcessCur = wsProcessCur;
	}

	public Integer getWsProcessIndex() {
		return this.wsProcessIndex;
	}

	public void setWsProcessIndex(Integer wsProcessIndex) {
		this.wsProcessIndex = wsProcessIndex;
	}

	public String getDescn() {
		return this.descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyDescn() {
		return this.companyDescn;
	}

	public void setCompanyDescn(String companyDescn) {
		this.companyDescn = companyDescn;
	}

	public Integer getTjJifen() {
		return this.tjJifen;
	}

	public void setTjJifen(Integer tjJifen) {
		this.tjJifen = tjJifen;
	}

	public Integer getTjLevel() {
		return this.tjLevel;
	}

	public void setTjLevel(Integer tjLevel) {
		this.tjLevel = tjLevel;
	}

	public Integer getTjPublishCount() {
		return this.tjPublishCount;
	}

	public void setTjPublishCount(Integer tjPublishCount) {
		this.tjPublishCount = tjPublishCount;
	}

	public Integer getVipType() {
		return this.vipType;
	}

	public void setVipType(Integer vipType) {
		this.vipType = vipType;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getExtendStr() {
		return this.extendStr;
	}

	public void setExtendStr(String extendStr) {
		this.extendStr = extendStr;
	}

	public Timestamp getLastMsgTime() {
		return this.lastMsgTime;
	}

	public void setLastMsgTime(Timestamp lastMsgTime) {
		this.lastMsgTime = lastMsgTime;
	}

	public Integer getSmsCount() {
		return this.smsCount;
	}

	public void setSmsCount(Integer smsCount) {
		this.smsCount = smsCount;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getSmsPwd() {
		return this.smsPwd;
	}

	public void setSmsPwd(String smsPwd) {
		this.smsPwd = smsPwd;
	}

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Timestamp getPaymentExpireTime() {
		return this.paymentExpireTime;
	}

	public void setPaymentExpireTime(Timestamp paymentExpireTime) {
		this.paymentExpireTime = paymentExpireTime;
	}

	public Timestamp getTrialSpTime() {
		return this.trialSpTime;
	}

	public void setTrialSpTime(Timestamp trialSpTime) {
		this.trialSpTime = trialSpTime;
	}

	public Integer getTrialSpDays() {
		return this.trialSpDays;
	}

	public void setTrialSpDays(Integer trialSpDays) {
		this.trialSpDays = trialSpDays;
	}

	public Integer getVipStart() {
		return this.vipStart;
	}

	public void setVipStart(Integer vipStart) {
		this.vipStart = vipStart;
	}

	public Integer getIndependentAgent() {
		return this.independentAgent;
	}

	public void setIndependentAgent(Integer independentAgent) {
		this.independentAgent = independentAgent;
	}

	public Integer getIsZs() {
		return this.isZs;
	}

	public void setIsZs(Integer isZs) {
		this.isZs = isZs;
	}

	public Integer getMsgCount() {
		return this.msgCount;
	}

	public void setMsgCount(Integer msgCount) {
		this.msgCount = msgCount;
	}

	public Integer getOtherCityCode() {
		return this.otherCityCode;
	}

	public void setOtherCityCode(Integer otherCityCode) {
		this.otherCityCode = otherCityCode;
	}

	public String getYearDesc() {
		return this.yearDesc;
	}

	public void setYearDesc(String yearDesc) {
		this.yearDesc = yearDesc;
	}

	public Integer getInternetServer() {
		return this.internetServer;
	}

	public void setInternetServer(Integer internetServer) {
		this.internetServer = internetServer;
	}

	public Integer getYearOrder() {
		return this.yearOrder;
	}

	public void setYearOrder(Integer yearOrder) {
		this.yearOrder = yearOrder;
	}

	public String getYearSummary() {
		return this.yearSummary;
	}

	public void setYearSummary(String yearSummary) {
		this.yearSummary = yearSummary;
	}

	public String getYearDemo() {
		return this.yearDemo;
	}

	public void setYearDemo(String yearDemo) {
		this.yearDemo = yearDemo;
	}

	public String getTaskComplete() {
		return this.taskComplete;
	}

	public void setTaskComplete(String taskComplete) {
		this.taskComplete = taskComplete;
	}

	public Integer getOperateCount() {
		return this.operateCount;
	}

	public void setOperateCount(Integer operateCount) {
		this.operateCount = operateCount;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getUsersZone() {
		return this.usersZone;
	}

	public void setUsersZone(String usersZone) {
		this.usersZone = usersZone;
	}
}
