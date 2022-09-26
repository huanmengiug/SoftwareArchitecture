package facade;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk disk;
    private OS os;
    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        disk = new HardDisk();
        os = new OS();
    }
    public void on(){
        memory.check();
        cpu.run();
        disk.read();
        os.load();
    }
    public void off(){
        memory.off();
        cpu.off();
        disk.off();
        os.off();
    }
}
