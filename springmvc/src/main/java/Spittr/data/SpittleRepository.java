package Spittr.data;


import Spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    /**
     * Encuentra un spittle especifico.
     *
     * @param id
     *            - Id de spittle.
     * @return Spittle con id solicitado.
     */
    Spittle findOne(Long id);

    /**
     * Busca spittles.
     *
     * @param max
     *            - Max id de spittle.
     * @param count
     *            - maxima cuenta.
     * @return Lista de spittles.
     */
    List<Spittle> findSpittles(long max, int count);
}
