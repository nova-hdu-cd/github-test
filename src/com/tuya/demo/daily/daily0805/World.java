package com.tuya.demo.daily.daily0805;

import java.io.Serializable;

/**
 * @author chendong
 * @date 2020/7/23 9:19 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class World implements Serializable {

    private String worldId;

    public String getWorldId() {
        return worldId;
    }

    public void setWorldId(String worldId) {
        this.worldId = worldId;
    }

    @Override
    public String toString() {
        return "World{" +
                "worldId='" + worldId + '\'' +
                '}';
    }
}
