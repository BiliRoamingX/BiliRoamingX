package tv.danmaku.bili.ui.splash.common.search;

import androidx.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes17.dex */
public final class QueryItem {
    private long eTime;
    private long id;
    @Nullable
    private String query;
    private long sTime;

    public QueryItem(long j, @Nullable String str, long j2, long j3) {
        this.id = j;
        this.query = str;
        this.sTime = j2;
        this.eTime = j3;
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.query;
    }

    public final long component3() {
        return this.sTime;
    }

    public final long component4() {
        return this.eTime;
    }

    @NotNull
    public final QueryItem copy(long j, @Nullable String str, long j2, long j3) {
        return new QueryItem(j, str, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueryItem) {
            QueryItem queryItem = (QueryItem) obj;
            return this.id == queryItem.id && Intrinsics.areEqual(this.query, queryItem.query) && this.sTime == queryItem.sTime && this.eTime == queryItem.eTime;
        }
        return false;
    }

    public final long getETime() {
        return this.eTime;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    public final long getSTime() {
        return this.sTime;
    }

    public final void setETime(long j) {
        this.eTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setSTime(long j) {
        this.sTime = j;
    }

    @NotNull
    public String toString() {
        return "QueryItem(id=" + this.id + ", query=" + this.query + ", sTime=" + this.sTime + ", eTime=" + this.eTime + ')';
    }
}
