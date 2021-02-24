package com.bdi.sb.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bdi.sb.service.BoardInfoService;
import com.bdi.sb.vo.BoardInfoVO;
import com.bdi.sb.vo.PageVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardInfoController {

	@Resource
	private BoardInfoService biService;
	

	@PostMapping("/boardinfo/delete")
	public String deleteBoard(BoardInfoVO board,Model m){
		int cnt = biService.deleteBoardInfo(board);
		m.addAttribute("result",cnt);
		return "/front/board/view";
	}
	@PostMapping("/boardinfo/insert")
	public String insertBoard(BoardInfoVO board,Model m){
		int cnt = biService.insertBoardInfo(board);
		m.addAttribute("result",cnt);
		return "/front/board/insert";
	}
	@PostMapping("/boardinfo/update")
	public String updateBoard(BoardInfoVO board,Model m){
		int cnt = biService.insertBoardInfo(board);
		m.addAttribute("result",cnt);
		return "/front/board/insert";
	}
	@GetMapping("/boardinfo/update")
	public String selectBoardForUpdate(BoardInfoVO board,Model m){
		m.addAttribute("bi",biService.selectBoardInfo(board));
		return "/front/board/update";
	}
	@GetMapping("/boardinfos")
	public String selectBoardInfo(BoardInfoVO board, PageVO page,Model m) {
		log.info("list=>{}",biService.selectBoardInfoList(board, page));
		m.addAttribute("list",biService.selectBoardInfoList(board, page));
		return "/front/board/list";
	}
	@GetMapping("/boardinfo")
	public String selectBoard(BoardInfoVO board,Model m){
		m.addAttribute("bi",biService.selectBoardInfo(board));
		return "/front/board/view";
	}
}
