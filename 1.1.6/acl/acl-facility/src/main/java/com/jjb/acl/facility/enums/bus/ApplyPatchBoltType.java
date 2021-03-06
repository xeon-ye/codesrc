package com.jjb.acl.facility.enums.bus;


/**
 * @description 补件类型
 * @author hn
 * @date 2016年9月23日09:51:46
 */
public enum ApplyPatchBoltType {

	/**
	 * 身份证件证明
	 */
	A("身份证件证明"),
	/**
	 * 身份证件正面
	 */
	A0("身份证件正面"),
	/**
	 * 身份证件反面
	 */
	A1("身份证件反面"),
	/**
	 * 工作证明
	 */
	B("工作证明"),
	/**
	 * 收入证明
	 */
	C("收入证明"),
	/**
	 * 他行卡片证明
	 */
	D("他行卡片证明"),
	/**
	 * 社保证明
	 */
	E("社保证明"),
	/**
	 * 企业法人证明
	 */
	F("企业法人证明"),
	/**
	 * 房产证明
	 */
	G("房产证明"),
	/**
	 * 车产证明
	 */
	H("车产证明"),
	/**
	 * 存款证明
	 */
	I("存款证明"),
	/**
	 * 理财证明
	 */
	J("理财证明"),
	/**
	 * 抵押质押证明
	 */
	K("抵押质押证明"),
	/**
	 * 个人担保证明
	 */
	L("个人担保证明"),
	/**
	 * 企业担保证明
	 */
	M("企业担保证明"),
	/**
	 * 申请人头像证明
	 */
	N("申请人头像证明"),
	/**
	 * 合照(客户与客户经理)
	 */
	N1("合照"),
	/**
	 * 纸质签名手印
	 */
	N2("纸质签名手印"),
	/**
	 * 贷款证明
	 */
	O("贷款证明"),
	/**
	 * 其他
	 */
	P("其他"),
	/**
	 * 预留1
	 */
	P1("预留1"),
	/**
	 * 预留2
	 */
	P2("预留2"),
	/**
	 * 预留3
	 */
	P3("预留4"),
	/**
	 * 预留4
	 */
	P4("预留4"),
	/**
	 * 预留5
	 */
	P5("预留5"),
	/**
	 * 预留6
	 */
	P6("预留6"),
	/**
	 * 预留7
	 */
	P7("预留7"),
	
	/**
	 * 申请件正面
	 */
	Q1("申请件正面"),
	/**
	 * 申请件反面
	 */
	Q2("申请件反面"),
	/**
	 * 申请表+征信书类型
	 */
	Q3("申请表+征信书类型"),
	/**
	 * 征信授权证明
	 */
	R("征信授权证明");
	
	private String applyPatchBoltType;

	private ApplyPatchBoltType(String applyPatchBoltType) {
		this.applyPatchBoltType = applyPatchBoltType;
	}

	public String getApplyPatchBoltType() {
		return applyPatchBoltType;
	}
}
