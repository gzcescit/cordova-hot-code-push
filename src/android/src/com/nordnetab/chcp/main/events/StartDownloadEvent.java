package com.nordnetab.chcp.main.events;

import com.nordnetab.chcp.main.config.ApplicationConfig;

/**
 * Created by Nikolay Demyankov on 25.08.15.
 * <p/>
 * Event is send when update has been installed.
 */
public class StartDownloadEvent extends WorkerEvent {

    public static final String EVENT_NAME = "chcp_startDownload";

    /**
     * Class constructor.
     *
     * @param config application config that was used for installation
     */
    public StartDownloadEvent(ApplicationConfig config) {
        super(EVENT_NAME, null, config);
    }
}
