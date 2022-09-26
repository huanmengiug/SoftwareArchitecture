package facade.Facade;

import java.util.ArrayList;

import facade.SubSystem.CPU;
import facade.SubSystem.HardDisk;
import facade.SubSystem.Memory;
import facade.SubSystem.OS;
import facade.SubSystem.SolidStateDisk;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hd;
    private SolidStateDisk ssd;
    private OS os;
    private static final int success = 1;
    private static final int error = 0;

    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        hd = new HardDisk();
        ssd = new SolidStateDisk();
        os = new OS();
    }

    public void on() {
        ArrayList<ControlFlag> alist = new ArrayList<ControlFlag>();
        alist.add(new ControlFlag(cpu.run(success) ? 1 : 0));
        alist.add(new ControlFlag(memory.check(error) ? 1 : 0));
        alist.add(new ControlFlag(ssd.read(success) ? 1 : 0));
        alist.add(new ControlFlag(hd.read(success) ? 1 : 0));
        alist.add(new ControlFlag(os.load(success) ? 1 : 0));

        Long sum = alist.stream().mapToLong(ControlFlag::getNum).sum();
        if (sum < alist.size()) {
            System.out.println("电脑开启出错！！！");
            System.out.println(alist.size() - sum);
        } else if (sum == alist.size()) {
            System.out.println("电脑开启");
        }
    }

    public void off() {
        ArrayList<ControlFlag> alist = new ArrayList<ControlFlag>();
        alist.add(new ControlFlag(cpu.run(success) ? 1 : 0));
        alist.add(new ControlFlag(memory.check(success) ? 1 : 0));
        alist.add(new ControlFlag(ssd.read(success) ? 1 : 0));
        alist.add(new ControlFlag(hd.read(success) ? 1 : 0));
        alist.add(new ControlFlag(os.load(success) ? 1 : 0));

        Long sum = alist.stream().mapToLong(ControlFlag::getNum).sum();
        if (sum < alist.size()) {
            System.out.println("电脑关机出错！！！");
            System.out.println(alist.size() - sum);
        } else if (sum == alist.size()) {
            System.out.println("电脑关机");
        }
    }

    private class ControlFlag {
        Integer num;

        public ControlFlag(int flag) {
            this.num = flag;
        }

        public Integer getNum() {
            return num;
        }
    }
}
