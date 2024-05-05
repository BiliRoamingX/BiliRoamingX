package app.revanced.bilibili.widget

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import app.revanced.bilibili.utils.*
import com.bilibili.lib.ui.garb.Garb
import com.bilibili.magicasakura.widgets.TintFrameLayout

/**
 * should only used by hd client
 */
@SuppressLint("ViewConstructor")
class HdBaseToolbar(
    context: Context,
    title: String,
    private val showSearchMenu: Boolean,
    private val showSearchBar: Boolean,
    private val onBack: (() -> Unit)? = null
) : TintFrameLayout(context) {
    var onSearch: (String) -> Unit = {}
    var onSearchMenuClick: () -> Unit = {}

    private val toolbar: Toolbar
    private val searchBar by unsafeLazy {
        SearchBar(context, true).apply {
            this.onSearch = { this@HdBaseToolbar.onSearch(it) }
        }
    }

    init {
        context.inflateLayout("hd_bili_app_base_toolbar_layout", this)
        val titleView = findView<TextView>("hd_tool_bar_title").apply {
            isVisible = title.isNotEmpty()
            text = title
        }
        findView<View>("hd_tool_bar_back").run {
            isVisible = onBack != null
            onClick { onBack?.invoke() }
        }
        toolbar = findView("hd_tool_bar")
        if (showSearchBar) {
            titleView.hide()
            toolbar.addView(searchBar)
        } else if (showSearchMenu) {
            val menuId = Utils.getResId("biliroaming_menu_item_action_search", "id")
            val menuTitle = Utils.getString("biliroaming_search")
            val searchMenu = toolbar.menu.add(Menu.NONE, menuId, Menu.NONE, menuTitle).apply {
                icon = Utils.getDrawable(context, "biliroaming_ic_search")
                setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                setOnMenuItemClickListener {
                    onSearchMenuClick()
                    true
                }
            }
            tintSearchMenu(searchMenu)
        }
    }

    fun tintSearchBar(garb: Garb = Themes.currentGarb()) {
        if (!showSearchBar) return
        searchBar.tintKeywordInput(garb)
        searchBar.tintClearButton(garb)
    }

    fun tintSearchMenu(menu: MenuItem? = null, garb: Garb = Themes.currentGarb()) {
        if (!showSearchMenu) return
        val searchMenu = menu ?: run {
            val menuId = Utils.getResId("biliroaming_menu_item_action_search", "id")
            toolbar.menu.findItem(menuId)
        } ?: return
        val searchMenuIcon = searchMenu.icon ?: return
        val newIcon = searchMenuIcon.mutate()
        if (!garb.isPure && !garb.isPrimaryOnly) {
            newIcon.setTint(garb.fontColor)
        } else if (garb.id.let { it != 1L && it != 8L }) {
            newIcon.setTint(Color.WHITE)
        } else {
            newIcon.setTint(Utils.getColor(context, "theme_color_primary_tr_icon"))
        }
        searchMenu.icon = newIcon
    }
}
