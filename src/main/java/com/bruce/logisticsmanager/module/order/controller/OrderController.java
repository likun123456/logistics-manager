package com.bruce.logisticsmanager.module.order.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.module.order.dto.OrderDTO;
import com.bruce.logisticsmanager.module.order.service.IOrderService;
import com.bruce.logisticsmanager.module.order.vo.OrderVO;
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
@RequestMapping("/order")
@Api(tags = "订单管理")
public class OrderController {

    @Resource
    private IOrderService iOrderService;

    @PostMapping("/create")
    @ApiOperation("新增")
    public CommonResult<OrderVO> create(@RequestBody OrderDTO dto) {
        return CommonResult.success(iOrderService.create(dto));
    }

    @PostMapping("/updateById")
    @ApiOperation("修改")
    public CommonResult<Boolean> updateById(@RequestBody OrderDTO dto) {
        return CommonResult.success(iOrderService.updateById(dto));
    }

    @DeleteMapping("/deleteById")
    @ApiOperation("删除")
    public CommonResult<Boolean> deleteById(@RequestParam("id") Long id) {
        return CommonResult.success(iOrderService.deleteById(id));
    }

    @PostMapping("/pageByCondition")
    @ApiOperation("分页查询")
    public CommonResult<IPage<OrderVO>> pageByCondition(@RequestBody OrderDTO dto) {
        IPage<OrderVO> page = iOrderService.pageByCondition(dto);
        return CommonResult.success(page);
    }
}
