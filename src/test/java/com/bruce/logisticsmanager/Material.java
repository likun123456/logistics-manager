package com.bruce.logisticsmanager;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/19 15:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Material {

    @ExcelProperty("一级分类名称")
    private String oneName;
    @ExcelProperty("一级分类编码")
    private String oneCode;
    @ExcelProperty("二级分类名称")
    private String twoName;
    @ExcelProperty("二级分类编码")
    private String twoCode;
    @ExcelProperty("三级分类名称")
    private String threeName;
    @ExcelProperty("三级分类编码")
    private String threeCode;

}
