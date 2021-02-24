package com.bdi.sb.service;

import java.util.List;

import com.bdi.sb.vo.BoardInfoVO;
import com.bdi.sb.vo.PageVO;

public interface BoardInfoService {


	List<BoardInfoVO> selectBoardInfoList(BoardInfoVO board,PageVO page);
	BoardInfoVO selectBoardInfo(BoardInfoVO board);
	int insertBoardInfo(BoardInfoVO board);
	int updateBoardInfo(BoardInfoVO board);
	int deleteBoardInfo(BoardInfoVO board);
}
