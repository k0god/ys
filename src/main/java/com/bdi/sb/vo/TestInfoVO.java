package com.bdi.sb.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("test")
@Data
public class TestInfoVO {
	private Integer tiNum;
	private String tiName;
	private String tiAddr;
	private String tiEtc;
	private Integer tiUpdcnt;
	private PageVO page = new PageVO();
}
