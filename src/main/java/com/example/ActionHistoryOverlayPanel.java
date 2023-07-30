package com.example;

import ch.qos.logback.core.net.server.Client;
import net.runelite.client.ui.overlay.OverlayPanel;

import java.awt.*;

public class ActionHistoryOverlayPanel extends OverlayPanel {
    private final Client client;
    private final ExamplePlugin plugin;

    public ActionHistoryOverlayPanel(Client client, ExamplePlugin plugin) {
        this.client = client;
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics) {

        return super.render(graphics);
    }
}
