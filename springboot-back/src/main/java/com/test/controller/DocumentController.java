package com.test.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import com.zhuozhengsoft.pageoffice.*;
@RestController
@RequestMapping(value = "/doc")
public class DocumentController {
	@RequestMapping(value="/openFile")
	public String openFile(HttpServletRequest request) {
		PageOfficeCtrl poCtrl = new PageOfficeCtrl(request);
		poCtrl.setSaveFilePage("saveFile");
		poCtrl.webOpen("D:\\test.docx", OpenModeType.docNormalEdit, "张三");
		return  poCtrl.getHtmlCode("PageOfficeCtrl1");
	}

	@RequestMapping("/saveFile")
	public void saveFile(HttpServletRequest request, HttpServletResponse response) {
		FileSaver fs = new FileSaver(request, response);
		fs.saveToFile("D:\\" + fs.getFileName());
		fs.close();
	}
}
