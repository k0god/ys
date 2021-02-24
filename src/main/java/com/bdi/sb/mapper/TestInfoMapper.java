package com.bdi.sb.mapper;

import java.util.List;

import com.bdi.sb.vo.TestInfoVO;

public interface TestInfoMapper {
	public List<TestInfoVO> selectTestInfoList(TestInfoVO test);
	public int totalTestInfoCount(TestInfoVO test);
	public TestInfoVO selectTestInfo(TestInfoVO test);
	public int updateTestInfo(TestInfoVO test);
	public int updateTiUpdcnt(TestInfoVO test);
}
