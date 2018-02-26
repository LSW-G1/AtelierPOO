package Televisions;

import java.util.List;

public interface TVDAO {

    void insert(TV television);
    List<TV> selectAll();

}
