package tv.danmaku.bili.ui.splash.ad.model;

import java.util.List;

public class SplashData {
    public List<Splash> splashList;
    public List<SplashShowStrategy> strategyList;

    public final List<Splash> getSplashList() {
        return this.splashList;
    }

    public final List<SplashShowStrategy> getStrategyList() {
        return this.strategyList;
    }
}
