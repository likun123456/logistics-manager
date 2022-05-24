package com.bruce.logisticsmanager;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class LogisticsManagerApplicationTests {

    @Test
    void contextLoads() throws IOException {
//        // 输入流
        FileInputStream inputStream = new FileInputStream("E:\\文档\\和能人居\\物料数据整合20220427V7.0.xlsx");

        DemoDataListener demoDataListener = new DemoDataListener();
        EasyExcel.read(inputStream, Material.class, demoDataListener).sheet(4).doRead();

        FileInputStream fileInputStream = new FileInputStream("E:\\文档\\和能人居\\物料分类数据.xlsx");
        log.info("shuju:" + JSON.toJSONString(demoDataListener.getDatas()));
        EasyExcel.write("E:\\文档\\和能人居\\test.xlsx").withTemplate(fileInputStream).excelType(ExcelTypeEnum.XLSX).
                autoCloseStream(false).automaticMergeHead(true).sheet().doWrite(demoDataListener.getDatas());

    }

}
