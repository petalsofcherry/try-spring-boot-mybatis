package cn.petalsofcherry.controller;

import cn.petalsofcherry.domain.Problem;
import cn.petalsofcherry.mapper.ProblemMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-4.
 */
@RestController
public class ProblemController {

    private ProblemMapper problemMapper;

    @GetMapping("/")
    public List<Problem> getProblem() {
        return problemMapper.selectByCondition();
    }
}
