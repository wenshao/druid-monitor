package com.alibaba.druid.monitor.entity.stat;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class DruidSqlStat {

    private String        dbType;

    @JSONField(name = "SQL")
    private String        sql;

    @JSONField(name = "ExecuteCount")
    private long          executeCount;

    private long          executeErrorCount;

    @JSONField(name = "LastError")
    private ThrowableInfo executeErrorLast;
    private Date          executeErrorLastTime;

    @JSONField(name = "EffectedRowCount")
    private long          updateCount;
    private long          fetchRowCount;

    @JSONField(name = "LastTime")
    private Date          executeLastStartTime;

    @JSONField(name = "MaxTimespan")
    private long          executeMillisMax;

    // TODD ...

}
