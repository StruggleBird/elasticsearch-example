package org.zt.elasticsearch.example.consts;

import java.util.regex.Pattern;

/**
 * 火眼跟踪系统中全局常量配置
 *
 * @author : David.Song/Java Engineer
 * @date : 2016-06-14 8:50
 * @see
 * @since : 1.0.0
 */
public class FireEyeConstant {
    /**
     * The client sent ("cs") a request to a server.
     */
    public static final String CLIENT_SEND = "cs";

    /**
     * The client received ("cr") a response from a server.
     */
    public static final String CLIENT_RECV = "cr";

    /**
     * The server sent ("ss") a response to a client.
     */
    public static final String SERVER_SEND = "ss";

    /**
     * The server received ("sr") a request from a client.
     */
    public static final String SERVER_RECV = "sr";
    /*
     * ZK数据节点dubbo根节点
     */
    public static String ZOOKEEPER_DUBBO_ROOT_PATH = "/dubbo";
    /*
     * ZK数据节点提供者节点
     */
    public static String ZOOKEEPER_DUBBO_PROVIDERS_NODE = "/providers";


    public static final String CONSUMER_SIDE = "consumer";
    public static final String PROVIDER_SIDE = "provider";


    //链路日志存储的索引名称
    public static final String TRACE_LOG_INDEX = "fireeye_trace_log";
    public static final String SPAN_DOC_TYPE = "span_doc";
    public static final String TRACE_STEP_DOC_TYPE = "trace_step_doc";
    public static final String TRACE_STAT_CALL_DOC_TYPE = "trace_stat_call_doc";



    public static final String  DEFAULT_KEY_PREFIX                 = "default.";
    public static final Pattern COMMA_SPLIT_PATTERN                = Pattern
            .compile("\\s*[,]+\\s*");
    public static final String  REMOVE_VALUE_PREFIX                = "-";
    public static final String  DEFAULT_KEY                        = "default";
}
