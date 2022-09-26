package facade;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk disk;
    private SSD ssd;
    private OS os;
    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        disk = new HardDisk();
        ssd = new SSD();
        os = new OS();
    }
    public void on(){
        memory.check();
        cpu.run();
        ssd.read();
        disk.read();
        os.load();
    }
    public void off(){
        memory.off();
        cpu.off();
        ssd.off();
        disk.off();
        os.off();
    }
}