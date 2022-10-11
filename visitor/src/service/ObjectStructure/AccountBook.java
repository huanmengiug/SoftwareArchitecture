package service.ObjectStructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import service.Element.Bill;
import service.Element.cBill;
import service.Visitor.Viewer;

//账本类（相当于ObjectStruture）
public class AccountBook {
	// 单子列表
	private List<Bill> billList = new ArrayList<Bill>();

	// 添加单子
	public void addBill(Bill bill) {
		billList.add(bill);
	}

	// 供账本的查看者查看账本
	public Map<String, List<?>> show(Viewer viewer) {
		Map<String, List<?>> map = new HashMap<>();
		List<cBill> inlList = new ArrayList<>(), outList = new ArrayList<>();

		for (Bill bill : billList) {
			Map<String, cBill> mapper = bill.accept(viewer);
			if (mapper != null) {
				if (mapper.containsKey("in")) {
					inlList.add(mapper.get("in"));
				} else if (mapper.containsKey("out")) {
					outList.add(mapper.get("out"));
				}

			}
		}
		// 使用 Stream 排序
		inlList = inlList.stream().sorted(Comparator.comparing(cBill::getMoney).reversed()).collect(Collectors.toList());
		outList = outList.stream().sorted(Comparator.comparing(cBill::getMoney).reversed()).collect(Collectors.toList());
		map.put("in", inlList);
		map.put("out", outList);
		return map;
	}
}