package com.health.database;

import java.util.HashMap;
import java.util.Map;

import com.health.archive.vaccinate.VaccTables;

public class Tables {

	// 表名
	public static final String TABLE_NAME = "tableName";

	// 每个表都有的四个属性
	public static final String CARDNO = "cardNo";
	public static final String TIME = "checkTime";
	public static final String DEVICENAME = "deviceName";
	public static final String DEVICEMAC = "deviceMac";
	// pc300 5项
	public static final String PULSE = "pulse";
	public static final String TEMP = "temp";
	public static final String DBP = "dbp";
	public static final String SBP = "sbp";
	public static final String BO = "so";
	// 百捷 3项
	public static final String GLU = "glu";
	public static final String UA = "ua";
	public static final String CHOL = "chol";
	// 白细胞
	public static final String WBC = "wbc";
	// 尿液11项
	public static final String LEU = "leu";
	public static final String BLD = "bld";
	public static final String PH = "ph";
	public static final String PRO = "pro";
	public static final String UBG = "ubg";
	public static final String NIT = "nit";
	public static final String SG = "sg";
	public static final String KET = "ket";
	public static final String BIL = "bil";
	public static final String UGLU = "glu";
	public static final String VC = "vc";

	private static final String ECG = "ecg";

	public Map<String, String> pulseTable() {
		Map<String, String> pulseMap = defaultAttrs();
		pulseMap.put(TABLE_NAME, "PULSE");
		pulseMap.put(PULSE, "integer");// 脉率
		return pulseMap;
	}

	public Map<String, String> tempTable() {
		Map<String, String> tempMap = defaultAttrs();
		tempMap.put(TABLE_NAME, "TEMP");
		tempMap.put(TEMP, "integer");// 体温
		return tempMap;
	}

	public Map<String, String> bpTable() {
		Map<String, String> bpMap = defaultAttrs();
		bpMap.put(TABLE_NAME, "BP");
		bpMap.put(DBP, "integer");// 舒张压
		bpMap.put(SBP, "integer");// 收缩压
		bpMap.put(PULSE, "integer");// 脉率
		return bpMap;
	}

	public Map<String, String> boTable() {
		Map<String, String> boMap = defaultAttrs();
		boMap.put(TABLE_NAME, "BO");
		boMap.put(BO, "integer");// 血氧
		return boMap;
	}

	public Map<String, String> gluTable() {
		Map<String, String> gluMap = defaultAttrs();
		gluMap.put(TABLE_NAME, "GLU");
		gluMap.put(GLU, "integer");// 血糖
		return gluMap;
	}

	public Map<String, String> uaTable() {
		Map<String, String> uaMap = defaultAttrs();
		uaMap.put(TABLE_NAME, "UA");
		uaMap.put(UA, "integer");// 尿酸
		return uaMap;
	}

	public Map<String, String> cholTable() {
		Map<String, String> cholMap = defaultAttrs();
		cholMap.put(TABLE_NAME, "CHOL");
		cholMap.put(CHOL, "integer");// 总胆固醇
		return cholMap;
	}

	/**
	 * 尿液11项
	 * 
	 * @return
	 */
	public Map<String, String> urineTable() {
		Map<String, String> urineMap = defaultAttrs();
		urineMap.put(TABLE_NAME, "URINE");
		urineMap.put(LEU, "integer");//
		urineMap.put(BLD, "integer");//
		urineMap.put(PH, "integer");//
		urineMap.put(PRO, "integer");//
		urineMap.put(UBG, "integer");//
		urineMap.put(NIT, "integer");//
		urineMap.put(SG, "integer");//
		urineMap.put(KET, "integer");//
		urineMap.put(BIL, "integer");//
		urineMap.put(GLU, "integer");//
		urineMap.put(VC, "integer");//
		return urineMap;
	}

	/**
	 * 每个表都有的属性
	 * 
	 * @return
	 */

	public Map<String, String> defaultAttrs() {
		Map<String, String> defaultMap = new HashMap<String, String>();
		defaultMap.put(CARDNO, "varchar(20)");// 账号
		// 2013-08-08 16:32:05
		defaultMap.put(TIME, "varchar(25)");
		defaultMap.put(DEVICENAME, "varchar(20)");// 数据来源设备名称
		defaultMap.put(DEVICEMAC, "varchar(20)");// 设备蓝牙mac地址
		return defaultMap;
	}

	public Map<String, String> ecgTable() {
		Map<String, String> ecgMap = defaultAttrs();
		ecgMap.put(TABLE_NAME, "ECG");
		ecgMap.put(ECG, "integer");// 总胆固醇
		return ecgMap;
	}

	/***
	 * 疫苗接种卡记录信息表
	 * 
	 * @return
	 */
	public Map<String, String> vaccRecordTable() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(TABLE_NAME, "Vacc_record");
		map.put(VaccTables.id_card, "char(18)");//身份证号
		map.put(VaccTables.serial_id, "varchar(20)");// 编号
		map.put(VaccTables.vacc_kind, "varchar(20)");// 疫苗
		map.put(VaccTables.vacc_time, "integer");// 剂次
		map.put(VaccTables.vacc_date, "date");// 接种日期
		map.put(VaccTables.vacc_part, "varchar(20)");// 接种部位
		map.put(VaccTables.vacc_serial, "varchar(20)");// 疫苗批号
		map.put(VaccTables.vacc_doctor, "varchar(20)");// 接种医生
		map.put(VaccTables.vacc_note, "varchar(100)");// 备注
		return map;
	}

	/***
	 * 疫苗接种卡表头信息
	 * 
	 * @return
	 */
	public Map<String, String> vaccHeadTable() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(TABLE_NAME, "Vacc_head");
		map.put(VaccTables.id_card, "char(18)");//身份证号
		map.put(VaccTables.serial_id, "varchar(20)");// 编号
		map.put(VaccTables.guardian, "varchar(20)");// 监护人姓名
		map.put(VaccTables.relation, "varchar(20)");// 与儿童关系
		map.put(VaccTables.phone, "varchar(20)");// 联系电话
		map.put(VaccTables.addr, "varchar(100)");// 家庭现住址
		map.put(VaccTables.register_addr, "varchar(100)");// 户籍地址
		map.put(VaccTables.in_time, "date");// 迁入时间
		map.put(VaccTables.out_time, "date");// 迁出时间
		map.put(VaccTables.out_reason, "varchar(100)");// 迁出原因
		map.put(VaccTables.abnormal_history, "varchar(100)");// 疫苗异常反应史
		map.put(VaccTables.vacc_taboo, "varchar(100)");// 接种禁忌
		map.put(VaccTables.infection_history, "varchar(100)");// 传染病史
		map.put(VaccTables.add_date, "date");// 建卡日期
		map.put(VaccTables.add_person, "varchar(20)");// 建卡人
		return map;
	}
}
