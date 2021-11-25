package Describe;

import Objt.Objects;
import Objt.Wedge;
public interface Slope extends Display {
    void update_vel_init(Objects obj, Double u, Double k);
    void update_acc(Objects obj, Wedge wd, double friction);
}
