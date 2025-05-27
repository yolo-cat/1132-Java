public class Main {
    public static void main(String[] args) {
        MainBoard asusBoard = new AsusMainBoard();
        MainBoard gigaBoard = new GigaMainBoard();


        IntelCpu i3Cpu = new I3Cpu();
        asusBoard.installCpu(i3Cpu);
        asusBoard.calculate();
        System.out.println("--------------------");

        IntelCpu i5Cpu = new I5Cpu();
        gigaBoard.installCpu(i5Cpu);
        gigaBoard.calculate();
        System.out.println("--------------------");

        IntelCpu i9Cpu = new I9Cpu();
        asusBoard.installCpu(i9Cpu);
        asusBoard.calculate();
        System.out.println("--------------------");
    }
}
