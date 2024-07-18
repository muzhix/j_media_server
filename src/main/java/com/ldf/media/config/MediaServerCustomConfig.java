package com.ldf.media.config;

import lombok.Data;

@Data
public class MediaServerCustomConfig {
    /**
     * 启用rtmp流媒体服务器
     */
    private Boolean enable_rtmp_server = true;
    /**
     * 启用rtsp流媒体服务器
     */
    private Boolean enable_rtsp_server = false;
    /**
     * 启用http流媒体服务器
     */
    private Boolean enable_http_server = true;
    /**
     * 启用rtc流媒体服务器
     */
    private Boolean enable_rtc_server = false;
}
