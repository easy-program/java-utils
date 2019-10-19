package string;

/**
 * String工具集合
 * 
 * @author: wuya
 * @version 1.0.0
 */
public class StringUtils {

	/**
	 * 
	 * @Title: isEmpty
	 * @Description: 字符串是否为空
	 * @param str 传入字符串
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}
		if (str.length() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @Title: isNotEmpty
	 * @Description: 字符串是否不为空
	 * @param str 传入字符串
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if (str == null) {
			return false;
		}
		if (str.length() == 0) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @Title: isBlank
	 * @Description: 字符串是否为空
	 * @param str 传入字符串
	 * @return
	 */
	public static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		if (str.trim().length() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @Title: isNotBlank
	 * @Description: 字符串是否不为空
	 * @param str               传入字符串
	 * @param trimAllWhiteSpace 是否去除所有的空格
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		if (str == null) {
			return false;
		}
		if (str.trim().length() == 0) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @Title: trimAllWhiteSpace
	 * @Description: 去除所有的空格
	 * @param str
	 * @return
	 */
	public static String trimAllWhiteSpace(String str) {
		return str.replaceAll(" ", "");
	}

	/**
	 * 
	 * @Title: trimAllSpace
	 * @Description: 去除所有的空格（匹配空格、制表符、换页符等空白字符）
	 * @param str
	 * @return
	 */
	public static String trimAllSpace(String str) {
		return str.replaceAll("\\s*", "");
	}

}
