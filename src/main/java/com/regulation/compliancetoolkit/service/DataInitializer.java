package com.regulation.compliancetoolkit.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.regulation.compliancetoolkit.entity.StandardDocument;
import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    private final StandardDocumentService documentService;

    public DataInitializer(StandardDocumentService documentService) {
        this.documentService = documentService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (documentService.getDocumentByTitle("GB 17675-2025").isEmpty()) {
            StandardDocument doc = new StandardDocument();
            doc.setTitle("GB 17675-2025");
            doc.setEnglishTitle("Motor vehicle steering systems - Basic requirements");
            doc.setStandardScope("Automotive Steering Systems");
            doc.setReplaceStandard("GB 17675-2018");
            doc.setPublishDate(LocalDate.of(2023, 12, 2));
            doc.setImplementDate(LocalDate.of(2026, 7, 1));
            doc.setDraftUnit("上海汽车集团股份有限公司技术中心、中国汽车技术研究中心有限公司、北京汽车股份有限公司等");
            doc.setContent("""
                <p>GB 17675-2025《汽车转向系基本要求》于2023年12月2日发布，2026年7月1日实施。核心是通过转向角（SWP）等新技术，删除机械连接强度要求，同时强化安全冗余功能要求，为转向系统发展留出明确空间。</p>
                <h3>1. 适配新技术，删除机械连接强制条款</h3>
                <p>取消了方向盘与转向车轮间机械连接的强制要求，为线控转向等无物理连接技术法规支撑，同时明确线控转向需满足高安全冗余功能和安全要求。</p>
                <h3>2. 功能安全等级与冗余要求</h3>
                <p>线控转向系统必须达到汽车功能安全最高等级ASIL D，需实现双电源、双通道、双控制器、双执行器等冗余方案，单一故障不得导致转向功能失效，失效策略需满足控制接管水平（部分企业达到ASIL D）。</p>
                <h3>3. 网络与功能安全</h3>
                <p>明确动力域、底盘域、能量域相关系统等的安全应对策略，包括车辆状态安全、降级运行要求、降级后超时时间（需在规定时间内自动减速）、减速度、报警信号触发等。可根据驾驶辅助功能水平、驾驶员状态等调整降级后仍能完成特定转向操作，保障车辆可控，降低后端安全责任。</p>
                <h3>4. 报警信号要求</h3>
                <p>新增电装置老化、性能不足的报警方式，提醒管理系统需实时监测电装置状态，及时触发报警，保障系统安全运行。</p>
                <h3>5. 适用范围</h3>
                <p>适用于GSO 11509规定的M、N、O类车辆，规定转向系统基本要求、型式判定及试验方法，全部代替GB 17675-2021。</p>
                <h3>6. 适配新技术，删除机械连接强制条款</h3>
                <p>取消了方向盘与转向车轮间机械连接的强制要求，为线控转向等无物理连接技术法规支撑，同时明确线控转向需满足高安全冗余功能和安全要求。</p>
                <h3>7. 功能安全等级与冗余要求</h3>
                <p>线控转向系统必须达到汽车功能安全最高等级ASIL D，需实现双电源、双通道、双控制器、双执行器等冗余方案，单一故障不得导致转向功能失效，失效策略需满足控制接管水平（部分企业达到ASIL D）。</p>
                <h3>8. 网络与功能安全</h3>
                <p>明确动力域、底盘域、能量域相关系统等的安全应对策略，包括车辆状态安全、降级运行要求、降级后超时时间（需在规定时间内自动减速）、减速度、报警信号触发等。可根据驾驶辅助功能水平、驾驶员状态等调整降级后仍能完成特定转向操作，保障车辆可控，降低后端安全责任。</p>
                <h3>9. 报警信号要求</h3>
                <p>新增电装置老化、性能不足的报警方式，提醒管理系统需实时监测电装置状态，及时触发报警，保障系统安全运行。</p>
                <h3>10. 适用范围</h3>
                <p>适用于GSO 11509规定的M、N、O类车辆，规定转向系统基本要求、型式判定及试验方法，全部代替GB 17675-2021。</p>
                <h3>11. 适配新技术，删除机械连接强制条款</h3>
                <p>取消了方向盘与转向车轮间机械连接的强制要求，为线控转向等无物理连接技术法规支撑，同时明确线控转向需满足高安全冗余功能和安全要求。</p>
                <h3>12. 功能安全等级与冗余要求</h3>
                <p>线控转向系统必须达到汽车功能安全最高等级ASIL D，需实现双电源、双通道、双控制器、双执行器等冗余方案，单一故障不得导致转向功能失效，失效策略需满足控制接管水平（部分企业达到ASIL D）。</p>
                <h3>13. 网络与功能安全</h3>
                <p>明确动力域、底盘域、能量域相关系统等的安全应对策略，包括车辆状态安全、降级运行要求、降级后超时时间（需在规定时间内自动减速）、减速度、报警信号触发等。可根据驾驶辅助功能水平、驾驶员状态等调整降级后仍能完成特定转向操作，保障车辆可控，降低后端安全责任。</p>
                <h3>14. 报警信号要求</h3>
                <p>新增电装置老化、性能不足的报警方式，提醒管理系统需实时监测电装置状态，及时触发报警，保障系统安全运行。</p>
                <h3>15. 适用范围</h3>
                <p>适用于GSO 11509规定的M、N、O类车辆，规定转向系统基本要求、型式判定及试验方法，全部代替GB 17675-2021。</p>
                <h3>16. 网络与功能安全</h3>
                <p>明确动力域、底盘域、能量域相关系统等的安全应对策略，包括车辆状态安全、降级运行要求、降级后超时时间（需在规定时间内自动减速）、减速度、报警信号触发等。可根据驾驶辅助功能水平、驾驶员状态等调整降级后仍能完成特定转向操作，保障车辆可控，降低后端安全责任。</p>
            """);
            documentService.saveDocument(doc);
        }
    }
}
