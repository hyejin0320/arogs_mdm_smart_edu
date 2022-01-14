package com.dkitec.mdm.homepage.support.notice;

import com.dkitec.mdm.homepage.common.domain.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

//    @PostMapping("/list")
//    public List<QnaVO> getQnaList(){
//        return noticeService.getNoticeList();
//    }

    @PostMapping("/detail")
    public Map<String, Object> getQnaDetail(@RequestBody NoticeVO noticeVO){
        Map<String, Object> map = new HashMap<>();
        map.put("detail", noticeService.getNoticeDetail(noticeVO.getNoticeNo()));
        return map;
    }

//    @PostMapping("/insert")
//    public @ResponseBody
//    ResultVO insertQna(@RequestBody QnaVO qnaVO){
//        ResultVO resultVO = new ResultVO();
//        resultVO.setValid(noticeService.insertNotice(qnaVO)>0);
//        return resultVO;
//    }
}
