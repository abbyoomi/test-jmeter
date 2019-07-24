package com.jmeter.jmeterdemo.controller;

import com.jmeter.jmeterdemo.model.JmeterEntity;
import com.jmeter.jmeterdemo.model.ResultBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testJmeter")
public class TestJmeterController {

    @RequestMapping(value = "/jmeterGet", method = RequestMethod.GET)
    public ResultBean jmeterGet(@RequestParam Integer flag){
        if(flag == 1){
            JmeterEntity jmeterEntity = new JmeterEntity();
            jmeterEntity.setName("jmetertest");
            jmeterEntity.setMethod("GET");
            jmeterEntity.setFunction("test");

            ResultBean resultBean = new ResultBean();
            resultBean.setData(jmeterEntity);

            return resultBean;
        }
        ResultBean resultBean = new ResultBean<>();
        resultBean.setErrorMessage("获取信息失败");
        resultBean.setFlag(ResultBean.FAIL);
        resultBean.setCode(ResultBean.FAIL);

        return resultBean;
    }

    @RequestMapping(value = "/jmeterPost", method = RequestMethod.POST)
    public ResultBean jmeterPost(@RequestParam Integer flag) {

        if (flag == 1) {
            JmeterEntity jmeterEntity = new JmeterEntity();
            jmeterEntity.setName("jmetertest");
            jmeterEntity.setMethod("POST");
            jmeterEntity.setFunction("test");

            ResultBean resultBean = new ResultBean();
            resultBean.setData(jmeterEntity);

            return resultBean;
        }
        ResultBean resultBean = new ResultBean<>();
        resultBean.setErrorMessage("获取信息失败");
        resultBean.setFlag(ResultBean.FAIL);
        resultBean.setCode(ResultBean.FAIL);

        return resultBean;

    }
}
