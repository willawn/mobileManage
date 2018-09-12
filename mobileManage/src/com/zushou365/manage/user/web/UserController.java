/**   
 * @Title: UserController.java
 * @Package com.zushou365.manage.user.web
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-5
 */
package com.zushou365.manage.user.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.web.BaseController;
import com.zushou365.manage.user.model.User;
import com.zushou365.manage.user.service.IUserService;
import com.zushou365.utils.ExtJSONUtil;

/**
 * @ClassName: UserController
 * @Description: 描述类
 *               <p>
 * @author willter
 * @date 2012-9-5
 */
@Controller
public class UserController extends BaseController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/addUser.do")
	public String addUser(User user, Model model) {
		userService.add(user);
		return "redirect:user/userList";
	}

	@RequestMapping(value = "/toAddUser.do")
	public String toAddUser() {
		return "user/addUser";
	}

	@RequestMapping(value = "/updateUser.do")
	public String updateUser(User user, Model model) {
		userService.update(user);
		model.addAttribute("user", userService.findById(user.getId()));
		return "user/updateUser";
	}

	@RequestMapping(value = "/toUpdateUser.do")
	public String toUpdateUser(@RequestParam("id") int id, Model model) {
		model.addAttribute("user", userService.findById(id));
		return "user/updateUser";
	}

	@RequestMapping(value = "/deleteUser.do")
	public String deleteUser(@RequestParam("id") int id, Model model) {
		Integer ret = userService.deleteById(id);

		return "redirect:user/userList";
	}

	@RequestMapping(value = "/toDeleteUser.do")
	public String toDeleteUser() {

		return "toDeleteUser";
	}

	@RequestMapping("/user/toUserList.do")
	public String toUserList(Model model) {

		return "user/userList";
	}

	@RequestMapping("/user/userList.do")
	public void userList(@RequestParam("start") int start, @RequestParam("limit") int limit, HttpServletResponse response, Model model)
			throws IOException {
		PagingBean pagingBean = new PagingBean();
		pagingBean.setPageRows(limit);
		pagingBean.setBeginRow(start);
		List<User> userList = userService.findPaging(pagingBean);

		List<Map> dataList = new ArrayList<Map>();
		Map map = null;
		for (User user : userList) {
			map = new HashMap();
			map.put("id", user.getId());
			map.put("name", user.getName());
			map.put("realName", user.getRealName());
			map.put("email", user.getEmail());
			map.put("mobile", user.getMobile());
			map.put("tel", user.getTel());
			map.put("address", user.getAddress());
			map.put("qq", user.getQq());
			map.put("msn", user.getMsn());
			dataList.add(map);
		}

		// 返回JSONObject对象
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("total", pagingBean.getMaxRows());
		jsonObject.put("rows", dataList);
		retJson(response, "(" + jsonObject.toString() + ")");
	}

	@RequestMapping("/user/userDetail.do")
	public String userDetail() {
		return "success";
	}
}
