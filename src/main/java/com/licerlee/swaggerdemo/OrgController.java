package com.licerlee.swaggerdemo;

import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * @author licer
 */
@RestController
@RequestMapping("org")
@EnableSwagger2
@Api(value = "组织架构接口", description = "组织架构接口说明", tags = "组织架构接口tags", consumes = "消费者？" , hidden = false, produces = "生产者？", protocols = "协议？")
public class OrgController {


    @GetMapping
    @ApiOperation(value = "查询所有组织", notes = "获取所有的组织架构，也可以根据条件进行筛选")
    public Map<String, Object> list(){

        ConcurrentMap<String, Object> map = Maps.newConcurrentMap();
        map.put("msg", "Hello swagger");

        return map;

    }

    @ApiImplicitParam
    @ApiParam(value = "name")
    @ApiOperation(value = "增加一个组织")
    @PostMapping
    public Map<String, Object> post(@RequestParam String name){

        ConcurrentMap<String, Object> map = Maps.newConcurrentMap();
        map.put("msg", "name="+name);

        return map;

    }


}
