package com.bdi.sb.vo;

import org.apache.ibatis.type.Alias;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Alias("board")
public class BoardInfoVO {

	private Integer biNum;
	private String biTitle;
	private String biWriter;
	private String biContent;
	private String biFile;
	private MultipartFile biFileItem;
	private String credat;
	private String cretim;
	private String active;
	private Integer biCnt;
}
