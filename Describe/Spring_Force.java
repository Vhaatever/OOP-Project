package Describe;

import Objt.Objects;
import Objt.Spring;

public interface Spring_Force extends Dispaly {

    double find_omega(double k, double m);
    void update_acc_X(Objects obj, Spring sp, double slice);
    void update_distance_harm(Objects ob, Spring sp, double k);
    void update_velocity_harm(Objects ob, Spring sp, double k);

}
