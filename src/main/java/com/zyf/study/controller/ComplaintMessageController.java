package com.zyf.study.controller;

import com.zyf.study.controller.viewObject.ObjectVO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.service.ComplaintMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/api")
public class ComplaintMessageController extends BaseController {

    @Autowired
    ComplaintMessageService complaintMessageService;

    @RequestMapping("/getAnnualComplaintNumber")
    @ResponseBody
    public List<Object> getAnnualComplaintNumber() throws BusinessException {
        List<Object> data = new ArrayList<>();
        int complaintNumber = complaintMessageService.getAnnualComplaintNumber("2019-01-01");
        ObjectVO objectVO = new ObjectVO();
        objectVO.setName("全年实时投诉量");
        objectVO.setValue(complaintNumber);
        data.add(objectVO);
        return data;
    }


}
