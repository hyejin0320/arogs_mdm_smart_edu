package com.dkitec.mdm.homepage.support.qna;

import com.dkitec.mdm.homepage.common.domain.QnaVO;
import com.dkitec.mdm.homepage.common.domain.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/qna")
public class QnaController {

    @Autowired
    QnaService qnaService;

    @PostMapping("/alllist")
    public List<QnaVO> getAllQnaList(@RequestBody QnaVO qnaVO){
        return qnaService.getAllQnaList(qnaVO);
    }

    @PostMapping("/list")
    public List<QnaVO> getQnaList(@RequestBody QnaVO qnaVO){
        return qnaService.getQnaList(qnaVO);
    }

    @PostMapping("/detail")
    public Map<String, Object> getQnaDetail(@RequestBody QnaVO qnaVO){
        Map<String, Object> map = new HashMap<>();
        map.put("detail", qnaService.getQnaDetail(qnaVO));
        return map;
    }

    @PostMapping("/insert")
    public @ResponseBody ResultVO insertQna(@RequestBody QnaVO qnaVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setValid(qnaService.insertQna(qnaVO)>0);
        return resultVO;
    }

    @PostMapping("/update")
    public @ResponseBody ResultVO updateQna(@RequestBody QnaVO qnaVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setValid(qnaService.updateQna(qnaVO)>0);
        return resultVO;
    }

    @PostMapping("/remove")
    public @ResponseBody ResultVO removeQna(@RequestBody QnaVO qnaVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setValid(qnaService.removeQna(qnaVO.getQuestNo())>0);
        return resultVO;
    }

    @PostMapping("/confirm_password")
    public @ResponseBody ResultVO confirmPassword(@RequestBody QnaVO qnaVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setValid(qnaService.confirmPassword(qnaVO));
        return resultVO;
    }
}
