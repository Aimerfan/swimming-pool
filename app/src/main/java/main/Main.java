package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Throwable {
		System.out.println("游泳池收費標準:\n"
				+ "(1) 一般票價 200 (2) 星期六日250元 (3) 12歲以下, 60歲(含)以上打八折, 限定 3-75 歲可入內游泳\n"
				+ "(4) 七點以前八折 (營業時間:05:00-22:00) (5) 團體打七折 (6) 會員打五折 (7) 各打折不得重疊使用\n");
		int age = Query.queryAge();
		boolean memberAuth = Query.queryMember();
		boolean groupAuth = Query.queryGroup();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss"); // 設定日期格式
		String dateTime = sdf.format(new Date()); // new Date() 為獲取當前系統時間

		Identity identity = new Identity(age, memberAuth, groupAuth);
		Discount discount = new Discount(identity, dateTime);
		Payment payment = new Payment(discount, dateTime);
		payment.print();
	}
}
