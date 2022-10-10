package Element;

import Visitor.Viewer;

//单个单子的接口（相当于Element）
public interface Bill {

    void accept(Viewer viewer);

}