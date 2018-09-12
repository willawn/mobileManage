/**   
 * @Title: BaseController.java
 * @Package com.zushou365.manage.comm.web
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-5
 */
package com.zushou365.manage.comm.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;

/**
 * @ClassName: BaseController
 * @Description: 基础控制类
 *               <p>
 * @author willter
 * @date 2012-9-5
 */
@Controller
public class BaseController {

	/**
	 * @Title: retJson
	 * @Description: 输入JSON格式数据
	 *               <p>
	 * @author willter
	 * @date 2012-9-5
	 *       <p>
	 * @param response
	 * @param jsonObject
	 * @throws IOException
	 */
	public void retJson(HttpServletResponse response, String jsonString) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsonString);
	}
}
