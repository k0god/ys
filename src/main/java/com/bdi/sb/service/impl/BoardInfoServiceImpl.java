package com.bdi.sb.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bdi.sb.mapper.BoardInfoMapper;
import com.bdi.sb.service.BoardInfoService;
import com.bdi.sb.vo.BoardInfoVO;
import com.bdi.sb.vo.PageVO;

@Service
public class BoardInfoServiceImpl implements BoardInfoService {
	@Resource
	private BoardInfoMapper biMapper;

	@Value("${save.file.path}")
	private String saveFilePath;
	
	@Override
	public List<BoardInfoVO> selectBoardInfoList(BoardInfoVO board, PageVO page) {
		int startNum = (page.getPage()-1) * page.getPageSize();
		page.setStartNum(startNum);
		return biMapper.selectBoardInfoList(board,page);
	}

	@Override
	public int insertBoardInfo(BoardInfoVO board) {
		MultipartFile mf = board.getBiFileItem();
		if(mf!=null) {
			String fileName = System.nanoTime() + "." + FilenameUtils.getExtension(mf.getOriginalFilename());
			board.setBiFile(fileName);
			String filePath = saveFilePath + fileName;
			File targetFile = new File(filePath);
			try {
				Files.copy(mf.getInputStream(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return biMapper.insertBoardInfo(board);
	}

	@Override
	public int updateBoardInfo(BoardInfoVO board) {
		return biMapper.updateBoardInfo(board);
	}

	@Override
	public int deleteBoardInfo(BoardInfoVO board) {
		return biMapper.deleteBoardInfo(board);
	}

	@Override
	public BoardInfoVO selectBoardInfo(BoardInfoVO board) {
		return biMapper.selectBoardInfo(board);
	}

}
