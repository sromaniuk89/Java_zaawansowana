//kiedy dziedzicze inne interfejsy wowczas uzywam extends
//a nie implements
public interface ICarWithClima extends IDrive, IClimaControl {
    boolean canIOpenWindow();
}
