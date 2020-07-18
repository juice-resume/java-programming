package easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RawReadListener extends AnalysisEventListener<ExcelRaw> {
    private static final Logger logger = LoggerFactory.getLogger(RawReadListener.class);
    private List<ExcelRaw> raws = new ArrayList<>();

    @Override
    public void invoke(ExcelRaw data, AnalysisContext context) {
        logger.info("开始处理数据:{}", JSON.toJSONString(data));
        raws.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        logger.info("处理完成:{}", JSON.toJSONString(raws));
    }
}
