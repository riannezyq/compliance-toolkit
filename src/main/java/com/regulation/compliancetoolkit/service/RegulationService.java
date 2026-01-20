package com.regulation.compliancetoolkit.service;

import com.regulation.compliancetoolkit.entity.Category;
import com.regulation.compliancetoolkit.entity.RegulationData;
import com.regulation.compliancetoolkit.entity.TableDataDto;
import com.regulation.compliancetoolkit.repository.CategoryRepository;
import com.regulation.compliancetoolkit.repository.RegulationDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegulationService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RegulationDataRepository regulationDataRepository;

    // 1. 获取国家列表 (和Vue的countryList完全一致)
    public List<String> getCountryList() {
        return regulationDataRepository.findAll().stream()
                .map(RegulationData::getCountry)
                .collect(Collectors.toList());
    }

    // 2. 获取分类列表 (和Vue的categoryList完全一致)
    public List<String> getCategoryList() {
        return categoryRepository.findAll().stream()
                .map(Category::getCategoryName)
                .collect(Collectors.toList());
    }

    // 3. 获取表格数据 (核心！直接返回Vue的tableData格式，无需前端处理)
    public List<TableDataDto> getTableData() {
        List<RegulationData> dataList = regulationDataRepository.findAll();
        List<TableDataDto> tableData = new ArrayList<>();
        for (RegulationData data : dataList) {
            List<Integer> values = new ArrayList<>();
            values.add(data.getCat1());
            values.add(data.getCat2());
            values.add(data.getCat3());
            values.add(data.getCat4());
            values.add(data.getCat5());
            values.add(data.getCat6());
            values.add(data.getCat7());
            tableData.add(new TableDataDto(data.getCountry(), values));
        }
        return tableData;
    }
}