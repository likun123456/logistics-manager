package com.bruce.logisticsmanager;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.CellExtra;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ConverterUtils;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.ListUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/19 15:38
 */
@Slf4j
public class DemoDataListener implements ReadListener<Material> {
    /**
     * 每隔5条存储数据库，实际使用中可以100条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 100;
    /**
     * 缓存的数据
     */
    private List<Material> cachedDataList = new ArrayList<>();

    private final Set<Category> set = new HashSet<>();

    public DemoDataListener() {
        // 这里是demo，所以随便new一个。实际使用如果到了spring,请使用下面的有参构造函数
    }


    @Override
    public void onException(Exception e, AnalysisContext analysisContext) throws Exception {

    }

    @Override
    public void invokeHead(Map<Integer, CellData> map, AnalysisContext analysisContext) {
        this.invokeHeadMap(ConverterUtils.convertToStringMap(map, analysisContext), analysisContext);
    }

    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
    }

    @Override
    public void invoke(Material material, AnalysisContext analysisContext) {
        cachedDataList.add(material);
    }

    @Override
    public void extra(CellExtra cellExtra, AnalysisContext analysisContext) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("全部数据,长度：{}，:大小{}", cachedDataList.size(), JSON.toJSONString(cachedDataList));
        cachedDataList.forEach(e -> {
            set.add(new Category(e.getOneName(), e.getOneCode() ,e.getOneCode(), null, null));
            set.add(new Category(e.getTwoName(), e.getTwoCode() ,e.getTwoCode(), e.getOneName(), e.getOneCode()));
            set.add(new Category(e.getThreeName(), e.getThreeCode() ,e.getThreeCode(), e.getTwoName(), e.getTwoCode()));
        });
        log.info("全部分类,长度：{}， 数据{}", set.size(), JSON.toJSONString(set));
    }

    @Override
    public boolean hasNext(AnalysisContext analysisContext) {
        return true;
    }

    public List<Category> getDatas() {
        return new ArrayList<>(set);
    }
}
