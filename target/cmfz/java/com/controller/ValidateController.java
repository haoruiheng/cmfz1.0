package com.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.validateutil.SecurityCode;
import com.validateutil.SecurityImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//验证码
@Controller
@RequestMapping("/img")
public class ValidateController{

	//生成验证码--使用验证码插件
	@RequestMapping("createImg")
	public void createImg(HttpSession session,HttpServletResponse response) throws IOException{
		//调验证码插件，获取随机验证码 字符串
		String code = SecurityCode.getSecurityCode();
		//把生成的验证码 字符串存入session
		session.setAttribute("ServerCode", code);
		//根据验证码字符串生成图片
		BufferedImage image = SecurityImage.createImage(code);
		//使用响应输出流
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "png", out);
	}
	
}
