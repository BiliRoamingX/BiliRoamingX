package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.*
import java.io.File

@Patch(
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BiliLayoutAdjustResourcesPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        runCatching {
            context.document["res/layout/bili_player_video_setting_select.xml"].use { dom ->
                dom.walk { node ->
                    if (node["android:id"].let { it == "@id/recycler_container" || it == "@id/recycler_view" || it == "@id/recycler_gradient" }) {
                        node["android:layout_height"] = "36dp"
                    }
                }
            }
            context.document["res/layout/bili_player_video_setting_select_item.xml"].use { dom ->
                dom.children().first()["android:layout_height"] = "36dp"
                dom.walk {
                    if (it["android:id"] == "@id/divider") {
                        it["android:layout_height"] = "12dp"
                        it["app:layout_constraintTop_toTopOf"] = "parent"
                        it["app:layout_constraintBottom_toBottomOf"] = "parent"
                        it.removeAttribute("android:layout_marginTop")
                        it.removeAttribute("android:layout_marginBottom")
                    }
                }
            }
        }
        runCatching {
            arrayOf(
                "res/layout/theseus_united_video_details.xml",
                "res/layout/theseus_playlist_activity.xml",
            ).forEach {
                context.document[it].use { dom ->
                    dom.walk { node ->
                        if (node["android:id"] == "@id/tabs") {
                            node["app:tabContentStart"] = "24dp"
                            node["android:layout_marginEnd"] = "4dp"
                            node["app:layout_constraintEnd_toStartOf"] = "@id/danmaku_input_parent"
                            node.removeAttribute("app:layout_constraintEnd_toEndOf")
                        }
                    }
                }
            }
        }
        context.document["res/layout/bili_app_fragment_author_space_header.xml"].use { dom ->
            dom.walk { node ->
                if (node["android:id"] == "@id/desc_layout") {
                    node.children().first()["android:layout_marginLeft"] = "100dp"
                }
            }
        }
        context.document["res/layout/space_follow_and_charge_plus_view.xml"].use { dom ->
            dom.walk { node ->
                if (node["android:id"] == "@id/charge_plus_button") {
                    node["android:layout_width"] = "70dp"
                }
            }
        }
        runCatching {
            arrayOf(
                "res/layout/bili_app_list_item_super_menu_view_group.xml",
                "res/layout/bili_player_video_setting_select.xml",
            ).forEach {
                context.document[it].use { dom ->
                    dom.walk { node ->
                        if (node.tag == "androidx.recyclerview.widget.RecyclerView") {
                            node.tag = "app.revanced.bilibili.widget.ConsumeTouchRecyclerView"
                        }
                    }
                }
            }
        }
        runCatching {
            var playlistTitleNewLayout = true
            context.document["res/layout/theseus_playlist_title.xml"].use { dom ->
                dom.walk { if (it["android:id"] == "@id/current") playlistTitleNewLayout = false }
            }
            context["res/layout/theseus_playlist_title.xml", false].run {
                if (playlistTitleNewLayout) {
                    coverPlaylistTitleLayoutNew()
                } else {
                    coverPlaylistTitleLayoutOld()
                }
            }
        }
    }

    private fun File.coverPlaylistTitleLayoutOld() = writeText(
        """
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <FrameLayout
                android:id="@id/layout_top_bar"
                android:layout_width="match_parent"
                android:layout_height="19dp"
                android:visibility="gone">

                <View
                    android:layout_width="30dp"
                    android:layout_height="3dp"
                    android:layout_gravity="center"
                    android:background="@drawable/theseus_shape_rect_radius2_ga3_fill" />
            </FrameLayout>

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:paddingLeft="12dp"
                android:paddingTop="4dp"
                android:paddingRight="12dp">

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:id="@id/left"
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    app:layout_constrainedWidth="true"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintHorizontal_chainStyle="spread_inside"
                    app:layout_constraintLeft_toLeftOf="parent"
                    app:layout_constraintRight_toLeftOf="@id/right"
                    app:layout_constraintTop_toTopOf="parent">

                    <com.bilibili.magicasakura.widgets.TintTextView
                        android:id="@id/title"
                        style="@style/T14b"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:ellipsize="end"
                        android:maxLines="1"
                        android:textColor="@color/Text1"
                        app:layout_constrainedWidth="true"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toLeftOf="parent"
                        app:layout_constraintRight_toLeftOf="@id/icon_play"
                        app:layout_constraintTop_toTopOf="parent" />

                    <com.airbnb.lottie.LottieAnimationView
                        android:id="@id/icon_play"
                        android:layout_width="12dp"
                        android:layout_height="12dp"
                        android:layout_marginStart="12dp"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/title"
                        app:layout_constraintRight_toLeftOf="@id/current"
                        app:layout_constraintTop_toTopOf="parent"
                        app:lottie_autoPlay="true"
                        app:lottie_fileName="player_playlist_anim_playing.json"
                        app:lottie_loop="true" />

                    <com.bilibili.magicasakura.widgets.TintTextView
                        android:id="@id/current"
                        style="@style/T14b"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="4dp"
                        android:textColor="@color/Brand_pink"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/icon_play"
                        app:layout_constraintRight_toLeftOf="@id/total"
                        app:layout_constraintTop_toTopOf="parent" />

                    <com.bilibili.magicasakura.widgets.TintTextView
                        android:id="@id/total"
                        style="@style/T14"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textColor="@color/Text3"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/current"
                        app:layout_constraintRight_toRightOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />
                </androidx.constraintlayout.widget.ConstraintLayout>

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:id="@id/right"
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintLeft_toRightOf="@id/left"
                    app:layout_constraintRight_toRightOf="parent"
                    app:layout_constraintTop_toTopOf="parent">

                    <LinearLayout
                        android:id="@id/order_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="match_parent"
                        android:gravity="center_vertical"
                        android:orientation="horizontal"
                        android:paddingLeft="16dp"
                        android:paddingRight="16dp"
                        android:layout_marginRight="8dp"
                        android:visibility="gone"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toLeftOf="parent"
                        app:layout_constraintRight_toLeftOf="@id/arrow"
                        app:layout_constraintTop_toTopOf="parent">

                        <ImageView
                            android:id="@id/order_sort_icon"
                            android:layout_width="16dp"
                            android:layout_height="16dp"
                            app:srcCompat="@drawable/ref_list_sort_positive_line"
                            app:tint="@color/Text3" />

                        <TextView
                            android:id="@id/order_desc"
                            style="@style/T12"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="4dp"
                            android:text="@string/theseus_playlist_default_order"
                            android:textColor="@color/Text3" />
                    </LinearLayout>

                    <ImageView
                        android:id="@id/arrow"
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/order_layout"
                        app:layout_constraintRight_toLeftOf="@id/offline_danmaku_input_parent"
                        app:layout_constraintTop_toTopOf="parent"
                        app:srcCompat="@drawable/ref_arrow_expand_line_500"
                        app:tint="@color/Text3" />

                    <FrameLayout
                        android:id="@id/offline_danmaku_input_parent"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:visibility="gone"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/arrow"
                        app:layout_constraintRight_toRightOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />
                </androidx.constraintlayout.widget.ConstraintLayout>
            </androidx.constraintlayout.widget.ConstraintLayout>
        </LinearLayout>
    """.trimIndent()
    )

    private fun File.coverPlaylistTitleLayoutNew() = writeText(
        """
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <FrameLayout
                android:id="@id/layout_top_bar"
                android:layout_width="match_parent"
                android:layout_height="19dp"
                android:visibility="gone">

                <View
                    android:layout_width="30dp"
                    android:layout_height="3dp"
                    android:layout_gravity="center"
                    android:background="@drawable/theseus_shape_rect_radius2_ga3_fill" />
            </FrameLayout>

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:paddingLeft="12dp"
                android:paddingTop="4dp"
                android:paddingRight="12dp">

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:id="@id/left"
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    app:layout_constrainedWidth="true"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintHorizontal_chainStyle="spread_inside"
                    app:layout_constraintLeft_toLeftOf="parent"
                    app:layout_constraintRight_toLeftOf="@id/right"
                    app:layout_constraintTop_toTopOf="parent">

                    <com.bilibili.magicasakura.widgets.TintTextView
                        android:id="@id/title"
                        style="@style/T16b"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:ellipsize="end"
                        android:maxLines="1"
                        android:textColor="@color/Text1"
                        app:layout_constrainedWidth="true"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toLeftOf="parent"
                        app:layout_constraintRight_toLeftOf="@id/total"
                        app:layout_constraintTop_toTopOf="parent" />

                    <com.bilibili.magicasakura.widgets.TintTextView
                        android:id="@id/total"
                        style="@style/T12"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textColor="@color/Text3"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/title"
                        app:layout_constraintRight_toRightOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />
                </androidx.constraintlayout.widget.ConstraintLayout>

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:id="@id/right"
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintLeft_toRightOf="@id/left"
                    app:layout_constraintRight_toRightOf="parent"
                    app:layout_constraintTop_toTopOf="parent">

                    <LinearLayout
                        android:id="@id/order_layout"
                        android:layout_width="wrap_content"
                        android:layout_height="match_parent"
                        android:gravity="center_vertical"
                        android:orientation="horizontal"
                        android:paddingLeft="16dp"
                        android:paddingRight="16dp"
                        android:layout_marginRight="8dp"
                        android:visibility="gone"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toLeftOf="parent"
                        app:layout_constraintRight_toLeftOf="@id/arrow"
                        app:layout_constraintTop_toTopOf="parent">

                        <ImageView
                            android:id="@id/order_sort_icon"
                            android:layout_width="16dp"
                            android:layout_height="16dp"
                            app:srcCompat="@drawable/ref_list_sort_positive_line"
                            app:tint="@color/Text3" />

                        <TextView
                            android:id="@id/order_desc"
                            style="@style/T12"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="4dp"
                            android:text="@string/theseus_playlist_default_order"
                            android:textColor="@color/Text3" />
                    </LinearLayout>

                    <ImageView
                        android:id="@id/arrow"
                        android:layout_width="24dp"
                        android:layout_height="24dp"
                        android:background="@drawable/theseus_shape_arrow_button_bg"
                        android:padding="4dp"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/order_layout"
                        app:layout_constraintRight_toLeftOf="@id/offline_danmaku_input_parent"
                        app:layout_constraintTop_toTopOf="parent"
                        app:srcCompat="@drawable/ref_arrow_expand_line_500"
                        app:tint="@color/Text3" />

                    <FrameLayout
                        android:id="@id/offline_danmaku_input_parent"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:visibility="gone"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintLeft_toRightOf="@id/arrow"
                        app:layout_constraintRight_toRightOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />
                </androidx.constraintlayout.widget.ConstraintLayout>
            </androidx.constraintlayout.widget.ConstraintLayout>
        </LinearLayout>
    """.trimIndent()
    )
}
