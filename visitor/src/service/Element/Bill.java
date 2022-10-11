package service.Element;

import java.util.Map;

import service.Visitor.Viewer;

//单个单子的接口（相当于Element）
public interface Bill {

    Map<String,cBill> accept(Viewer viewer);

}