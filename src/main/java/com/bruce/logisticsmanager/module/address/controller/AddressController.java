package com.bruce.logisticsmanager.module.address.controller;

import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import com.bruce.logisticsmanager.module.address.service.IAddressService;
import com.bruce.logisticsmanager.module.address.vo.AddressVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:51
 */
@RestController
@RequestMapping("/address")
@Api(tags = "地址管理")
public class AddressController {

    @Autowired
    @Qualifier("addressServiceImpl")
    private IAddressService iAddressService;

    @PostMapping("/create")
    @ApiOperation("新增")
    public CommonResult<AddressVO> create(@RequestBody AddressDTO dto) {
        return CommonResult.success(iAddressService.create(dto));
    }

    @PostMapping("/updateById")
    @ApiOperation("修改")
    public CommonResult<Boolean> updateById(@RequestBody AddressDTO dto) {
        return CommonResult.success(iAddressService.updateById(dto));
    }

    @DeleteMapping("/deleteById")
    @ApiOperation("删除")
    public CommonResult<Boolean> deleteById(@RequestParam("id") Long id) {
        return CommonResult.success(iAddressService.deleteById(id));
    }
}
