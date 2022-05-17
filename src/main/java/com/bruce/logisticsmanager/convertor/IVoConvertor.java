package com.bruce.logisticsmanager.convertor;

import java.util.List;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 9:37
 */
public interface IVoConvertor <V, P>{
    P vo2Po(V var1);

    V po2Vo(P var1);

    List<P> voList2PoList(List<V> var1);

    List<V> poList2VoList(List<P> var1);
}
