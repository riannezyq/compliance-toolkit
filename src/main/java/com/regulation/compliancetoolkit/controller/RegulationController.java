package com.regulation.compliancetoolkit.controller;

import com.regulation.compliancetoolkit.entity.TableDataDto;
import com.regulation.compliancetoolkit.service.RegulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 成员国法规对比 控制器
 * 已添加CORS跨域注解，Vue的localhost:5173可直接访问，无跨域报错
 */
@RestController
@RequestMapping("/api/regulation")
@CrossOrigin(origins = "http://localhost:5173") // 解决Vue跨域问题，无需额外配置
public class RegulationController {

    @Autowired
    private RegulationService regulationService;

    // 接口1：获取国家列表 → 对应Vue的 getCountries()
    @GetMapping("/countries")
    public List<String> getCountries() {
        return regulationService.getCountryList();
    }

    // 接口2：获取分类列表 → 对应Vue的 getCategories()
    @GetMapping("/categories")
    public List<String> getCategories() {
        return regulationService.getCategoryList();
    }

    // 接口3：获取表格数据 → 对应Vue的 getRegulationStats()
    @GetMapping("/stats")
    public List<TableDataDto> getTableData() {
        return regulationService.getTableData();
    }
}