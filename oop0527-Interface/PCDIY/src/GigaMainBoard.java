public class GigaMainBoard implements MainBoard {

  private IntelCpu cpu;

  @Override
  public void installCpu(IntelCpu cpu) {
    this.cpu = cpu;
    System.out.println("Giga MainBoard: CPU installed.");
  }

  @Override
  public void calculate() {
    if (cpu != null) {
      System.out.println("Giga MainBoard: Calculating with CPU:");
      cpu.pin1();
      cpu.pin2();
      cpu.pin107();
      cpu.pin108();
    } else {
      System.out.println("Giga MainBoard: No CPU installed.");
    }
  }


}
