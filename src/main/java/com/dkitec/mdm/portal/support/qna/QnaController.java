package com.dkitec.mdm.portal.support.qna;

import com.dkitec.mdm.portal.domain.QnaVO;
import com.dkitec.mdm.portal.domain.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qna")
public class QnaController {

    @Autowired
    QnaService qnaService;

    @PostMapping("/list")
    public List<QnaVO> getQnaList(){
        return qnaService.getQnaList();
    }

    @PostMapping("/insert")
    public @ResponseBody ResultVO insertQna(@RequestBody QnaVO qnaVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setValid(qnaService.insertQna(qnaVO)>0);
        return resultVO;
    }
}
