package Describe;

import Objt.Objects;
import Objt.Wedge;

public interface Friction extends Forces {
    void check_friction(Objects obj);
    void check_friction(Objects obj, Wedge wedge);

}
