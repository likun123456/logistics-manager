package com.bruce.logisticsmanager.convertor;

import java.util.List;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 9:35
 */
public interface IDtoConvertor<D, P> {

    P dto2Po(D var1);

    D po2Dto(P var1);

    List<P> dtoList2PoList(List<D> var1);

    List<D> poList2DtoList(List<P> var1);
}
