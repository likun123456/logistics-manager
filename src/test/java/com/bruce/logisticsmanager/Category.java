package com.bruce.logisticsmanager;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/19 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @ExcelProperty("cateName")
    private String cateName;

    @ExcelProperty("cateCode")
    private String cateCode;

    @ExcelProperty("cateLevelCode")
    private String cateLevelCode;

    @ExcelProperty("upCateName")
    private String upCateName;

    @ExcelProperty("upCateCode")
    private String upCateCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(cateName, category.cateName) && Objects.equals(cateCode, category.cateCode) && Objects.equals(cateLevelCode, category.cateLevelCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cateName, cateCode, cateLevelCode);
    }
}
