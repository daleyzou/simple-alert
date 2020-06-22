package simple.alert;

import java.util.List;
import org.junit.Test;

public class AlertSystemTest {

    @Test
    public void alertWhenBelowThreshold() {
        // TODO: 2020/6/12 完成报警系统实现，小于5时报警
        AlertSystem alertSystem = new AlertSystem();

        List<String> results = alertSystem.probe(1, 2, 3, 4, 5, 6, 7);

        // TODO: 2020/6/12 验证results包含如下结果
        // "CRITICAL", "CRITICAL", "CRITICAL", "CRITICAL", "OK", "OK", "OK"
    }
}
