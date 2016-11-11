package Spittr.data;


import Spittr.Spittle;

import java.util.List;

public interface SpittleRepository {

    Spittle findOne(Long id);

    List<Spittle> findSpittles(long max, int count);
}
