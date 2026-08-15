package tv.danmaku.biliplayerv2.service;

/* compiled from: BL */
public interface IPlayerCoreService {
    float getPlaySpeed(boolean z);

    void pause();

    void play();

    void seekTo(int i, boolean z);

    void setPlaySpeed(float f);
}