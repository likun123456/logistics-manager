package com.bruce.logisticsmanager.module.driver.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.module.driver.dto.DriverDTO;
import com.bruce.logisticsmanager.module.driver.service.IDriverService;
import com.bruce.logisticsmanager.module.driver.vo.DriverVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:51
 */
@RestController
@RequestMapping("/driver")
@Api(tags = "司机管理")
public class DriverController {

    @Resource
    private IDriverService iDriverService;

    @PostMapping("/create")
    @ApiOperation("新增")
    public CommonResult<DriverVO> create(@RequestBody DriverDTO dto) {
        return CommonResult.success(iDriverService.create(dto));
    }

    @PostMapping("/updateById")
    @ApiOperation("修改")
    public CommonResult<Boolean> updateById(@RequestBody DriverDTO dto) {
        return CommonResult.success(iDriverService.updateById(dto));
    }

    @DeleteMapping("/deleteById")
    @ApiOperation("删除")
    public CommonResult<Boolean> deleteById(@RequestParam("id") Long id) {
        return CommonResult.success(iDriverService.deleteById(id));
    }

    @PostMapping("/pageByCondition")
    @ApiOperation("分页查询")
    public CommonResult<IPage<DriverVO>> pageByCondition(@RequestBody DriverDTO dto) {
        IPage<DriverVO> page = iDriverService.pageByCondition(dto);
        return CommonResult.success(page);
    }
}
