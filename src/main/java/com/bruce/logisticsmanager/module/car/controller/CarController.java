package com.bruce.logisticsmanager.module.car.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.module.car.dto.CarDTO;
import com.bruce.logisticsmanager.module.car.service.ICarService;
import com.bruce.logisticsmanager.module.car.vo.CarVO;
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
@RequestMapping("/car")
@Api(tags = "车辆管理")
public class CarController {

    @Resource
    private ICarService iCarService;

    @PostMapping("/create")
    @ApiOperation("新增")
    public CommonResult<CarVO> create(@RequestBody CarDTO dto) {
        return CommonResult.success(iCarService.create(dto));
    }

    @PostMapping("/updateById")
    @ApiOperation("修改")
    public CommonResult<Boolean> updateById(@RequestBody CarDTO dto) {
        return CommonResult.success(iCarService.updateById(dto));
    }

    @DeleteMapping("/deleteById")
    @ApiOperation("删除")
    public CommonResult<Boolean> deleteById(@RequestParam("id") Long id) {
        return CommonResult.success(iCarService.deleteById(id));
    }

    @PostMapping("/pageByCondition")
    @ApiOperation("分页查询")
    public CommonResult<IPage<CarVO>> pageByCondition(@RequestBody CarDTO dto) {
        IPage<CarVO> page = iCarService.pageByCondition(dto);
        return CommonResult.success(page);
    }


}
