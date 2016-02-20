package com.valdoc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilityService {

	protected static Logger logger = LoggerFactory.getLogger(UtilityService.class);
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String decode(String password) {

		String decodedPassword = null;
		try {
			if (null != password) {
				byte[] decoded = DatatypeConverter.parseBase64Binary(password);
				decodedPassword = new String(decoded, "UTF-8");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return decodedPassword;
	}

	public static String encode(String password) {
		String encoded = "";
		try {
			byte[] message = password.getBytes("UTF-8");
			encoded = DatatypeConverter.printBase64Binary(message);

		} catch (Exception ex) {
			logger.debug(" Failed To Encode password in PasswordEncodeAndDecodeUtil: " + ex);
		}
		return encoded;
	}

	public static boolean resetBoolean(boolean flag) {
		if (flag) {
			return false;
		} else {
			return true;
		}
	}

	public static Date stringToDate(String strDate) {
		Date date = new Date();
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String dateToString(Date date) {
		String createTime = null;
		if (date != null) {
			createTime = date.toString();
			int pos = createTime.indexOf('.');

			if (pos != -1) {
				createTime = createTime.substring(0, 19);
			}
		}
		return createTime;
	}

}
