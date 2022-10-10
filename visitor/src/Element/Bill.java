package Element;

import java.util.Map;

import Visitor.Viewer;

//单个单子的接口（相当于Element）
public interface Bill {

    Map<String,Map<String,?>> accept(Viewer viewer);

}