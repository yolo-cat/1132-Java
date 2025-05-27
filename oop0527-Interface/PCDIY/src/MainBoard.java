public interface MainBoard {
    /**
     * Install the CPU on the mainboard.
     *
     * @param cpu The Intel CPU to be installed.
     */
    void installCpu(IntelCpu cpu);

    /**
     * Perform a calculation using the installed CPU.
     */
    void calculate();

}
