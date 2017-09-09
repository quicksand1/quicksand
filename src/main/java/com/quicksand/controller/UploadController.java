package com.quicksand.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;



@Controller
@RequestMapping("upload")
public class UploadController {
	
	@RequestMapping(value="/signal",method=RequestMethod.POST)
	@ResponseBody
	public String signal(@RequestParam(value="file",required=false) MultipartFile file) throws IllegalStateException, IOException{
		System.out.println("file:");
		File f=new File("d://"+file.getOriginalFilename());
		if(!f.exists()){
			System.out.println("不存在");
			f.mkdirs();
		}
		file.transferTo(f);
		System.out.println("11111");
		return "success";
	}
	
	@RequestMapping(value="/many",method=RequestMethod.POST)
	@ResponseBody
	public String many(@RequestParam(value="file",required=false) CommonsMultipartFile [] files) throws IllegalStateException, IOException{
		System.out.println("file count:"+files.length);
		for (int i = 0; i < files.length; i++) {
			if(files[i]==null) continue;
			File file=new File("d:/upload/"+files[i].getOriginalFilename());
			if(!file.exists()){
				System.out.println("不存在");
				file.mkdirs();
			}
			files[i].transferTo(file);
		}
		
		System.out.println("11111");
		return "success";
	}
	
	/*@RequestMapping(value="/many",method=RequestMethod.POST)
	@ResponseBody
	public String many(HttpServletRequest request) throws IllegalStateException, IOException{
		CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
		if(cmr.isMultipart(request)){
			MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) (request);  
            Iterator<String> files = mRequest.getFileNames();  
            while (files.hasNext()) {  
                MultipartFile mFile = mRequest.getFile(files.next());  
                if (mFile != null) {  
                    String fileName = UUID.randomUUID()  
                            + mFile.getOriginalFilename();  
                    String path = "d:/upload/" + fileName;  
                    File localFile = new File(path);  
                    mFile.transferTo(localFile);  
                    //request.setAttribute("fileUrl", path);  
                }  
            }  
		}
		System.out.println("11111");
		return "success";
	}*/
	
	/*@RequestMapping(value="/many",method=RequestMethod.POST)
	@ResponseBody
	public String many(HttpServletRequest request) throws IllegalStateException, IOException{
		CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
		if(cmr.isMultipart(request)){
			MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) (request);  
            Iterator<String> files = mRequest.getFileNames();  
            while (files.hasNext()) {  
                MultipartFile mFile = mRequest.getFile(files.next());  
                if (mFile != null) {  
                    String fileName = UUID.randomUUID()  
                            + mFile.getOriginalFilename();  
                    String path = "d:/upload/" + fileName;  
                    File localFile = new File(path);  
                    mFile.transferTo(localFile);  
                    //request.setAttribute("fileUrl", path);  
                }  
            }  
		}
		System.out.println("11111");
		return "success";
	}*/
}
