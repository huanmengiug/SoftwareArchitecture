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
    private ArrayList<ControlFlag> alist = new ArrayList<ControlFlag>();
    private boolean power = false;
    private static final int success = 1;
    private static final int error = 0;

    private Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        hd = new HardDisk();
        ssd = new SolidStateDisk();
        os = new OS();
    }

    private static class SingletonHelper {
        private static final Mainframe INSTANCE = new Mainframe();
    }

    public boolean getState(){
        return power;
    }

    public static Mainframe getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static Mainframe getMainframe(String o) {
        Mainframe frame = getInstance();
        
        if (o.contentEquals("on")) {
            frame.on();
        } else if (o.contentEquals("off")) {
            frame.off();
        }
        return frame;
    }

    private void on() {
        if (power == false) {
            alist.clear();
            alist.add(new ControlFlag(cpu.run(success) ? 1 : 0));
            alist.add(new ControlFlag(memory.check(success) ? 1 : 0));
            alist.add(new ControlFlag(ssd.read(success) ? 1 : 0));
            alist.add(new ControlFlag(hd.read(success) ? 1 : 0));
            alist.add(new ControlFlag(os.load(error) ? 1 : 0));

            Long sum = alist.stream().mapToLong(ControlFlag::getNum).sum();
            if (sum < alist.size()) {
                System.out.println("电脑开启出错！！！");
                System.out.println(alist.size() - sum);
            } else if (sum == alist.size()) {
                power = true;
                System.out.println("电脑开启");
            }
        } else {
            System.out.println("电脑已开启");
        }

    }

    private void off() {
        if (power == true) {
            alist.clear();
            alist.add(new ControlFlag(cpu.off(success) ? 1 : 0));
            alist.add(new ControlFlag(memory.off(success) ? 1 : 0));
            alist.add(new ControlFlag(ssd.off(success) ? 1 : 0));
            alist.add(new ControlFlag(hd.off(success) ? 1 : 0));
            alist.add(new ControlFlag(os.off(success) ? 1 : 0));

            Long sum = alist.stream().mapToLong(ControlFlag::getNum).sum();
            if (sum < alist.size()) {
                System.out.println("电脑关机出错！！！");
                System.out.println(alist.size() - sum);
            } else if (sum == alist.size()) {
                power = false;
                System.out.println("电脑关机");
            }
        } else {
            System.out.println("电脑已关机");
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
