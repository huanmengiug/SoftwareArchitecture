package service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.ObjectStructure.AccountBook;
import service.Visitor.Viewer;

public class billDataAPI {

	public static String data(String viewer) throws ParseException {

		AccountBook accountBook = new AccountBook();

		// 添加收入
		accountBook.addBill(new IncomeBill(96572, "卖商品", time()));
		accountBook.addBill(new IncomeBill(12900, "卖广告位", time()));
		accountBook.addBill(new IncomeBill(34000, "出租", time()));
		// 添加支出
		accountBook.addBill(new ConsumeBill(6000, "朱安 工资", time()));
		accountBook.addBill(new ConsumeBill(7600, "唐桂英 工资", time()));
		accountBook.addBill(new ConsumeBill(5600, "刘益 工资", time()));
		accountBook.addBill(new ConsumeBill(12000, "李微 工资", time()));
		accountBook.addBill(new ConsumeBill(4860, "孙務 工资", time()));
		accountBook.addBill(new ConsumeBill(9300, "杨林 工资", time()));
		accountBook.addBill(new ConsumeBill(14000, "材料费", time()));
		accountBook.addBill(new ConsumeBill(7291.8, "场地", time()));
		accountBook.addBill(new ConsumeBill(23423, "tools", time()));

		Viewer viewe = (Viewer) XMLUtil.getBean(viewer);

		// 访问者访问账本
		Map<String, List<?>> map = accountBook.show(viewe);
		String mapJson = JSON.toJSONString(map);

		return mapJson;

	}

	private static String time() throws ParseException {
		// 第零步：首先肯定要自己规定时间格式
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 这里的parse方法是设置固定时间抛出异常：ParseException

		// 第一步：得到结束时间的毫秒数
		// 将时间转化成Date类型
		Date endTime = simpleDateFormat.parse("2022-09-30 23:59:59");
		// 这里得到一个Date类型时间，由（Date）.gettime得到毫秒数
		// 毫秒数很大，故用long接收
		long endSeconds = endTime.getTime();

		// 第二步：运用同样的方法得到起始时间的毫秒数
		Date startTime = simpleDateFormat.parse("2022-09-01 00:00:00");
		long startSeconds = startTime.getTime();

		// 第三步：用结束的毫秒数-起始的毫秒数=相隔的毫秒数
		long apartSeconds = endSeconds - startSeconds;

		// 第四步：将相隔的毫秒数随机化+起始毫秒数
		long timeSeconds = (long) (apartSeconds * Math.random());
		long realSeconds = startSeconds + timeSeconds;

		// 第五步：将毫秒数转化为时间
		String realTime = simpleDateFormat.format(realSeconds);
		Date realTime1 = simpleDateFormat.parse(realTime);

		String time = simpleDateFormat.format(realTime1);
		return time;
	}
}
