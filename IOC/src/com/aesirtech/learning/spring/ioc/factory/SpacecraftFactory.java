package com.aesirtech.learning.spring.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 15:40
 */
public class SpacecraftFactory {
    private static Map<String, Spacecraft> spacecrafts = new HashMap<String, Spacecraft>();

    static {
        spacecrafts.put("Space Shuttle", new Spacecraft("Space Shuttle", 25, true));
        spacecrafts.put("Carrier Rocket", new Spacecraft("Carrier Rocket", 10, false));
    }

    public static Spacecraft getSpacecraft(String type) {
        return spacecrafts.get(type);
    }
}
