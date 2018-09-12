/**   
 * @Title: ExtJSONUtil.java
 * @Package com.zushou365.utils
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-7
 */
package com.zushou365.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.zushou365.manage.comm.model.PagingBean;

/**
 * @ClassName: ExtJSONUtil
 * @Description: Ext JSON工具类
 *               <p>
 * @author willter
 * @date 2012-9-7
 */
public class ExtJSONUtil {

	public static JSONObject getJSONObjectByExt(List<Map> dataList, PagingBean pagingBean) {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("total", pagingBean.getMaxRows());
		
		JSONArray rowsArray = new JSONArray();
		JSONObject rowObject = null;
		for (int i = 0, size = dataList.size(); i < size; i++) {
			rowObject = new JSONObject();
			Map map = (Map) dataList.get(i);
			for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				rowObject.put(key, map.get(key));
			}
			rowsArray.add(jsonObject);
		}
		jsonObject.put("rows", rowsArray);
		
		return jsonObject;
	}
}
