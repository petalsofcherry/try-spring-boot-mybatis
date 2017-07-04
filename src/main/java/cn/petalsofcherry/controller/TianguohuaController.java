package cn.petalsofcherry.controller;

import cn.petalsofcherry.domain.Tianguohua;
import cn.petalsofcherry.mapper.TianguohuaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-4.
 */
@RestController
public class TianguohuaController {
    @Autowired private TianguohuaMapper tianguohuaMapper;

    @GetMapping("/")
    public List<Tianguohua> get() {
        return tianguohuaMapper.selectByCondtion();
    }
}
