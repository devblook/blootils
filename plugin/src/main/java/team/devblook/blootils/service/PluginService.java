package team.devblook.blootils.service;

import team.devblook.blootils.Blootils;
import team.devblook.blootils.api.Service;

import javax.inject.Inject;

public class PluginService implements Service {
    @Inject
    private Blootils plugin;

    @Override
    public void start() {
        plugin.getLogger().info("Blootils has been enabled!");
    }

    @Override
    public void stop() {
        plugin.getLogger().info("Blootils has been disabled!");
    }

}
