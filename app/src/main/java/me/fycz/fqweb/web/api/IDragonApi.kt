package me.fycz.fqweb.web.api

import xyz.fycz.micat.hook.com.dragon.read.web.ReturnData
import me.fycz.fqweb.web.api.annotation.DragonGet

/**
 * @author fengyue
 * @date 2023/5/30 10:27
 * @description
 */
interface IDragonApi {
    @DragonGet("")
    fun searchTab(parameters: Map<String, List<String>>): ReturnData
}