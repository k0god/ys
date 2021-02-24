package com.bdi.sb.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdi.sb.service.TestInfoService;
import com.bdi.sb.vo.TestInfoVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestInfoController {

	@Resource
	private TestInfoService tiService;
	
	
	@GetMapping("/tests")
	public Map<String,Object> getTests(@ModelAttribute TestInfoVO test){
		return tiService.selectTestInfoList(test);
	}

	@GetMapping("/test")
	public TestInfoVO getTest(@ModelAttribute TestInfoVO test){
		return tiService.selectTestInfo(test);
	}
	
	@PostMapping("/test")
	public Map<String,Object> insertTest(@RequestBody TestInfoVO test){
		log.info("test=>{}",test);
		return null;
	}
	
	@PutMapping("/test")
	public Map<String,Object> updateTest(@RequestBody TestInfoVO test){
		return tiService.updateTestInfo(test);
	}
	
	@DeleteMapping("/tests")
	public Map<String,Object> deleteTests(@RequestBody List<Integer> tiNums){
		log.info("tiNums=>{}",tiNums);
		return null;
	}
}
